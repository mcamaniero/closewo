package com.ec.tvcable.workorder.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import com.ec.tvcable.workorder.FSMIntegrationEndpoint;
import com.ec.tvcable.workorder.Item;
import com.ec.tvcable.workorder.ItemKey;
import com.ec.tvcable.workorder.Result;
import com.ec.tvcable.workorder.WorkOrderItem;
import com.ec.tvcable.workorder.bean.JaxbConverter;
import com.ec.tvcable.workorder.jpa.YtblRequesCloseWorkOrder;
import com.ec.tvcable.workorder.jpa.Ytbl_Device;
import com.ec.tvcable.workorder.jpa.Ytbl_Materials;
import com.ec.tvcable.workorder.jpa.Ytbl_Response_CloseWorkOrder;
import com.ec.tvcable.workorder.servicio.CloseWorkOrderItem;
import com.ec.tvcable.workorder.servicio.InterfaceDevice;
import com.ec.tvcable.workorder.servicio.InterfaceMaterials;
import com.ec.tvcable.workorder.servicio.InterfaceResponseCWO;
import com.ec.tvcable.workorder.servicio.InterfaceWorkCloseOrder;

@Service(FSMIntegrationEndpoint.class)
public class FSMIntegrationEndpointBean implements FSMIntegrationEndpoint {

	@Reference
	@Inject
	private InterfaceWorkCloseOrder interfaceWorkCloseOrder;

	@Reference
	@Inject
	private InterfaceDevice interfaceDevice;

	@Reference
	@Inject
	private InterfaceMaterials interfaceMaterials;

	@Reference
	@Inject
	private InterfaceResponseCWO interfaceResponseCWO;

	private Result updateWorkOrderResponse;
	private WorkOrderItem workOrderItem;
	private YtblRequesCloseWorkOrder ytblRequestCloseWorkOrder;
	private CloseWorkOrderItem closeWorkorderItem;

	private String sourceSystem = new String();
	private String processId = new String();
	private String processSignature = new String();
	private String workOrderId = new String();
	private String taskNumber = new String();
	private String status = new String();
	private int maxIndex;
	

	@Override
	public Result closeWorkOrder(WorkOrderItem workorderItemParameters) {
		System.out.println("closeWorkOrder");
		updateWorkOrderResponse = new Result();
		workOrderItem = workorderItemParameters;

		try {
			closeWorkorderItem = new CloseWorkOrderItem(workOrderItem);
			closeWorkorderItem.processTask();

			saveCloseWorkorders();

			saveResponseData("0", "Request successfully processed");
			System.out.println("Request successfully processed");

		} catch (Exception e) {
			saveResponseData("1", e.toString());
			e.printStackTrace();
			System.out.println("Error: " + e.toString());
		}
		saveResponse();
		return updateWorkOrderResponse;
	}

	private void saveCloseWorkorders() throws Exception {
		int i;

		try {
			sourceSystem = workOrderItem.getSourceSystem();
			processId = workOrderItem.getProcessId();
			processSignature = workOrderItem.getProcessSignature();
			workOrderId = workOrderItem.getWorkOrderId();
			status = workOrderItem.getStatus();
			taskNumber = getLastTask();

			for (i = 0; i < closeWorkorderItem.getTaskSize(); i++) {
				saveCloseWorkOrder(i);
			}
		} catch (Exception e) {
			throw new Exception("WorkOrderBean.saveCloseWorkorders(): "
					+ e.toString());
		}
	}
	
	private String getLastTask() throws Exception{
		int numberTemp;
		int yearTemp;
		int numberMax = 0;
		int yearMax = 0;
		int flag = 0;
		int indexOf;
		String taskTemp;
		try {
			for (int i = 0; i < closeWorkorderItem.getTaskSize(); i++) {
				taskTemp = closeWorkorderItem.getTaskId(i).replace("TASK/", "");
				indexOf = taskTemp.indexOf("/");
				numberTemp = Integer.parseInt(taskTemp.substring(0, indexOf));
				yearTemp = Integer.parseInt(taskTemp.substring(indexOf+1));
				if (yearTemp > yearMax)
				{
					yearMax = yearTemp;
					numberMax = numberTemp;
					flag = i;
				}
				else if (yearTemp == yearMax) 
				{
					if (numberTemp >= numberMax)
					{
						numberMax = numberTemp;
						flag = i;
					}					
				}
			}
			System.out.println("Tarea Principal: "+closeWorkorderItem.getTaskId(flag));
			return closeWorkorderItem.getTaskId(flag);
			
		} catch (Exception e) {
			throw new Exception(
					"FSMIntegrationEndpointBean.getLastTask(): No puede obtener TaskId: "+ e.toString());
		}
	}

	private void saveCloseWorkOrder(int index) throws Exception {
		ytblRequestCloseWorkOrder = new YtblRequesCloseWorkOrder();
		try {
			ytblRequestCloseWorkOrder.setSourceSystem(sourceSystem);
			ytblRequestCloseWorkOrder.setProcessId(Integer.parseInt(processId));
			ytblRequestCloseWorkOrder.setProcessSignature(processSignature);
			ytblRequestCloseWorkOrder.setWorkOrderId(workOrderId);
			// workOrderURL
			ytblRequestCloseWorkOrder.setState(status);
			ytblRequestCloseWorkOrder.setTipoEnvio("3");
			ytblRequestCloseWorkOrder.setTaskId(closeWorkorderItem
					.getTaskId(index));
			ytblRequestCloseWorkOrder.setCpartyId(Integer
					.parseInt(closeWorkorderItem.getCparty(index)));
			// ytblRequestCloseWorkOrder.setAccountId(Integer.parseInt(closeWorkorderItem.getAccount(index)));
			ytblRequestCloseWorkOrder.setProcessCreationDate(new Date());
			ytblRequestCloseWorkOrder.setLongitude(closeWorkorderItem
					.getLongitude(index));
			ytblRequestCloseWorkOrder.setLatitude(closeWorkorderItem
					.getLatitude(index));
			ytblRequestCloseWorkOrder.setExecutor(closeWorkorderItem
					.getExecutor(index));
			ytblRequestCloseWorkOrder.setDateFrom(closeWorkorderItem
					.getDateFrom(index));
			ytblRequestCloseWorkOrder.setDateTo(closeWorkorderItem
					.getDateto(index));
			ytblRequestCloseWorkOrder.setNodeId(closeWorkorderItem
					.getNodeId(index));
			ytblRequestCloseWorkOrder.setCreateDate(closeWorkorderItem.getFinishDate(index));
			ytblRequestCloseWorkOrder.setUpdateDate(closeWorkorderItem.getRealFinishDate(index));
			
			ytblRequestCloseWorkOrder.setMotivoOrden(closeWorkorderItem
				     .getMotivoOrden(index));

			interfaceWorkCloseOrder.saveYtblRequest(ytblRequestCloseWorkOrder);
			saveDevicesMaterials(index);
		} catch (Exception e) {
			throw new Exception("WorkOrderBean.saveCloseWorkOrder(int): "
					+ e.toString());
		}

	}

	private void saveDevicesMaterials(int index) throws Exception {
		if (maxIndex == index) {

			try {
				for (Item itemIterator : closeWorkorderItem.getItems(index)) {
					
					System.out.println("Ingreso Principal: "+taskNumber);
					if (itemIterator.getItemKey().getItemClass().toUpperCase()
							.equals("EQUIPMENT")) 
						saveDevice(itemIterator, taskNumber);
					 else if (itemIterator.getItemKey().getItemClass()
							.toUpperCase().equals("MATERIAL")) 
						saveMaterial(itemIterator, taskNumber);
					
				}
			} catch (NullPointerException npe) {
				System.out.println("Tarea: "+taskNumber+" sin Items");
			}
			catch (Exception e) {
				throw new Exception("WorkOrderBean.saveDevicesMaterials(int): "
						+ e.toString());
			}
		}
	}


	private void saveDevice(Item item, String taskId) throws Exception {
		Ytbl_Device ytblDevice = new Ytbl_Device();

		try {
			ytblDevice.setrequestId(ytblRequestCloseWorkOrder.getId());
			ytblDevice.setprocessId(Integer.parseInt(this.processId));
			ytblDevice.settaskId(taskId.toString());
			ytblDevice.setState(item.getStatus());
			ytblDevice.setcreateDate(new Date());
			ytblDevice.setresourceId(item.getItemKey().getItemId());
			
			try{
				for (ItemKey itemKey : item.getRelatedItems().getItemKey()) {
				if (itemKey.getItemClass().toUpperCase().equals("SERVICE"))
					ytblDevice.setcitemId(itemKey.getItemId());
				}
			} catch (Exception e) {
				System.out.println("No existe getRelatedItems");
			}
						
			interfaceDevice.saveDevice(ytblDevice);
		} catch (Exception e) {
			throw new Exception("WorkOrderBean.saveDevice(Item,String): "
					+ e.toString());
		}
	}

	public void saveMaterial(Item item, String taskId) throws Exception {
		Ytbl_Materials ytblMaterials = new Ytbl_Materials();

		try {
			ytblMaterials.setrequestId(ytblRequestCloseWorkOrder.getId());
			ytblMaterials.setprocessId(Integer.parseInt(this.processId));
			ytblMaterials.setworkOrderId(this.workOrderId);
			ytblMaterials.settaskId(taskId.toString());
			ytblMaterials.setcodeMaterial(getMaterialCode(item.getItemKey()
					.getItemType().toString()));
			ytblMaterials.setnumberMaterial(item.getQuantity().toString());
			ytblMaterials.setDescription(item.getItemKey()
					.getItemType().toString());
			interfaceMaterials.saveMaterials(ytblMaterials);
		} catch (Exception e) {
			throw new Exception("WorkOrderBean.saveMaterial(Item,String): "
					+ e.toString());
		}
	}

	public void saveResponse() {
		System.out.println("saveResponse");
		Ytbl_Response_CloseWorkOrder ytblResponseCloseWorkOrder = new Ytbl_Response_CloseWorkOrder();
		Calendar sysdate = new GregorianCalendar();
		ytblResponseCloseWorkOrder.setdateError(sysdate.getTime());
		ytblResponseCloseWorkOrder.setCode(updateWorkOrderResponse.getCode());
		ytblResponseCloseWorkOrder.setDescription(updateWorkOrderResponse
				.getDescription());
		ytblResponseCloseWorkOrder.setXMLRequest(JaxbConverter
				.objectToXMLString((workOrderItem)));
		ytblResponseCloseWorkOrder.setXMLResponse(JaxbConverter
				.objectToXMLString((updateWorkOrderResponse)));
		ytblResponseCloseWorkOrder.setOrderId(this.workOrderId);
		ytblResponseCloseWorkOrder.setProcessId(Integer.parseInt(this.processId));
		interfaceResponseCWO.saveResponse(ytblResponseCloseWorkOrder);
	}

	@Override
	public Result updateWorkOrder(WorkOrderItem parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	private void saveResponseData(String code, String description) {
		updateWorkOrderResponse.setCode(code);
		updateWorkOrderResponse.setDescription(description);
	}

	private String getMaterialCode(String material) {
		int inicio;
		int fin;

		inicio = material.indexOf('[');
		fin = material.indexOf(']');

		if (inicio > 1 && fin > 1)
			return material.substring(inicio+1, fin);
		else
			return "";
	}

}
