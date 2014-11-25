package com.ec.tvcable.workorder.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.xml.datatype.XMLGregorianCalendar;

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
	
	public String getTaskId(int index) throws Exception{
		String idTask = new String();
		try{
			idTask = taskLists.get(index).getTaskId() ;
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getTaskId(int): "+e.toString());
		}
		return idTask;
	}
	
	public Date getFinishDate(int index) throws Exception{
		XMLGregorianCalendar finishDateXML;
		try{
			finishDateXML = taskLists.get(index).getFinishDate();
			
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getFinishDate(int): "+e.toString());
		}
		return toDate(finishDateXML);
	}
	
	public Date getRealFinishDate(int index) throws Exception{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS z");
		try{
			for (AdditionalAttribute additionalAttributeIterator : taskLists.get(index).getAttributes().getAttribute())
			{
				if (additionalAttributeIterator.getName().equals("REAL_END_DATE"))
				{
					return stringToXMLGregorianCalendar(additionalAttributeIterator.getFriendlyValue(),dateFormat);
				}
			}
			
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getRealFinishDate(int): "+e.toString());
		}
		return null;
	}
	
    private static Date stringToXMLGregorianCalendar(String datetime, SimpleDateFormat sdf) 
    {
        try 
        {
        	Date date = sdf.parse(datetime);
            return date;
        } catch (Exception e) {
            return null;
        }
    }

	
	public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }


	public String getCparty() {
		String cparty = new String();
		
		for(TaskList parametro : taskLists){
			cparty = parametro.getCustomer().getValue().getCustomerId();
		}
		return cparty;
	}
	
	public String getCparty(int index) throws Exception{
		String cparty = new String();
		try{
			cparty = taskLists.get(index).getCustomer().getValue().getCustomerId();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getCparty(int): "+e.toString());
		}

		return cparty;
	}
	
	public String getAccount(){
		String account =new  String();
		
		for(AdditionalAttribute parametro : additionalAttributes){
			account = parametro.getName();
		}
		return account;
	}
	
	public String getAccount(int index) throws Exception{
		String account =new  String();
		try{
			account = additionalAttributes.get(index).getName();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getAccount(int): "+e.toString());
		}

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
	
	public String getLongitude(int index) throws Exception{
		String longitude = new String();
		try{
			longitude = taskLists.get(index).getCustomer().getValue().getLocation().getValue().getLongitude().toString();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getLongitude(int): "+e.toString());
		}

		return longitude;
	}
	
	public String getLatitude(){
		String latitude = new String();
			
		for(TaskList parametro : taskLists){
			latitude = parametro.getCustomer().getValue().getLocation().getValue().getLongitude().toString();
		}
		return latitude;
	}
	
	public String getLatitude(int index) throws Exception{
		String latitude = new String();
		try{
			latitude = taskLists.get(index).getCustomer().getValue().getLocation().getValue().getLongitude().toString();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getLatitude(int): "+e.toString());
		}

		return latitude;
	}

	public String getExecutor(){
		String executor = new String();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getExecutor().getExecutorId();
		}
		return executor;
	}
	
	public String getExecutor(int index) throws Exception{
		String executor = new String();
		try{
			executor = taskLists.get(index).getExecutor().getExecutorId();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getExecutor(String): "+e.toString());
		}

		return executor;
	}
	
	public Date getDateFrom(){
		Date executor = new Date();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getRealizationInterval().getDateFrom().toGregorianCalendar().getTime();
		}
		return executor;
	}
	
	public Date getDateFrom(int index) throws Exception{
		Date executor = new Date();
		try{
			executor = taskLists.get(index).getRealizationInterval().getDateFrom().toGregorianCalendar().getTime();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getDateFrom(int): "+e.toString());
		}

		return executor;
	}
	
	public Date getDateto(){
		Date executor = new Date();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getRealizationInterval().getDateTo().toGregorianCalendar().getTime();
		}
		return executor;
	}
	
	public Date getDateto(int index) throws Exception{
		Date executor = new Date();
		try{
			executor = taskLists.get(index).getRealizationInterval().getDateTo().toGregorianCalendar().getTime();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getDateto(int): "+e.toString());
		}

		return executor;
	}
		
	public String getNodeId(){
		String executor = new String();
			
		for(TaskList parametro : taskLists){
			executor = parametro.getInventory().getNode().getValue().getNodeId();
		}
		return executor;
	}
	
	public String getNodeId(int index) throws Exception{
		String executor = new String();
		try{
			executor = taskLists.get(index).getInventory().getNode().getValue().getNodeId();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getNodeId(int): "+e.toString());
		}

		return executor;
	}
	
	public String getCitemId(){
		String dato = new String();
		
		for(Item parametro : items){
			dato = parametro.getItemKey().getItemId();
		}
		
		return dato;
	}

	public String getCitemId(int index) throws Exception{
		String dato = new String();
		try{
			dato = items.get(index).getItemKey().getItemId();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getCitemId(int): "+e.toString());
		}

		return dato;
	}

	public String getCitemClass(){
		String dato = new String();
			
		for(Item parametro : items){
			dato = parametro.getItemKey().getItemClass();
		}
		return dato;
	}
	
	public String getCitemClass(int index) throws Exception{
		String dato = new String();
		try{
			dato = items.get(index).getItemKey().getItemClass();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getCitemClass(int): "+e.toString());
		}

		return dato;
	}
	
	public String getCitemType(){
		String dato = new String();
			
		for(Item parametro : items){
			dato = parametro.getItemKey().getItemType();
		}
		return dato;
	}		
	
	public String getCitemType(int index) throws Exception{
		String dato = new String();
		try{
			dato = items.get(index).getItemKey().getItemType();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getCitemType(int): "+e.toString());
		}

		return dato;
	}
		
	public String getStatus(){
		String dato = new String();
		for(Item parametro : items){
			dato = parametro.getStatus();
		}
		return dato;
	}
	
	public String getStatus(int index) throws Exception{
		String dato = new String();
		try{
			dato = items.get(index).getStatus();
		}
		catch(NullPointerException e){
			return null;
		}
		catch (Exception e){
			throw new Exception("CloseWorkOrderItem.getStatus(int): "+e.toString());
		}

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
	
	public String getMotivoOrden(int index) throws Exception{
		  String motivoOrden = new String();
		  try{
		   for(AdditionalAttribute attribute : taskLists.get(index).getAttributes().getAttribute() )
		   {
		    if (attribute.getName().equals("CAUSE_OF_FAILURE_FOR_SERVICE_CALL"))
		     motivoOrden = attribute.getFriendlyValue();    
		   }   
		  }
		  catch(NullPointerException e){
		   return null;
		  }
		  catch (Exception e){
		   throw new Exception("CloseWorkOrderItem.getMotivoOrden(int): "+e.toString());
		  }

		  return motivoOrden;
		 }
}
