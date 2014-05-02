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
	
	

}
