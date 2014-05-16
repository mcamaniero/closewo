package com.ec.tvcable.workorder.bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.ec.tvcable.workorder.jpa.Ytbl_Response_CloseWorkOrder;
import com.ec.tvcable.workorder.servicio.InterfaceResponseCWO;

@Service(InterfaceResponseCWO.class)
public class TransactionResponseCWO implements InterfaceResponseCWO {

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveResponse(Ytbl_Response_CloseWorkOrder response) {
		em.persist(response);

	}

}
