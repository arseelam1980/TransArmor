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
 * <p>Java class for FltGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FltGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}Odo" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}VehNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}JobNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DrvNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}FltEmpNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}LicNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}JobID" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}DeptNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CustData" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}UserID" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}VehIDNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}ServResCd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FltGrp", propOrder = {
    "odo",
    "vehNum",
    "jobNum",
    "drvNum",
    "fltEmpNum",
    "licNum",
    "jobID",
    "deptNum",
    "custData",
    "userID",
    "vehIDNum",
    "servResCd"
})
public class FltGrp {

    @XmlElement(name = "Odo")
    protected Integer odo;
    @XmlElement(name = "VehNum")
    protected String vehNum;
    @XmlElement(name = "JobNum")
    protected String jobNum;
    @XmlElement(name = "DrvNum")
    protected String drvNum;
    @XmlElement(name = "FltEmpNum")
    protected String fltEmpNum;
    @XmlElement(name = "LicNum")
    protected String licNum;
    @XmlElement(name = "JobID")
    protected String jobID;
    @XmlElement(name = "DeptNum")
    protected String deptNum;
    @XmlElement(name = "CustData")
    protected String custData;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "VehIDNum")
    protected String vehIDNum;
    @XmlElement(name = "ServResCd")
    protected String servResCd;

    /**
     * Gets the value of the odo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdo() {
        return odo;
    }

    /**
     * Sets the value of the odo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdo(Integer value) {
        this.odo = value;
    }

    /**
     * Gets the value of the vehNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehNum() {
        return vehNum;
    }

    /**
     * Sets the value of the vehNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehNum(String value) {
        this.vehNum = value;
    }

    /**
     * Gets the value of the jobNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNum() {
        return jobNum;
    }

    /**
     * Sets the value of the jobNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNum(String value) {
        this.jobNum = value;
    }

    /**
     * Gets the value of the drvNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvNum() {
        return drvNum;
    }

    /**
     * Sets the value of the drvNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvNum(String value) {
        this.drvNum = value;
    }

    /**
     * Gets the value of the fltEmpNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltEmpNum() {
        return fltEmpNum;
    }

    /**
     * Sets the value of the fltEmpNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltEmpNum(String value) {
        this.fltEmpNum = value;
    }

    /**
     * Gets the value of the licNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicNum() {
        return licNum;
    }

    /**
     * Sets the value of the licNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicNum(String value) {
        this.licNum = value;
    }

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the deptNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNum() {
        return deptNum;
    }

    /**
     * Sets the value of the deptNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptNum(String value) {
        this.deptNum = value;
    }

    /**
     * Gets the value of the custData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustData() {
        return custData;
    }

    /**
     * Sets the value of the custData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustData(String value) {
        this.custData = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the vehIDNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehIDNum() {
        return vehIDNum;
    }

    /**
     * Sets the value of the vehIDNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehIDNum(String value) {
        this.vehIDNum = value;
    }

    /**
     * Gets the value of the servResCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServResCd() {
        return servResCd;
    }

    /**
     * Sets the value of the servResCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServResCd(String value) {
        this.servResCd = value;
    }

}
