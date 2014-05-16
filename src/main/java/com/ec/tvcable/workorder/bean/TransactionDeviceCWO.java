package com.ec.tvcable.workorder.bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.ec.tvcable.workorder.jpa.Ytbl_Device;
import com.ec.tvcable.workorder.servicio.InterfaceDevice;

@Service(InterfaceDevice.class)
public class TransactionDeviceCWO implements InterfaceDevice {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveDevice(Ytbl_Device parameter) {
		em.persist(parameter);

	}

}
