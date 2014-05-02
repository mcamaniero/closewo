
package com.ec.tvcable.workorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignedExecutor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignedExecutor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="executorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="executorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignedExecutor", propOrder = {
    "executorId",
    "executorName"
})
public class AssignedExecutor {

    @XmlElement(required = true)
    protected String executorId;
    @XmlElement(required = true)
    protected String executorName;

    /**
     * Gets the value of the executorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorId() {
        return executorId;
    }

    /**
     * Sets the value of the executorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutorId(String value) {
        this.executorId = value;
    }

    /**
     * Gets the value of the executorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorName() {
        return executorName;
    }

    /**
     * Sets the value of the executorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutorName(String value) {
        this.executorName = value;
    }

}
