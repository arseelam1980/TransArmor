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
 * <p>Java class for CustInfoGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInfoGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AVSBillingAddr" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AVSBillingPostalCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CHFirstNm" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CHLastNm" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CHFullNmRes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfoGrp", propOrder = {
    "avsBillingAddr",
    "avsBillingPostalCode",
    "chFirstNm",
    "chLastNm",
    "chFullNmRes"
})
public class CustInfoGrp {

    @XmlElement(name = "AVSBillingAddr")
    protected String avsBillingAddr;
    @XmlElement(name = "AVSBillingPostalCode")
    protected String avsBillingPostalCode;
    @XmlElement(name = "CHFirstNm")
    protected String chFirstNm;
    @XmlElement(name = "CHLastNm")
    protected String chLastNm;
    @XmlElement(name = "CHFullNmRes")
    protected CHFullNmResType chFullNmRes;

    /**
     * Gets the value of the avsBillingAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSBillingAddr() {
        return avsBillingAddr;
    }

    /**
     * Sets the value of the avsBillingAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSBillingAddr(String value) {
        this.avsBillingAddr = value;
    }

    /**
     * Gets the value of the avsBillingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSBillingPostalCode() {
        return avsBillingPostalCode;
    }

    /**
     * Sets the value of the avsBillingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSBillingPostalCode(String value) {
        this.avsBillingPostalCode = value;
    }

    /**
     * Gets the value of the chFirstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHFirstNm() {
        return chFirstNm;
    }

    /**
     * Sets the value of the chFirstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHFirstNm(String value) {
        this.chFirstNm = value;
    }

    /**
     * Gets the value of the chLastNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHLastNm() {
        return chLastNm;
    }

    /**
     * Sets the value of the chLastNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHLastNm(String value) {
        this.chLastNm = value;
    }

    /**
     * Gets the value of the chFullNmRes property.
     * 
     * @return
     *     possible object is
     *     {@link CHFullNmResType }
     *     
     */
    public CHFullNmResType getCHFullNmRes() {
        return chFullNmRes;
    }

    /**
     * Sets the value of the chFullNmRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHFullNmResType }
     *     
     */
    public void setCHFullNmRes(CHFullNmResType value) {
        this.chFullNmRes = value;
    }

}