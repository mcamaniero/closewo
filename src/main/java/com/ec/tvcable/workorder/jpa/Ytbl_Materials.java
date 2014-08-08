package com.ec.tvcable.workorder.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ytbl_materials")
public class Ytbl_Materials {
	
	@Id
	@SequenceGenerator(name = "YSEQMATERIALS", sequenceName = "YSEQMATERIALS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "YSEQMATERIALS")
	private Integer id;
	
	@Column(name = "REQUESTID")
	private Integer requestId;
	
	@Column(name = "PROCESSID")
	private Integer processId;
	
	@Column(name = "WORKORDERID")
	private String workOrderId;
	
	@Column(name = "TASK_ID")
	private String taskId;
	
	@Column(name = "CODE_MATERIAL")
	private String codeMaterial;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "NUMBER_MATERIAL")
	private String numberMaterial;
	
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
	
	public String getworkOrderId() {
		return workOrderId;
	}

	public void setworkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}
	
	public String gettaskId() {
		return taskId;
	}

	public void settaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getcodeMaterial() {
		return codeMaterial;
	}

	public void setcodeMaterial(String codeMaterial) {
		this.codeMaterial = codeMaterial;
	}
	
	public String getnumberMaterial() {
		return numberMaterial;
	}

	public void setnumberMaterial(String numberMaterial) {
		this.numberMaterial = numberMaterial;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
