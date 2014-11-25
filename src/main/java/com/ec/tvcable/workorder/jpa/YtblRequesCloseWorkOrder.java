package com.ec.tvcable.workorder.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "YTBL_REQUESTS_CLOSEWORKORDER")
public class YtblRequesCloseWorkOrder {
	
	@Id
	@SequenceGenerator(name = "YSEQCLOSEWORKORDER", sequenceName = "YSEQCLOSEWORKORDER", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "YSEQCLOSEWORKORDER")
	private Integer id;
	
	@Column(name = "sourcesystem")
	private String sourceSystem;
	
	@Column(name = "processid")
	private Integer processId;
	
	@Column(name = "cparty_id")
	private Integer cpartyId;
	
	@Column(name = "account_id")
	private Integer accountId;
	
	@Column(name = "processcreationdate")
	private Date processCreationDate;
	
	@Column(name = "ordertype")
	private String orderType;
	
	@Column(name = "ordertechnology")
	private String orderTechnology;
	
	@Column(name = "locationid")
	private Integer locationId;
	
	@Column(name = "provinceid")
	private Integer provinceId;
	
	@Column(name = "provincename")
	private String provinceName;
	
	@Column(name = "sectorid")
	private Integer sectorId;
	
	@Column(name = "sectorname")
	private String sectorName;
	
	@Column(name = "zonaid")
	private Integer zonaId;
	
	@Column(name = "zonaname")
	private String zonaName;
	
	@Column(name = "cityid")
	private String cityId;
	
	@Column(name = "cityname")
	private String cityName;
	
	@Column(name = "streetid")
	private Integer streetId;
	
	@Column(name = "streetname")
	private String streetName;
	
	@Column(name = "subsector")
	private Integer subSector;
	
	@Column(name = "subsectorname")
	private String subSectorName;
	
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
	
	@Column(name = "datefrom")
	private Date dateFrom;
	
	@Column(name = "dateto")
	private Date dateTo;
	
	@Column(name = "processsignature")
	private String processSignature;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "tipo_envio")
	private String tipoEnvio;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "node_id")
	private String nodeId;
	
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "update_date")
	private Date updateDate;
	
	@Column(name = "errordetail")
	private String errorDetail;
	
	@Column(name = "vdatefrom")
	private String vDateFrom;
	
	@Column(name = "vdateto")
	private String vDateTo;
	
	@Column(name = "workorderid")
	private String workOrderId;
	
	@Column(name = "task_id")
	private String taskId;
	
	@Column(name = "motivo_orden")
	private String motivoOrden;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	
	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
	
	public Integer getCpartyId() {
		return cpartyId;
	}

	public void setCpartyId(Integer cpartyId) {
		this.cpartyId = cpartyId;
	}
	
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Date getProcessCreationDate() {
		return processCreationDate;
	}

	public void setProcessCreationDate(Date processCreationDate) {
		this.processCreationDate = processCreationDate;
	}
	
	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	public String getOrderTechnology() {
		return orderTechnology;
	}

	public void setOrderTechnology(String orderTechnology) {
		this.orderTechnology = orderTechnology;
	}
	
	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	
	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	public Integer getSectorid() {
		return sectorId;
	}

	public void setSectorid(Integer sectorId) {
		this.sectorId = sectorId;
	}
	
	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	
	public Integer getZonaId() {
		return zonaId;
	}

	public void setZonaId(Integer zonaId) {
		this.zonaId = zonaId;
	}
	
	public String getZonaName() {
		return zonaName;
	}

	public void setZonaName(String zonaName) {
		this.zonaName = zonaName;
	}
	
	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Integer getStreetId() {
		return streetId;
	}

	public void setStreetId(Integer streetId) {
		this.streetId = streetId;
	}
	
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public Integer getSubSector() {
		return subSector;
	}

	public void setSubSector(Integer subSector) {
		this.subSector = subSector;
	}
	
	public String getSubSectorName() {
		return subSectorName;
	}

	public void setSubSectorName(String subSectorName) {
		this.subSectorName = subSectorName;
	}
	
	public String getBuildIngno() {
		return buildIngno;
	}

	public void setBuildIngno(String buildIngno) {
		this.buildIngno = buildIngno;
	}
	
	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	
	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	
	public String getPhoneNumber3() {
		return phoneNumber3;
	}

	public void setPhoneNumber3(String phoneNumber3) {
		this.phoneNumber3 = phoneNumber3;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getcontactsContact() {
		return contactsContact;
	}

	public void setcontactsContact(String contactsContact) {
		this.contactsContact = contactsContact;
	}
	
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	public String getContactValue() {
		return contactValue;
	}

	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}
	
	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}
	
	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	
	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	
	public String getProcessSignature() {
		return processSignature;
	}

	public void setProcessSignature(String processSignature) {
		this.processSignature = processSignature;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public String getErrorDetail() {
		return errorDetail;
	}

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	
	public String getvDateFrom() {
		return vDateFrom;
	}

	public void setvDateFrom(String vDateFrom) {
		this.vDateFrom = vDateFrom;
	}
	
	public String getvDateTo() {
		return vDateTo;
	}

	public void setvDateTo(String vDateTo) {
		this.vDateTo = vDateTo;
	}
	
	public String getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getMotivoOrden() {
		return motivoOrden;
   }

   public void setMotivoOrden(String motivoOrden) {
	   this.motivoOrden = motivoOrden;
  }
	

}
