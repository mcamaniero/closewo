package com.ec.tvcable.workorder.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.ec.tvcable.workorder.TaskList;
import com.ec.tvcable.workorder.AdditionalAttribute;
import com.ec.tvcable.workorder.Item;
import com.ec.tvcable.workorder.WorkOrderItem;

public class CloseWorkOrderItem {
	private List<TaskList> taskLists;
	private List<AdditionalAttribute> additionalAttributes;
	private List<Item> items;
	private WorkOrderItem workOrderItem;
	
	
	public CloseWorkOrderItem(WorkOrderItem workOrderItemParameter){
		workOrderItem = workOrderItemParameter;
		taskLists =  new ArrayList<TaskList>();
		additionalAttributes = new ArrayList<AdditionalAttribute>();
		items = new ArrayList<Item>();
	}
	
	public List<Item> getItems(int index){
		return taskLists.get(index).getInventory().getItems().getValue().getItem();
	}

	public void processTask(){	
		for(TaskList taskListTMP : workOrderItem.getTasks().getTask()){
				taskLists.add(taskListTMP);
		}	
	}
	
	public void processAttribute(){
		for(TaskList attributesTMP : taskLists){
			additionalAttributes.addAll(attributesTMP.getAttributes().getAttribute());
		}
	}
	
	public void processItem(){
		for (TaskList itemTMP : taskLists){
			items.addAll(itemTMP.getInventory().getItems().getValue().getItem());
		}
	}
	
	public String getTaskId(){
		String idTask = new String();
		for(TaskList taskList : taskLists){
			idTask = taskList.getTaskId();
		}
		return idTask;
	}
	
	public String getTaskId(int index){
		String idTask = new String();		
		idTask = taskLists.get(index).getTaskId() ;
		return idTask;
	}
	
	public String getCparty(){
		String cparty = new String();
			
		for(TaskList parametro : taskLists){
			cparty = parametro.getCustomer().getValue().getCustomerId();
		}
		return cparty;
	}
	
	public String getCparty(int index){
		String cparty = new String();
		cparty = taskLists.get(index).getCustomer().getValue().getCustomerId();
		return cparty;
	}
	
	public String getAccount(){
		String account =new  String();
		
		for(AdditionalAttribute parametro : additionalAttributes){
			account = parametro.getName();
		}
		return account;
	}
	
	public String getAccount(int index){
		String account =new  String();
		account = additionalAttributes.get(index).getName();
		return account;
	}
	
	public Date getProcessDateCreation(){
		Date date = new Date();
		for(TaskList parametro : taskLists){
			date = parametro.getRealizationInterval().getDateFrom().toGregorianCalendar().getTime();
		}
		return date;
	}
	
	public Date getProcessDateCreation(int index){
		Date date = new Date();
		date = taskLists.get(index).getRealizationInterval().getDateFrom().toGregorianCalendar().getTime();
		return date;
	}
	
	public String getLongitude(){
		String longitude = new String();
			
		for(TaskList parametro : taskLists){
			longitude = parametro.getCustomer().getValue().getLocation().getValue().getLongitude().toString();
		}
		return longitude;
	}
	
	public String getLongitude(int index){
		String longitude = new String();
		longitude = taskLists.get(index).getCustomer().getValue().getLocation().getValue().getLongitude().toString();
		return longitude;
	}
	
	public String getLatitude(){
		String latitude = new String();
			
		for(TaskList parametro : taskLists){
			latitude = parametro.getCustomer().getValue().getLocation().getValue().getLongitude().toString();
		}
		return latitude;
	}
	
	public String getLatitude(int index){
		String latitude = new String();
		latitude = taskLists.get(index).getCustomer().getValue().getLocation().getValue().getLongitude().toString();
		return latitude;
	}

	public String getExecutor(){
		String executor = new String();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getExecutor().getExecutorId();
		}
		return executor;
	}
	
	public String getExecutor(int index){
		String executor = new String();
		executor = taskLists.get(index).getExecutor().getExecutorId();
		return executor;
	}
	
	public Date getDateFrom(){
		Date executor = new Date();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getRealizationInterval().getDateFrom().toGregorianCalendar().getTime();
		}
		return executor;
	}
	
	public Date getDateFrom(int index){
		Date executor = new Date();
		executor = taskLists.get(index).getRealizationInterval().getDateFrom().toGregorianCalendar().getTime();
		return executor;
	}
	
	public Date getDateto(){
		Date executor = new Date();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getRealizationInterval().getDateTo().toGregorianCalendar().getTime();
		}
		return executor;
	}
	
	public Date getDateto(int index){
		Date executor = new Date();
		executor = taskLists.get(index).getRealizationInterval().getDateTo().toGregorianCalendar().getTime();
		return executor;
	}
		
	public String getNodeId(){
		String executor = new String();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getInventory().getNode().getValue().getNodeId();
		}
		return executor;
	}
	
	public String getNodeId(int index){
		String executor = new String();
		executor = taskLists.get(index).getInventory().getNode().getValue().getNodeId();
		return executor;
	}
	
	public String getCitemId(){
		String dato = new String();
		
		for(Item parametro : items){
			dato = parametro.getItemKey().getItemId();
		}
		
		return dato;
	}

	public String getCitemId(int index){
		String dato = new String();
		dato = items.get(index).getItemKey().getItemId();		
		return dato;
	}

	public String getCitemClass(){
		String dato = new String();
			
		for(Item parametro : items){
			dato = parametro.getItemKey().getItemClass();
		}
		return dato;
	}
	
	public String getCitemClass(int index){
		String dato = new String();
		dato = items.get(index).getItemKey().getItemClass();
		return dato;
	}
	
	public String getCitemType(){
		String dato = new String();
			
		for(Item parametro : items){
			dato = parametro.getItemKey().getItemType();
		}
		return dato;
	}		
	
	public String getCitemType(int index){
		String dato = new String();
		dato = items.get(index).getItemKey().getItemType();
		return dato;
	}
		
	public String getStatus(){
		String dato = new String();
		for(Item parametro : items){
			dato = parametro.getStatus();
		}
		return dato;
	}
	
	public String getStatus(int index){
		String dato = new String();
		dato = items.get(index).getStatus();
		return dato;
	}
	
	public int getItemSize(){
		return items.size();
	}
	
	public int getTaskSize(){
		return taskLists.size();
	}
	
	public int getAdditionalAttributesSize(){
		return additionalAttributes.size();
	}
}
