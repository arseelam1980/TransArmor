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
 * <p>Java class for CheckResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonGrp" type="{com/firstdata/Merchant/gmfV3.10}CommonGrp" minOccurs="0"/>
 *         &lt;element name="TeleCheckECAGrp" type="{com/firstdata/Merchant/gmfV3.10}TeleCheckECAGrp" minOccurs="0"/>
 *         &lt;element name="AddtlAmtGrp" type="{com/firstdata/Merchant/gmfV3.10}AddtlAmtGrp" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="RespGrp" type="{com/firstdata/Merchant/gmfV3.10}RespGrp" minOccurs="0"/>
 *         &lt;element name="FileDLGrp" type="{com/firstdata/Merchant/gmfV3.10}FileDLGrp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckResponseDetails", propOrder = {
    "commonGrp",
    "teleCheckECAGrp",
    "addtlAmtGrp",
    "respGrp",
    "fileDLGrp"
})
public class CheckResponseDetails {

    @XmlElement(name = "CommonGrp")
    protected CommonGrp commonGrp;
    @XmlElement(name = "TeleCheckECAGrp")
    protected TeleCheckECAGrp teleCheckECAGrp;
    @XmlElement(name = "AddtlAmtGrp")
    protected List<AddtlAmtGrp> addtlAmtGrp;
    @XmlElement(name = "RespGrp")
    protected RespGrp respGrp;
    @XmlElement(name = "FileDLGrp")
    protected FileDLGrp fileDLGrp;

    /**
     * Gets the value of the commonGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CommonGrp }
     *     
     */
    public CommonGrp getCommonGrp() {
        return commonGrp;
    }

    /**
     * Sets the value of the commonGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonGrp }
     *     
     */
    public void setCommonGrp(CommonGrp value) {
        this.commonGrp = value;
    }

    /**
     * Gets the value of the teleCheckECAGrp property.
     * 
     * @return
     *     possible object is
     *     {@link TeleCheckECAGrp }
     *     
     */
    public TeleCheckECAGrp getTeleCheckECAGrp() {
        return teleCheckECAGrp;
    }

    /**
     * Sets the value of the teleCheckECAGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleCheckECAGrp }
     *     
     */
    public void setTeleCheckECAGrp(TeleCheckECAGrp value) {
        this.teleCheckECAGrp = value;
    }

    /**
     * Gets the value of the addtlAmtGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmtGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmtGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddtlAmtGrp }
     * 
     * 
     */
    public List<AddtlAmtGrp> getAddtlAmtGrp() {
        if (addtlAmtGrp == null) {
            addtlAmtGrp = new ArrayList<AddtlAmtGrp>();
        }
        return this.addtlAmtGrp;
    }

    /**
     * Gets the value of the respGrp property.
     * 
     * @return
     *     possible object is
     *     {@link RespGrp }
     *     
     */
    public RespGrp getRespGrp() {
        return respGrp;
    }

    /**
     * Sets the value of the respGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespGrp }
     *     
     */
    public void setRespGrp(RespGrp value) {
        this.respGrp = value;
    }

    /**
     * Gets the value of the fileDLGrp property.
     * 
     * @return
     *     possible object is
     *     {@link FileDLGrp }
     *     
     */
    public FileDLGrp getFileDLGrp() {
        return fileDLGrp;
    }

    /**
     * Sets the value of the fileDLGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDLGrp }
     *     
     */
    public void setFileDLGrp(FileDLGrp value) {
        this.fileDLGrp = value;
    }

}