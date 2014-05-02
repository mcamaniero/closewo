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
@Table(name = "ytbl_devices")
public class Ytbl_Device {
	
	@Id
	@SequenceGenerator(name = "YSEQDEVICES", sequenceName = "YSEQDEVICES", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "YSEQDEVICES")
	private Integer id;
	
	@Column(name = "REQUEST_ID")
	private Integer requestId;
	
	@Column(name = "PROCESSID")
	private Integer processId;
	
	@Column(name = "TASK_ID")
	private String taskId;
	
	@Column(name = "CITEM_ID")
	private String citemId;
	
	@Column(name = "RESOURCE_ID")
	private String resourceId;
	
	@Column(name = "SERIALNUMBER")
	private String serialNumber;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@Column(name = "UPDATE_DATE")
	private Date updateDate;
	
	@Column(name = "WORKORDER_ID")
	private Integer workOrderId;
	
	@Column(name = "MACADDRESS")
	private String macAddress;
	
	@Column(name = "MACADDRESS2")
	private String macAddress2;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getrequestId() {
		return requestId;
	}

	public void setrequestId(Integer requestId) {
		this.requestId = requestId;
	}
	
	public Integer getprocessId() {
		return processId;
	}

	public void setprocessId(Integer processId) {
		this.processId = processId;
	}
	
	public String gettaskId() {
		return taskId;
	}

	public void settaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getcitemId() {
		return citemId;
	}

	public void setcitemId(String citemId) {
		this.citemId = citemId;
	}
	
	public String getresourceId() {
		return resourceId;
	}

	public void setresourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	
	public String getserialNumber() {
		return serialNumber;
	}

	public void setserialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Date getcreateDate() {
		return createDate;
	}

	public void setcreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Date getupdateDate() {
		return updateDate;
	}

	public void setupdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public Integer getworkOrderId() {
		return workOrderId;
	}

	public void setworkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}
	
	public String getmacAddress() {
		return macAddress;
	}

	public void setmacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	public String getmacAddress2() {
		return macAddress2;
	}

	public void setmacAddress2(String macAddress2) {
		this.macAddress2 = macAddress2;
	}

}
