//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 12:18:26 PM EDT 
//


package com.rsa.transarmor.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubFileTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubFileTypeType">
 *   &lt;restriction base="{com/firstdata/Merchant/gmfV3.10}Max10AN">
 *     &lt;enumeration value="BIN"/>
 *     &lt;enumeration value="RULES"/>
 *     &lt;enumeration value="RESTRCTION"/>
 *     &lt;enumeration value="SAF"/>
 *     &lt;enumeration value="PROMPT"/>
 *     &lt;enumeration value="PRODUCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubFileTypeType")
@XmlEnum
public enum SubFileTypeType {

    BIN,
    RULES,
    RESTRCTION,
    SAF,
    PROMPT,
    PRODUCT;

    public String value() {
        return name();
    }

    public static SubFileTypeType fromValue(String v) {
        return valueOf(v);
    }

}