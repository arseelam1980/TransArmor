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
 * <p>Java class for RespGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}RespCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AuthID" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AddtlRespData" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}SttlmDate" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AthNtwkID" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}ErrorData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespGrp", propOrder = {
    "respCode",
    "authID",
    "addtlRespData",
    "sttlmDate",
    "athNtwkID",
    "errorData"
})
public class RespGrp {

    @XmlElement(name = "RespCode")
    protected String respCode;
    @XmlElement(name = "AuthID")
    protected String authID;
    @XmlElement(name = "AddtlRespData")
    protected String addtlRespData;
    @XmlElement(name = "SttlmDate")
    protected String sttlmDate;
    @XmlElement(name = "AthNtwkID")
    protected String athNtwkID;
    @XmlElement(name = "ErrorData")
    protected String errorData;

    /**
     * Gets the value of the respCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCode(String value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the authID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthID() {
        return authID;
    }

    /**
     * Sets the value of the authID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthID(String value) {
        this.authID = value;
    }

    /**
     * Gets the value of the addtlRespData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRespData() {
        return addtlRespData;
    }

    /**
     * Sets the value of the addtlRespData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRespData(String value) {
        this.addtlRespData = value;
    }

    /**
     * Gets the value of the sttlmDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmDate() {
        return sttlmDate;
    }

    /**
     * Sets the value of the sttlmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmDate(String value) {
        this.sttlmDate = value;
    }

    /**
     * Gets the value of the athNtwkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthNtwkID() {
        return athNtwkID;
    }

    /**
     * Sets the value of the athNtwkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthNtwkID(String value) {
        this.athNtwkID = value;
    }

    /**
     * Gets the value of the errorData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorData() {
        return errorData;
    }

    /**
     * Sets the value of the errorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorData(String value) {
        this.errorData = value;
    }

}
