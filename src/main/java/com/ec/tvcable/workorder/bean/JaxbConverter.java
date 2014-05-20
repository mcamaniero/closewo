package com.ec.tvcable.workorder.bean;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.jboss.logging.Logger;

/**
 * @author pablo
 *
 */
public class JaxbConverter {
	
	private static Logger logger = Logger.getLogger(FSMIntegrationEndpointBean.class);

	public static <T> String objectToXMLString(T object) {
		try {
			JAXBContext context = JAXBContext.newInstance(object.getClass());
			Marshaller marshaller = context.createMarshaller();
			StringWriter sw = new StringWriter();
			marshaller.marshal(object, sw);
			return sw.toString();
		} catch (JAXBException e) {
			logger.error(e);
			return null;
		}
	}



}
