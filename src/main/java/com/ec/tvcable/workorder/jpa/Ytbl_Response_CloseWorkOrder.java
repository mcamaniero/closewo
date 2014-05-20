package com.ec.tvcable.workorder.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ytbl_response_closeworkorder")
public class Ytbl_Response_CloseWorkOrder {
	
	@Id
	@SequenceGenerator(name = "YSEQREQUESTCLOSEWORKORDER", sequenceName = "YSEQREQUESTCLOSEWORKORDER", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "YSEQREQUESTCLOSEWORKORDER")
	private Integer id;
	
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name ="DATEERROR")
	private Date dateError;
	
	@Column(name = "xml_request")
	@Lob
	private String XMLRequest;
	
	@Column(name = "xml_response")
	@Lob
	private String XMLResponse;
	
	@Column(name = "taskid")
	private String taskId;
	
	@Column(name = "orderid")
	private String orderId;
	
	@Column(name = "processid")
	private Integer processId;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getdateError() {
		return dateError;
	}

	public void setdateError(Date dateError) {
		this.dateError = dateError;
	}
	
	public String getXMLRequest() {
		return XMLRequest;
	}

	public void setXMLRequest(String xMLRequest) {
		this.XMLRequest = xMLRequest;
	}
	
	public String getXMLResponse() {
		return XMLResponse;
	}

	public void setXMLResponse(String xMLResponse) {
		this.XMLResponse = xMLResponse;
	}
	
	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
