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
 * <p>Java class for DSGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DiscProcCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DiscPOSEntry" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DiscRespCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DiscPOSData" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DiscTransQualifier" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DiscNRID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSGrp", propOrder = {
    "discProcCode",
    "discPOSEntry",
    "discRespCode",
    "discPOSData",
    "discTransQualifier",
    "discNRID"
})
public class DSGrp {

    @XmlElement(name = "DiscProcCode")
    protected String discProcCode;
    @XmlElement(name = "DiscPOSEntry")
    protected String discPOSEntry;
    @XmlElement(name = "DiscRespCode")
    protected String discRespCode;
    @XmlElement(name = "DiscPOSData")
    protected String discPOSData;
    @XmlElement(name = "DiscTransQualifier")
    protected String discTransQualifier;
    @XmlElement(name = "DiscNRID")
    protected String discNRID;

    /**
     * Gets the value of the discProcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscProcCode() {
        return discProcCode;
    }

    /**
     * Sets the value of the discProcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscProcCode(String value) {
        this.discProcCode = value;
    }

    /**
     * Gets the value of the discPOSEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscPOSEntry() {
        return discPOSEntry;
    }

    /**
     * Sets the value of the discPOSEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscPOSEntry(String value) {
        this.discPOSEntry = value;
    }

    /**
     * Gets the value of the discRespCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscRespCode() {
        return discRespCode;
    }

    /**
     * Sets the value of the discRespCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscRespCode(String value) {
        this.discRespCode = value;
    }

    /**
     * Gets the value of the discPOSData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscPOSData() {
        return discPOSData;
    }

    /**
     * Sets the value of the discPOSData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscPOSData(String value) {
        this.discPOSData = value;
    }

    /**
     * Gets the value of the discTransQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscTransQualifier() {
        return discTransQualifier;
    }

    /**
     * Sets the value of the discTransQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscTransQualifier(String value) {
        this.discTransQualifier = value;
    }

    /**
     * Gets the value of the discNRID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscNRID() {
        return discNRID;
    }

    /**
     * Sets the value of the discNRID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscNRID(String value) {
        this.discNRID = value;
    }

}