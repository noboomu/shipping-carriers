
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data required for shipments handled under the SMART_POST and GROUND_SMART_POST service types.
 * 
 * <p>Java class for SmartPostShipmentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartPostShipmentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessingOptionsRequested" type="{http://fedex.com/ws/openship/v18}SmartPostShipmentProcessingOptionsRequested" minOccurs="0"/&gt;
 *         &lt;element name="Indicia" type="{http://fedex.com/ws/openship/v18}SmartPostIndiciaType" minOccurs="0"/&gt;
 *         &lt;element name="AncillaryEndorsement" type="{http://fedex.com/ws/openship/v18}SmartPostAncillaryEndorsementType" minOccurs="0"/&gt;
 *         &lt;element name="HubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerManifestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartPostShipmentDetail", propOrder = {
    "processingOptionsRequested",
    "indicia",
    "ancillaryEndorsement",
    "hubId",
    "customerManifestId"
})
public class SmartPostShipmentDetail {

    @XmlElement(name = "ProcessingOptionsRequested")
    protected SmartPostShipmentProcessingOptionsRequested processingOptionsRequested;
    @XmlElement(name = "Indicia")
    @XmlSchemaType(name = "string")
    protected SmartPostIndiciaType indicia;
    @XmlElement(name = "AncillaryEndorsement")
    @XmlSchemaType(name = "string")
    protected SmartPostAncillaryEndorsementType ancillaryEndorsement;
    @XmlElement(name = "HubId")
    protected String hubId;
    @XmlElement(name = "CustomerManifestId")
    protected String customerManifestId;

    /**
     * Gets the value of the processingOptionsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link SmartPostShipmentProcessingOptionsRequested }
     *     
     */
    public SmartPostShipmentProcessingOptionsRequested getProcessingOptionsRequested() {
        return processingOptionsRequested;
    }

    /**
     * Sets the value of the processingOptionsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostShipmentProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptionsRequested(SmartPostShipmentProcessingOptionsRequested value) {
        this.processingOptionsRequested = value;
    }

    /**
     * Gets the value of the indicia property.
     * 
     * @return
     *     possible object is
     *     {@link SmartPostIndiciaType }
     *     
     */
    public SmartPostIndiciaType getIndicia() {
        return indicia;
    }

    /**
     * Sets the value of the indicia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostIndiciaType }
     *     
     */
    public void setIndicia(SmartPostIndiciaType value) {
        this.indicia = value;
    }

    /**
     * Gets the value of the ancillaryEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link SmartPostAncillaryEndorsementType }
     *     
     */
    public SmartPostAncillaryEndorsementType getAncillaryEndorsement() {
        return ancillaryEndorsement;
    }

    /**
     * Sets the value of the ancillaryEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostAncillaryEndorsementType }
     *     
     */
    public void setAncillaryEndorsement(SmartPostAncillaryEndorsementType value) {
        this.ancillaryEndorsement = value;
    }

    /**
     * Gets the value of the hubId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHubId() {
        return hubId;
    }

    /**
     * Sets the value of the hubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHubId(String value) {
        this.hubId = value;
    }

    /**
     * Gets the value of the customerManifestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerManifestId() {
        return customerManifestId;
    }

    /**
     * Sets the value of the customerManifestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerManifestId(String value) {
        this.customerManifestId = value;
    }

}
