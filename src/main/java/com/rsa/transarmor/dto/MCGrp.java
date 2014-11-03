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
 * <p>Java class for MCGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}BanknetData" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}MCMSDI" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CCVErrorCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}POSEntryModeChg" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}TranEditErrCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}MCPOSData" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DevTypeInd" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}FinAuthInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCGrp", propOrder = {
    "banknetData",
    "mcmsdi",
    "ccvErrorCode",
    "posEntryModeChg",
    "tranEditErrCode",
    "mcposData",
    "devTypeInd",
    "finAuthInd"
})
public class MCGrp {

    @XmlElement(name = "BanknetData")
    protected String banknetData;
    @XmlElement(name = "MCMSDI")
    protected MCMSDIType mcmsdi;
    @XmlElement(name = "CCVErrorCode")
    protected CCVErrorCodeType ccvErrorCode;
    @XmlElement(name = "POSEntryModeChg")
    protected POSEntryModeChgType posEntryModeChg;
    @XmlElement(name = "TranEditErrCode")
    protected String tranEditErrCode;
    @XmlElement(name = "MCPOSData")
    protected String mcposData;
    @XmlElement(name = "DevTypeInd")
    protected String devTypeInd;
    @XmlElement(name = "FinAuthInd")
    protected String finAuthInd;

    /**
     * Gets the value of the banknetData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanknetData() {
        return banknetData;
    }

    /**
     * Sets the value of the banknetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanknetData(String value) {
        this.banknetData = value;
    }

    /**
     * Gets the value of the mcmsdi property.
     * 
     * @return
     *     possible object is
     *     {@link MCMSDIType }
     *     
     */
    public MCMSDIType getMCMSDI() {
        return mcmsdi;
    }

    /**
     * Sets the value of the mcmsdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCMSDIType }
     *     
     */
    public void setMCMSDI(MCMSDIType value) {
        this.mcmsdi = value;
    }

    /**
     * Gets the value of the ccvErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CCVErrorCodeType }
     *     
     */
    public CCVErrorCodeType getCCVErrorCode() {
        return ccvErrorCode;
    }

    /**
     * Sets the value of the ccvErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCVErrorCodeType }
     *     
     */
    public void setCCVErrorCode(CCVErrorCodeType value) {
        this.ccvErrorCode = value;
    }

    /**
     * Gets the value of the posEntryModeChg property.
     * 
     * @return
     *     possible object is
     *     {@link POSEntryModeChgType }
     *     
     */
    public POSEntryModeChgType getPOSEntryModeChg() {
        return posEntryModeChg;
    }

    /**
     * Sets the value of the posEntryModeChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSEntryModeChgType }
     *     
     */
    public void setPOSEntryModeChg(POSEntryModeChgType value) {
        this.posEntryModeChg = value;
    }

    /**
     * Gets the value of the tranEditErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranEditErrCode() {
        return tranEditErrCode;
    }

    /**
     * Sets the value of the tranEditErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranEditErrCode(String value) {
        this.tranEditErrCode = value;
    }

    /**
     * Gets the value of the mcposData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCPOSData() {
        return mcposData;
    }

    /**
     * Sets the value of the mcposData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCPOSData(String value) {
        this.mcposData = value;
    }

    /**
     * Gets the value of the devTypeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevTypeInd() {
        return devTypeInd;
    }

    /**
     * Sets the value of the devTypeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevTypeInd(String value) {
        this.devTypeInd = value;
    }

    /**
     * Gets the value of the finAuthInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinAuthInd() {
        return finAuthInd;
    }

    /**
     * Sets the value of the finAuthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinAuthInd(String value) {
        this.finAuthInd = value;
    }

}
