//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 12:18:26 PM EDT 
//


package com.rsa.transarmor.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}ACI" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}MrktSpecificDataInd" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}ExistingDebtInd" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}CardLevelResult" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}SourceReasonCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}TransID" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}VisaBID" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}VisaAUAR" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}TaxAmtCapablt" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}SpendQInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaGrp", propOrder = {
    "aci",
    "mrktSpecificDataInd",
    "existingDebtInd",
    "cardLevelResult",
    "sourceReasonCode",
    "transID",
    "visaBID",
    "visaAUAR",
    "taxAmtCapablt",
    "spendQInd"
})
public class VisaGrp {

    @XmlElement(name = "ACI")
    protected ACIType aci;
    @XmlElement(name = "MrktSpecificDataInd")
    protected MrktSpecificDataIndType mrktSpecificDataInd;
    @XmlElement(name = "ExistingDebtInd")
    protected String existingDebtInd;
    @XmlElement(name = "CardLevelResult")
    protected String cardLevelResult;
    @XmlElement(name = "SourceReasonCode")
    protected String sourceReasonCode;
    @XmlElement(name = "TransID")
    protected String transID;
    @XmlElement(name = "VisaBID")
    protected List<String> visaBID;
    @XmlElement(name = "VisaAUAR")
    protected List<String> visaAUAR;
    @XmlElement(name = "TaxAmtCapablt")
    protected String taxAmtCapablt;
    @XmlElement(name = "SpendQInd")
    protected String spendQInd;

    /**
     * Gets the value of the aci property.
     * 
     * @return
     *     possible object is
     *     {@link ACIType }
     *     
     */
    public ACIType getACI() {
        return aci;
    }

    /**
     * Sets the value of the aci property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACIType }
     *     
     */
    public void setACI(ACIType value) {
        this.aci = value;
    }

    /**
     * Gets the value of the mrktSpecificDataInd property.
     * 
     * @return
     *     possible object is
     *     {@link MrktSpecificDataIndType }
     *     
     */
    public MrktSpecificDataIndType getMrktSpecificDataInd() {
        return mrktSpecificDataInd;
    }

    /**
     * Sets the value of the mrktSpecificDataInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MrktSpecificDataIndType }
     *     
     */
    public void setMrktSpecificDataInd(MrktSpecificDataIndType value) {
        this.mrktSpecificDataInd = value;
    }

    /**
     * Gets the value of the existingDebtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingDebtInd() {
        return existingDebtInd;
    }

    /**
     * Sets the value of the existingDebtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingDebtInd(String value) {
        this.existingDebtInd = value;
    }

    /**
     * Gets the value of the cardLevelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevelResult() {
        return cardLevelResult;
    }

    /**
     * Sets the value of the cardLevelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevelResult(String value) {
        this.cardLevelResult = value;
    }

    /**
     * Gets the value of the sourceReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceReasonCode() {
        return sourceReasonCode;
    }

    /**
     * Sets the value of the sourceReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceReasonCode(String value) {
        this.sourceReasonCode = value;
    }

    /**
     * Gets the value of the transID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransID() {
        return transID;
    }

    /**
     * Sets the value of the transID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransID(String value) {
        this.transID = value;
    }

    /**
     * Gets the value of the visaBID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaBID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaBID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVisaBID() {
        if (visaBID == null) {
            visaBID = new ArrayList<String>();
        }
        return this.visaBID;
    }

    /**
     * Gets the value of the visaAUAR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaAUAR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaAUAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVisaAUAR() {
        if (visaAUAR == null) {
            visaAUAR = new ArrayList<String>();
        }
        return this.visaAUAR;
    }

    /**
     * Gets the value of the taxAmtCapablt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmtCapablt() {
        return taxAmtCapablt;
    }

    /**
     * Sets the value of the taxAmtCapablt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmtCapablt(String value) {
        this.taxAmtCapablt = value;
    }

    /**
     * Gets the value of the spendQInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpendQInd() {
        return spendQInd;
    }

    /**
     * Sets the value of the spendQInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpendQInd(String value) {
        this.spendQInd = value;
    }

}
