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
 * <p>Java class for PurchCardlvl3Grp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchCardlvl3Grp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3ItemSeqNum" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3ItemCode" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3ItemDesc" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3Qty" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3UnitOfMsure" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3UnitCost" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3ItemTot" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3DiscntAmt" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3TaxAmt" minOccurs="0"/>
 *         &lt;element ref="{com/firstdata/Merchant/gmfV3.10}L3TaxRt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchCardlvl3Grp", propOrder = {
    "l3ItemSeqNum",
    "l3ItemCode",
    "l3ItemDesc",
    "l3Qty",
    "l3UnitOfMsure",
    "l3UnitCost",
    "l3ItemTot",
    "l3DiscntAmt",
    "l3TaxAmt",
    "l3TaxRt"
})
public class PurchCardlvl3Grp {

    @XmlElement(name = "L3ItemSeqNum")
    protected String l3ItemSeqNum;
    @XmlElement(name = "L3ItemCode")
    protected String l3ItemCode;
    @XmlElement(name = "L3ItemDesc")
    protected String l3ItemDesc;
    @XmlElement(name = "L3Qty")
    protected String l3Qty;
    @XmlElement(name = "L3UnitOfMsure")
    protected String l3UnitOfMsure;
    @XmlElement(name = "L3UnitCost")
    protected String l3UnitCost;
    @XmlElement(name = "L3ItemTot")
    protected String l3ItemTot;
    @XmlElement(name = "L3DiscntAmt")
    protected String l3DiscntAmt;
    @XmlElement(name = "L3TaxAmt")
    protected String l3TaxAmt;
    @XmlElement(name = "L3TaxRt")
    protected String l3TaxRt;

    /**
     * Gets the value of the l3ItemSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3ItemSeqNum() {
        return l3ItemSeqNum;
    }

    /**
     * Sets the value of the l3ItemSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3ItemSeqNum(String value) {
        this.l3ItemSeqNum = value;
    }

    /**
     * Gets the value of the l3ItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3ItemCode() {
        return l3ItemCode;
    }

    /**
     * Sets the value of the l3ItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3ItemCode(String value) {
        this.l3ItemCode = value;
    }

    /**
     * Gets the value of the l3ItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3ItemDesc() {
        return l3ItemDesc;
    }

    /**
     * Sets the value of the l3ItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3ItemDesc(String value) {
        this.l3ItemDesc = value;
    }

    /**
     * Gets the value of the l3Qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3Qty() {
        return l3Qty;
    }

    /**
     * Sets the value of the l3Qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3Qty(String value) {
        this.l3Qty = value;
    }

    /**
     * Gets the value of the l3UnitOfMsure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3UnitOfMsure() {
        return l3UnitOfMsure;
    }

    /**
     * Sets the value of the l3UnitOfMsure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3UnitOfMsure(String value) {
        this.l3UnitOfMsure = value;
    }

    /**
     * Gets the value of the l3UnitCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3UnitCost() {
        return l3UnitCost;
    }

    /**
     * Sets the value of the l3UnitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3UnitCost(String value) {
        this.l3UnitCost = value;
    }

    /**
     * Gets the value of the l3ItemTot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3ItemTot() {
        return l3ItemTot;
    }

    /**
     * Sets the value of the l3ItemTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3ItemTot(String value) {
        this.l3ItemTot = value;
    }

    /**
     * Gets the value of the l3DiscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3DiscntAmt() {
        return l3DiscntAmt;
    }

    /**
     * Sets the value of the l3DiscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3DiscntAmt(String value) {
        this.l3DiscntAmt = value;
    }

    /**
     * Gets the value of the l3TaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3TaxAmt() {
        return l3TaxAmt;
    }

    /**
     * Sets the value of the l3TaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3TaxAmt(String value) {
        this.l3TaxAmt = value;
    }

    /**
     * Gets the value of the l3TaxRt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3TaxRt() {
        return l3TaxRt;
    }

    /**
     * Sets the value of the l3TaxRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3TaxRt(String value) {
        this.l3TaxRt = value;
    }

}