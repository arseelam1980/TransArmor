//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 12:18:26 PM EDT 
//


package com.rsa.transarmor.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkSvcPvdrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChkSvcPvdrType">
 *   &lt;restriction base="{com/firstdata/Merchant/gmfV3.10}Max12AN">
 *     &lt;enumeration value="TeleCheck"/>
 *     &lt;enumeration value="TeleCheckECA"/>
 *     &lt;enumeration value="Certegy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChkSvcPvdrType")
@XmlEnum
public enum ChkSvcPvdrType {

    @XmlEnumValue("TeleCheck")
    TELE_CHECK("TeleCheck"),
    @XmlEnumValue("TeleCheckECA")
    TELE_CHECK_ECA("TeleCheckECA"),
    @XmlEnumValue("Certegy")
    CERTEGY("Certegy");
    private final String value;

    ChkSvcPvdrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChkSvcPvdrType fromValue(String v) {
        for (ChkSvcPvdrType c: ChkSvcPvdrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
