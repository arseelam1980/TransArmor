//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 12:18:26 PM EDT 
//


package com.rsa.transarmor.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmexGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmexGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AmExPOSData" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AmExTranID" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}GdSoldCd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmexGrp", propOrder = {
    "amExPOSData",
    "amExTranID",
    "gdSoldCd"
})
public class AmexGrp {

    @XmlElement(name = "AmExPOSData")
    protected String amExPOSData;
    @XmlElement(name = "AmExTranID")
    protected String amExTranID;
    @XmlElement(name = "GdSoldCd")
    protected String gdSoldCd;

    /**
     * Gets the value of the amExPOSData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmExPOSData() {
        return amExPOSData;
    }

    /**
     * Sets the value of the amExPOSData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmExPOSData(String value) {
        this.amExPOSData = value;
    }

    /**
     * Gets the value of the amExTranID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmExTranID() {
        return amExTranID;
    }

    /**
     * Sets the value of the amExTranID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmExTranID(String value) {
        this.amExTranID = value;
    }

    /**
     * Gets the value of the gdSoldCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdSoldCd() {
        return gdSoldCd;
    }

    /**
     * Sets the value of the gdSoldCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdSoldCd(String value) {
        this.gdSoldCd = value;
    }

}
