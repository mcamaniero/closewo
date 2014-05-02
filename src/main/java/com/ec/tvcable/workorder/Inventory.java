
package com.ec.tvcable.workorder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node" type="{http://soap.integration.fsm.comarch.com/}node" minOccurs="0"/>
 *         &lt;element name="items" type="{http://soap.integration.fsm.comarch.com/}items" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventory", propOrder = {
    "node",
    "items"
})
public class Inventory {

    @XmlElementRef(name = "node", type = JAXBElement.class, required = false)
    protected JAXBElement<Node> node;
    @XmlElementRef(name = "items", type = JAXBElement.class, required = false)
    protected JAXBElement<Items> items;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Node }{@code >}
     *     
     */
    public JAXBElement<Node> getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Node }{@code >}
     *     
     */
    public void setNode(JAXBElement<Node> value) {
        this.node = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Items }{@code >}
     *     
     */
    public JAXBElement<Items> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Items }{@code >}
     *     
     */
    public void setItems(JAXBElement<Items> value) {
        this.items = value;
    }

}
