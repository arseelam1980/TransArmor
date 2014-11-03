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
 * <p>Java class for EMVGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMVGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}EMVData" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CardSeqNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}XCodeResp" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}ServCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}AppExpDate" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CARC" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}ProcInd" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}ProcInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMVGrp", propOrder = {
    "emvData",
    "cardSeqNum",
    "xCodeResp",
    "servCode",
    "appExpDate",
    "carc",
    "procInd",
    "procInfo"
})
public class EMVGrp {

    @XmlElement(name = "EMVData")
    protected String emvData;
    @XmlElement(name = "CardSeqNum")
    protected String cardSeqNum;
    @XmlElement(name = "XCodeResp")
    protected String xCodeResp;
    @XmlElement(name = "ServCode")
    protected String servCode;
    @XmlElement(name = "AppExpDate")
    protected String appExpDate;
    @XmlElement(name = "CARC")
    protected String carc;
    @XmlElement(name = "ProcInd")
    protected String procInd;
    @XmlElement(name = "ProcInfo")
    protected String procInfo;

    /**
     * Gets the value of the emvData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMVData() {
        return emvData;
    }

    /**
     * Sets the value of the emvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMVData(String value) {
        this.emvData = value;
    }

    /**
     * Gets the value of the cardSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNum() {
        return cardSeqNum;
    }

    /**
     * Sets the value of the cardSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNum(String value) {
        this.cardSeqNum = value;
    }

    /**
     * Gets the value of the xCodeResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCodeResp() {
        return xCodeResp;
    }

    /**
     * Sets the value of the xCodeResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCodeResp(String value) {
        this.xCodeResp = value;
    }

    /**
     * Gets the value of the servCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServCode() {
        return servCode;
    }

    /**
     * Sets the value of the servCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServCode(String value) {
        this.servCode = value;
    }

    /**
     * Gets the value of the appExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppExpDate() {
        return appExpDate;
    }

    /**
     * Sets the value of the appExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppExpDate(String value) {
        this.appExpDate = value;
    }

    /**
     * Gets the value of the carc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARC() {
        return carc;
    }

    /**
     * Sets the value of the carc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARC(String value) {
        this.carc = value;
    }

    /**
     * Gets the value of the procInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcInd() {
        return procInd;
    }

    /**
     * Sets the value of the procInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcInd(String value) {
        this.procInd = value;
    }

    /**
     * Gets the value of the procInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcInfo() {
        return procInfo;
    }

    /**
     * Sets the value of the procInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcInfo(String value) {
        this.procInfo = value;
    }

}
