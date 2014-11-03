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
 * <p>Java class for AdminRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonGrp" type="{com/firstdata/Merchant/gmfV3.10}CommonGrp" minOccurs="0"/>
 *         &lt;element name="HostTotGrp" type="{com/firstdata/Merchant/gmfV3.10}HostTotGrp" minOccurs="0"/>
 *         &lt;element name="HostTotDetGrp" type="{com/firstdata/Merchant/gmfV3.10}HostTotDetGrp" maxOccurs="18" minOccurs="0"/>
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
@XmlType(name = "AdminRequestDetails", propOrder = {
    "commonGrp",
    "hostTotGrp",
    "hostTotDetGrp",
    "fileDLGrp"
})
public class AdminRequestDetails {

    @XmlElement(name = "CommonGrp")
    protected CommonGrp commonGrp;
    @XmlElement(name = "HostTotGrp")
    protected HostTotGrp hostTotGrp;
    @XmlElement(name = "HostTotDetGrp")
    protected List<HostTotDetGrp> hostTotDetGrp;
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
     * Gets the value of the hostTotGrp property.
     * 
     * @return
     *     possible object is
     *     {@link HostTotGrp }
     *     
     */
    public HostTotGrp getHostTotGrp() {
        return hostTotGrp;
    }

    /**
     * Sets the value of the hostTotGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTotGrp }
     *     
     */
    public void setHostTotGrp(HostTotGrp value) {
        this.hostTotGrp = value;
    }

    /**
     * Gets the value of the hostTotDetGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostTotDetGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostTotDetGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTotDetGrp }
     * 
     * 
     */
    public List<HostTotDetGrp> getHostTotDetGrp() {
        if (hostTotDetGrp == null) {
            hostTotDetGrp = new ArrayList<HostTotDetGrp>();
        }
        return this.hostTotDetGrp;
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
