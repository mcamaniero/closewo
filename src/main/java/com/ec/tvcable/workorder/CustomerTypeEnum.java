
package com.ec.tvcable.workorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="customerTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDIVIDUAL"/>
 *     &lt;enumeration value="BUSINESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customerTypeEnum")
@XmlEnum
public enum CustomerTypeEnum {

    INDIVIDUAL,
    BUSINESS;

    public String value() {
        return name();
    }

    public static CustomerTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
