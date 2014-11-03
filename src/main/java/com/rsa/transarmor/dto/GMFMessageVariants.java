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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMFMessageVariants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMFMessageVariants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CreditRequest" type="{com/firstdata/Merchant/gmfV3.10}CreditRequestDetails"/>
 *           &lt;element name="DebitRequest" type="{com/firstdata/Merchant/gmfV3.10}DebitRequestDetails"/>
 *           &lt;element name="PinlessDebitRequest" type="{com/firstdata/Merchant/gmfV3.10}PinlessDebitRequestDetails"/>
 *           &lt;element name="CheckRequest" type="{com/firstdata/Merchant/gmfV3.10}CheckRequestDetails"/>
 *           &lt;element name="EBTRequest" type="{com/firstdata/Merchant/gmfV3.10}EBTRequestDetails"/>
 *           &lt;element name="PrepaidRequest" type="{com/firstdata/Merchant/gmfV3.10}PrepaidRequestDetails"/>
 *           &lt;element name="GenPrepaidRequest" type="{com/firstdata/Merchant/gmfV3.10}GenPrepaidRequestDetails"/>
 *           &lt;element name="PrivateLabelRequest" type="{com/firstdata/Merchant/gmfV3.10}PrivateLabelRequestDetails"/>
 *           &lt;element name="FleetRequest" type="{com/firstdata/Merchant/gmfV3.10}FleetRequestDetails"/>
 *           &lt;element name="TransArmorRequest" type="{com/firstdata/Merchant/gmfV3.10}TARequestDetails"/>
 *           &lt;element name="AdminRequest" type="{com/firstdata/Merchant/gmfV3.10}AdminRequestDetails"/>
 *           &lt;element name="ReversalRequest" type="{com/firstdata/Merchant/gmfV3.10}VoidTOReversalRequestDetails"/>
 *           &lt;element name="CreditResponse" type="{com/firstdata/Merchant/gmfV3.10}CreditResponseDetails"/>
 *           &lt;element name="DebitResponse" type="{com/firstdata/Merchant/gmfV3.10}DebitResponseDetails"/>
 *           &lt;element name="PinlessDebitResponse" type="{com/firstdata/Merchant/gmfV3.10}PinlessDebitResponseDetails"/>
 *           &lt;element name="CheckResponse" type="{com/firstdata/Merchant/gmfV3.10}CheckResponseDetails"/>
 *           &lt;element name="EBTResponse" type="{com/firstdata/Merchant/gmfV3.10}EBTResponseDetails"/>
 *           &lt;element name="PrepaidResponse" type="{com/firstdata/Merchant/gmfV3.10}PrepaidResponseDetails"/>
 *           &lt;element name="GenPrepaidResponse" type="{com/firstdata/Merchant/gmfV3.10}GenPrepaidResponseDetails"/>
 *           &lt;element name="PrivateLabelResponse" type="{com/firstdata/Merchant/gmfV3.10}PrivateLabelResponseDetails"/>
 *           &lt;element name="FleetResponse" type="{com/firstdata/Merchant/gmfV3.10}FleetResponseDetails"/>
 *           &lt;element name="TransArmorResponse" type="{com/firstdata/Merchant/gmfV3.10}TAResponseDetails"/>
 *           &lt;element name="AdminResponse" type="{com/firstdata/Merchant/gmfV3.10}AdminResponseDetails"/>
 *           &lt;element name="RejectResponse" type="{com/firstdata/Merchant/gmfV3.10}RejectResponseDetails"/>
 *           &lt;element name="ReversalResponse" type="{com/firstdata/Merchant/gmfV3.10}VoidTOReversalResponseDetails"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMFMessageVariants", propOrder = {
    "creditRequest",
    "debitRequest",
    "pinlessDebitRequest",
    "checkRequest",
    "ebtRequest",
    "prepaidRequest",
    "genPrepaidRequest",
    "privateLabelRequest",
    "fleetRequest",
    "transArmorRequest",
    "adminRequest",
    "reversalRequest",
    "creditResponse",
    "debitResponse",
    "pinlessDebitResponse",
    "checkResponse",
    "ebtResponse",
    "prepaidResponse",
    "genPrepaidResponse",
    "privateLabelResponse",
    "fleetResponse",
    "transArmorResponse",
    "adminResponse",
    "rejectResponse",
    "reversalResponse"
})
@XmlRootElement(name = "GMF")
public class GMFMessageVariants {

    @XmlElement(name = "CreditRequest")
    protected CreditRequestDetails creditRequest;
    @XmlElement(name = "DebitRequest")
    protected DebitRequestDetails debitRequest;
    @XmlElement(name = "PinlessDebitRequest")
    protected PinlessDebitRequestDetails pinlessDebitRequest;
    @XmlElement(name = "CheckRequest")
    protected CheckRequestDetails checkRequest;
    @XmlElement(name = "EBTRequest")
    protected EBTRequestDetails ebtRequest;
    @XmlElement(name = "PrepaidRequest")
    protected PrepaidRequestDetails prepaidRequest;
    @XmlElement(name = "GenPrepaidRequest")
    protected GenPrepaidRequestDetails genPrepaidRequest;
    @XmlElement(name = "PrivateLabelRequest")
    protected PrivateLabelRequestDetails privateLabelRequest;
    @XmlElement(name = "FleetRequest")
    protected FleetRequestDetails fleetRequest;
    @XmlElement(name = "TransArmorRequest")
    protected TARequestDetails transArmorRequest;
    @XmlElement(name = "AdminRequest")
    protected AdminRequestDetails adminRequest;
    @XmlElement(name = "ReversalRequest")
    protected VoidTOReversalRequestDetails reversalRequest;
    @XmlElement(name = "CreditResponse")
    protected CreditResponseDetails creditResponse;
    @XmlElement(name = "DebitResponse")
    protected DebitResponseDetails debitResponse;
    @XmlElement(name = "PinlessDebitResponse")
    protected PinlessDebitResponseDetails pinlessDebitResponse;
    @XmlElement(name = "CheckResponse")
    protected CheckResponseDetails checkResponse;
    @XmlElement(name = "EBTResponse")
    protected EBTResponseDetails ebtResponse;
    @XmlElement(name = "PrepaidResponse")
    protected PrepaidResponseDetails prepaidResponse;
    @XmlElement(name = "GenPrepaidResponse")
    protected GenPrepaidResponseDetails genPrepaidResponse;
    @XmlElement(name = "PrivateLabelResponse")
    protected PrivateLabelResponseDetails privateLabelResponse;
    @XmlElement(name = "FleetResponse")
    protected FleetResponseDetails fleetResponse;
    @XmlElement(name = "TransArmorResponse")
    protected TAResponseDetails transArmorResponse;
    @XmlElement(name = "AdminResponse")
    protected AdminResponseDetails adminResponse;
    @XmlElement(name = "RejectResponse")
    protected RejectResponseDetails rejectResponse;
    @XmlElement(name = "ReversalResponse")
    protected VoidTOReversalResponseDetails reversalResponse;

    /**
     * Gets the value of the creditRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRequestDetails }
     *     
     */
    public CreditRequestDetails getCreditRequest() {
        return creditRequest;
    }

    /**
     * Sets the value of the creditRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRequestDetails }
     *     
     */
    public void setCreditRequest(CreditRequestDetails value) {
        this.creditRequest = value;
    }

    /**
     * Gets the value of the debitRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DebitRequestDetails }
     *     
     */
    public DebitRequestDetails getDebitRequest() {
        return debitRequest;
    }

    /**
     * Sets the value of the debitRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitRequestDetails }
     *     
     */
    public void setDebitRequest(DebitRequestDetails value) {
        this.debitRequest = value;
    }

    /**
     * Gets the value of the pinlessDebitRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitRequestDetails }
     *     
     */
    public PinlessDebitRequestDetails getPinlessDebitRequest() {
        return pinlessDebitRequest;
    }

    /**
     * Sets the value of the pinlessDebitRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitRequestDetails }
     *     
     */
    public void setPinlessDebitRequest(PinlessDebitRequestDetails value) {
        this.pinlessDebitRequest = value;
    }

    /**
     * Gets the value of the checkRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRequestDetails }
     *     
     */
    public CheckRequestDetails getCheckRequest() {
        return checkRequest;
    }

    /**
     * Sets the value of the checkRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRequestDetails }
     *     
     */
    public void setCheckRequest(CheckRequestDetails value) {
        this.checkRequest = value;
    }

    /**
     * Gets the value of the ebtRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBTRequestDetails }
     *     
     */
    public EBTRequestDetails getEBTRequest() {
        return ebtRequest;
    }

    /**
     * Sets the value of the ebtRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBTRequestDetails }
     *     
     */
    public void setEBTRequest(EBTRequestDetails value) {
        this.ebtRequest = value;
    }

    /**
     * Gets the value of the prepaidRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidRequestDetails }
     *     
     */
    public PrepaidRequestDetails getPrepaidRequest() {
        return prepaidRequest;
    }

    /**
     * Sets the value of the prepaidRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidRequestDetails }
     *     
     */
    public void setPrepaidRequest(PrepaidRequestDetails value) {
        this.prepaidRequest = value;
    }

    /**
     * Gets the value of the genPrepaidRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GenPrepaidRequestDetails }
     *     
     */
    public GenPrepaidRequestDetails getGenPrepaidRequest() {
        return genPrepaidRequest;
    }

    /**
     * Sets the value of the genPrepaidRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenPrepaidRequestDetails }
     *     
     */
    public void setGenPrepaidRequest(GenPrepaidRequestDetails value) {
        this.genPrepaidRequest = value;
    }

    /**
     * Gets the value of the privateLabelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateLabelRequestDetails }
     *     
     */
    public PrivateLabelRequestDetails getPrivateLabelRequest() {
        return privateLabelRequest;
    }

    /**
     * Sets the value of the privateLabelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateLabelRequestDetails }
     *     
     */
    public void setPrivateLabelRequest(PrivateLabelRequestDetails value) {
        this.privateLabelRequest = value;
    }

    /**
     * Gets the value of the fleetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FleetRequestDetails }
     *     
     */
    public FleetRequestDetails getFleetRequest() {
        return fleetRequest;
    }

    /**
     * Sets the value of the fleetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetRequestDetails }
     *     
     */
    public void setFleetRequest(FleetRequestDetails value) {
        this.fleetRequest = value;
    }

    /**
     * Gets the value of the transArmorRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TARequestDetails }
     *     
     */
    public TARequestDetails getTransArmorRequest() {
        return transArmorRequest;
    }

    /**
     * Sets the value of the transArmorRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TARequestDetails }
     *     
     */
    public void setTransArmorRequest(TARequestDetails value) {
        this.transArmorRequest = value;
    }

    /**
     * Gets the value of the adminRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AdminRequestDetails }
     *     
     */
    public AdminRequestDetails getAdminRequest() {
        return adminRequest;
    }

    /**
     * Sets the value of the adminRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminRequestDetails }
     *     
     */
    public void setAdminRequest(AdminRequestDetails value) {
        this.adminRequest = value;
    }

    /**
     * Gets the value of the reversalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VoidTOReversalRequestDetails }
     *     
     */
    public VoidTOReversalRequestDetails getReversalRequest() {
        return reversalRequest;
    }

    /**
     * Sets the value of the reversalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidTOReversalRequestDetails }
     *     
     */
    public void setReversalRequest(VoidTOReversalRequestDetails value) {
        this.reversalRequest = value;
    }

    /**
     * Gets the value of the creditResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreditResponseDetails }
     *     
     */
    public CreditResponseDetails getCreditResponse() {
        return creditResponse;
    }

    /**
     * Sets the value of the creditResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditResponseDetails }
     *     
     */
    public void setCreditResponse(CreditResponseDetails value) {
        this.creditResponse = value;
    }

    /**
     * Gets the value of the debitResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DebitResponseDetails }
     *     
     */
    public DebitResponseDetails getDebitResponse() {
        return debitResponse;
    }

    /**
     * Sets the value of the debitResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitResponseDetails }
     *     
     */
    public void setDebitResponse(DebitResponseDetails value) {
        this.debitResponse = value;
    }

    /**
     * Gets the value of the pinlessDebitResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitResponseDetails }
     *     
     */
    public PinlessDebitResponseDetails getPinlessDebitResponse() {
        return pinlessDebitResponse;
    }

    /**
     * Sets the value of the pinlessDebitResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitResponseDetails }
     *     
     */
    public void setPinlessDebitResponse(PinlessDebitResponseDetails value) {
        this.pinlessDebitResponse = value;
    }

    /**
     * Gets the value of the checkResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CheckResponseDetails }
     *     
     */
    public CheckResponseDetails getCheckResponse() {
        return checkResponse;
    }

    /**
     * Sets the value of the checkResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckResponseDetails }
     *     
     */
    public void setCheckResponse(CheckResponseDetails value) {
        this.checkResponse = value;
    }

    /**
     * Gets the value of the ebtResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBTResponseDetails }
     *     
     */
    public EBTResponseDetails getEBTResponse() {
        return ebtResponse;
    }

    /**
     * Sets the value of the ebtResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBTResponseDetails }
     *     
     */
    public void setEBTResponse(EBTResponseDetails value) {
        this.ebtResponse = value;
    }

    /**
     * Gets the value of the prepaidResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidResponseDetails }
     *     
     */
    public PrepaidResponseDetails getPrepaidResponse() {
        return prepaidResponse;
    }

    /**
     * Sets the value of the prepaidResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidResponseDetails }
     *     
     */
    public void setPrepaidResponse(PrepaidResponseDetails value) {
        this.prepaidResponse = value;
    }

    /**
     * Gets the value of the genPrepaidResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GenPrepaidResponseDetails }
     *     
     */
    public GenPrepaidResponseDetails getGenPrepaidResponse() {
        return genPrepaidResponse;
    }

    /**
     * Sets the value of the genPrepaidResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenPrepaidResponseDetails }
     *     
     */
    public void setGenPrepaidResponse(GenPrepaidResponseDetails value) {
        this.genPrepaidResponse = value;
    }

    /**
     * Gets the value of the privateLabelResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateLabelResponseDetails }
     *     
     */
    public PrivateLabelResponseDetails getPrivateLabelResponse() {
        return privateLabelResponse;
    }

    /**
     * Sets the value of the privateLabelResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateLabelResponseDetails }
     *     
     */
    public void setPrivateLabelResponse(PrivateLabelResponseDetails value) {
        this.privateLabelResponse = value;
    }

    /**
     * Gets the value of the fleetResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FleetResponseDetails }
     *     
     */
    public FleetResponseDetails getFleetResponse() {
        return fleetResponse;
    }

    /**
     * Sets the value of the fleetResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetResponseDetails }
     *     
     */
    public void setFleetResponse(FleetResponseDetails value) {
        this.fleetResponse = value;
    }

    /**
     * Gets the value of the transArmorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TAResponseDetails }
     *     
     */
    public TAResponseDetails getTransArmorResponse() {
        return transArmorResponse;
    }

    /**
     * Sets the value of the transArmorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAResponseDetails }
     *     
     */
    public void setTransArmorResponse(TAResponseDetails value) {
        this.transArmorResponse = value;
    }

    /**
     * Gets the value of the adminResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AdminResponseDetails }
     *     
     */
    public AdminResponseDetails getAdminResponse() {
        return adminResponse;
    }

    /**
     * Sets the value of the adminResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminResponseDetails }
     *     
     */
    public void setAdminResponse(AdminResponseDetails value) {
        this.adminResponse = value;
    }

    /**
     * Gets the value of the rejectResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RejectResponseDetails }
     *     
     */
    public RejectResponseDetails getRejectResponse() {
        return rejectResponse;
    }

    /**
     * Sets the value of the rejectResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectResponseDetails }
     *     
     */
    public void setRejectResponse(RejectResponseDetails value) {
        this.rejectResponse = value;
    }

    /**
     * Gets the value of the reversalResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VoidTOReversalResponseDetails }
     *     
     */
    public VoidTOReversalResponseDetails getReversalResponse() {
        return reversalResponse;
    }

    /**
     * Sets the value of the reversalResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidTOReversalResponseDetails }
     *     
     */
    public void setReversalResponse(VoidTOReversalResponseDetails value) {
        this.reversalResponse = value;
    }

}
