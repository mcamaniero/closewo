
package com.ec.tvcable.workorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="activityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "activityTypeEnum")
@XmlEnum
public enum ActivityTypeEnum {

    A,
    S,
    R,
    T,
    C;

    public String value() {
        return name();
    }

    public static ActivityTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
