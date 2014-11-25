package com.ec.tvcable.workorder.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ytbl_requests")
@NamedQuery(name = "findByRequest", query = "select request from Ytbl_Request request where request.processId = :processId and request.cpartyId = :cpartyId")
public class Ytbl_Request{
	
	@Id
	private int id;
	
	@Column(name = "sourcesystem")
	private String sourceSystem;
	
	@Column(name = "processid")
	private int processId;
	
	@Column(name = "cparty_id")
	private int cpartyId;
	
	@Column(name = "account_id")
	private int accountId;
	
	@Column(name = "processcreationdate")
	private Date processCreationDate;
	
	@Column(name = "ordertype")
	private String orderType;
	
	@Column(name = "ordertechnology")
	private String orderTechnology;
	
	@Column(name = "locationid")
	private int locationId;
	
	@Column(name = "provinceid")
	private int provinceId;
	
	@Column(name = "provincename")
	private String provinceName;
	
	@Column(name = "sectorid")
	private int sectorId;
	
	@Column(name = "sectorname")
	private String sectorName;
	
	@Column(name = "zonaid")
	private int zonaId;
	
	@Column(name = "zonaname")
	private String zonaName;
	
	@Column(name = "cityid")
	private String cityId;
	
	@Column(name = "cityname")
	private String cityName;
	
	@Column(name = "streetid")
	private int streetId;
	
	@Column(name = "streetname")
	private String streetName;
	
	@Column(name = "buildingno")
	private String buildIngno;
	
	@Column(name = "flatno")
	private String flatNo;
	
	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "customerid")
	private String customerId;
	
	@Column(name = "customertype")
	private String customerType;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "businessname")
	private String businessName;
	
	@Column(name = "phonenumber1")
	private String phoneNumber1;
	
	@Column(name = "phonenumber2")
	private String phoneNumber2;
	
	@Column(name = "phonenumber3")
	private String phoneNumber3;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contacts_contact")
	private String contactsContact;
	
	@Column(name = "contact_name")
	private String contactName;
	
	@Column(name = "contact_value")
	private String contactValue;
	
	@Column(name = "executor")
	private String executor;
	
	@Column(name = "sla")
	private String sla;
	
	@Column(name = "datefrom")
	private Date dateFrom;
	
	@Column(name = "dateto")
	private Date dateTo;
	
	@Column(name = "tasktype")
	private String taskType;
	
	@Column(name = "skill")
	private String skill;
	
	@Column(name = "processsignature")
	private String processSignature;
	
	@Column(name = "rangestart")
	private Date rangeStart;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "tipo_envio")
	private String tipoEnvio;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "node_id")
	private String nodeId;
	
	@Column(name = "errordetail")
	private String errorDetail;
	
	@Column(name = "vdatefrom")
	private String vdatefrom;
	
	@Column(name = "vdateto")
	private String vdateto;
	
	@Column(name = "workorderid")
	private String workorderid;
	
	@Column(name = "updatew")
	private String updatew;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "attributename")
	private String attributename;
	
	@Column(name = "attributevalue")
	private String attributevalue;
	
	@Column(name = "subsectorid")
	private Integer subSectorId;
	
	@Column(name = "subsectorname", insertable = false, updatable = false)
	private String subSectorName;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getSourceSystem(){
		return sourceSystem;
	}
	
	public void setSourceSystem(String sourceSystem){
		this.sourceSystem = sourceSystem;
	}
	
	public int getProcessId(){
		return processId;
	}
	
	public void setProcessId(int processId){
		this.processId = processId;
	}
	
	public int getCpartyId(){
		return cpartyId;
	}
	
	public void setCpartyId(int cpartyId){
		this.cpartyId = cpartyId;
	}
	
	public int getAccountId(){
		return accountId;
	}
	
	public void setAccountId(int accountId){
		this.accountId = accountId;
	}
	
	public Date getProcessCreationDate(){
		return processCreationDate;
	}
	
	public void setProcessCreationDate(Date processCreationDate){
		this.processCreationDate = processCreationDate;
	}
	
	public String getOrderType(){
		return orderType;
	}
	
	public void setOrderType(String orderType){
		this.orderType = orderType;
	}
	
	public String getOrderTechnology(){
		return orderTechnology;
	}
	
	public void setOrderTechnology(String orderTechnology){
		this.orderTechnology = orderTechnology;
	}
	
	public int getLocationId(){
		return locationId;
	}
	
	public void setLocationId(int locationId){
		this.locationId = locationId;
	}
	
	public int getProvinceId(){
		return provinceId;
	}
	
	public void setProvinceId(int provinceId){
		this.provinceId = provinceId;
	}
	
	public String getProvinceName(){
		return provinceName;
	}
	
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	
	public int getSectorId(){
		return sectorId;
	}
	
	public void setSectorId(int sectorId){
		this.sectorId = sectorId;
	}
	
	public String getSectorName(){
		return sectorName;
	}
	
	public void setSectorName(String sectorName){
		this.sectorName = sectorName;
	}
	
	public int getzonaId(){
		return zonaId;
	}
	
	public void setzonaId(int zonaId){
		this.zonaId = zonaId;
	}
	
	public String getzonaName(){
		return zonaName;
	}
	
	public void setzonaName(String zonaName){
		this.zonaName = zonaName;
	}
	
	public String getcityId(){
		return cityId;
	}
	
	public void setcityId(String cityId){
		this.cityId = cityId;
	}
	
	public String getcityName(){
		return cityName;
	}
	
	public void setcityName(String cityName){
		this.cityName = cityName;
	}
	
	public int getstreetId(){
		return streetId;
	}
	
	public void setstreetId(int streetId){
		this.streetId = streetId;
	}
	
	public String getstreetName(){
		return streetName;
	}
	
	public void setstreetName(String streetName){
		this.streetName = streetName;
	}
	
	public String getbuildIngno(){
		return buildIngno;
	}
	
	public void setbuildIngno(String buildIngno){
		this.buildIngno = buildIngno;
	}
	
	public String getflatNo(){
		return flatNo;
	}
	
	public void setflatNo(String flatNo){
		this.flatNo = flatNo;
	}
	
	public String getLongitude(){
		return longitude;
	}
	
	public void setLongitude(String longitude){
		this.longitude = longitude;
	}
	
	public String getLatitude(){
		return latitude;
	}
	
	public void setLatitude(String latitude){
		this.latitude = latitude;
	}
	
	public String getcustomerId(){
		return customerId;
	}
	
	public void setcustomerId(String customerId){
		this.customerId = customerId;
	}
	
	public String getcustomerType(){
		return customerType;
	}
	
	public void setcustomerType(String customerType){
		this.customerType = customerType;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getbusinessName(){
		return businessName;
	}
	
	public void setbusinessName(String businessName){
		this.businessName = businessName;
	}
	
	public String getphoneNumber1(){
		return phoneNumber1;
	}
	
	public void setphoneNumber1(String phoneNumber1){
		this.phoneNumber1 = phoneNumber1;
	}
	
	public String getphoneNumber2(){
		return phoneNumber2;
	}
	
	public void setphoneNumber2(String phoneNumber2){
		this.phoneNumber2 = phoneNumber2;
	}
	
	public String getphoneNumber3(){
		return phoneNumber3;
	}
	
	public void setphoneNumber3(String phoneNumber3){
		this.phoneNumber3 = phoneNumber3;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getcontactsContact(){
		return contactsContact;
	}
	
	public void setcontactsContact(String contactsContact){
		this.contactsContact = contactsContact;
	}
	
	public String getcontactName(){
		return contactName;
	}
	
	public void setcontactName(String contactName){
		this.contactName = contactName;
	}
	
	public String getcontactValue(){
		return contactValue;
	}
	
	public void setcontactValue(String contactValue){
		this.contactValue = contactValue;
	}
	
	public String getExecutor(){
		return executor;
	}
	
	public void setExecutor(String executor){
		this.executor = executor;
	}
	
	public String getSla(){
		return sla;
	}
	
	public void setSla(String sla){
		this.sla = sla;
	}
	
	public Date getdatefrom(){
		return dateFrom;
	}
	
	public void setdatefrom(Date dateFrom){
		this.dateFrom = dateFrom;
	}
	
	public Date getdateTo(){
		return dateTo;
	}
	
	public void setdateTo(Date dateTo){
		this.dateTo = dateTo;
	}
	
	public String gettaskType(){
		return taskType;
	}
	
	public void settaskType(String taskType){
		this.taskType = taskType;
	}
	
	public String getSkill(){
		return skill;
	}
	
	public void setSkill(String skill){
		this.skill = skill;
	}
	
	public String getprocessSignature(){
		return processSignature;
	}
	
	public void setprocessSignature(String processSignature){
		this.processSignature = processSignature;
	}
	
	public Date getrangeStart(){
		return rangeStart;
	}
	
	public void setrangeStart(Date rangeStart){
		this.rangeStart = rangeStart;
	}
	
	public String getNote(){
		return note;
	}
	
	public void setNote(String note){
		this.note = note;
	}
	
	public String gettipoEnvio(){
		return tipoEnvio;
	}
	
	public void settipoEnvio(String tipoEnvio){
		this.tipoEnvio = tipoEnvio;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getnodeId(){
		return nodeId;
	}
	
	public void setnodeId(String nodeId){
		this.nodeId = nodeId;
	}
	
	public String geterrorDetail(){
		return errorDetail;
	}
	
	public void seterrorDetail(String errorDetail){
		this.errorDetail = errorDetail;
	}
	
	public String getvdatefrom(){
		return vdatefrom;
	}
	
	public void setvdatefrom(String vdatefrom){
		this.vdatefrom = vdatefrom;
	}
	
	public String getvdateto(){
		return vdateto;
	}
	
	public void setvdateto(String vdateto){
		this.vdateto = vdateto;
	}
	
	public String getworkorderid(){
		return workorderid;
	}
	
	public void setworkorderid(String workorderid){
		this.workorderid = workorderid;
	}
	
	public String getupdatew(){
		return updatew;
	}
	
	public void setupdatew(String updatew){
		this.updatew = updatew;
	}
	
	public String getdescription(){
		return description;
	}
	
	public void setdescription(String description){
		this.description = description;
	}
	
	public String getattributename(){
		return attributename;
	}
	
	public void setattributename(String attributename){
		this.attributename = attributename;
	}
	
	public String getattributevalue(){
		return attributevalue;
	}
	
	public void setattributevalue(String attributevalue){
		this.attributevalue = attributevalue;
	}
	
	public Integer getsubSectorId(){
		return subSectorId;
	}
	
	public void setsubSectorId(Integer subSectorId){
		this.subSectorId = subSectorId;
	}
	
	public String getsubSectorName(){
		return subSectorName;
	}
	
	public void setsubSectorName(String subSectorName){
		this.subSectorName = subSectorName;
	}
}
