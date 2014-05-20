package com.ec.tvcable.workorder.bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.ec.tvcable.workorder.jpa.YtblRequesCloseWorkOrder;
import com.ec.tvcable.workorder.servicio.InterfaceWorkCloseOrder;

@Service(InterfaceWorkCloseOrder.class)
public class InterfaceWorkCloseOrderBean implements InterfaceWorkCloseOrder {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void saveYtblRequest(YtblRequesCloseWorkOrder parameter) {
	   em.persist(parameter);

	}

}
