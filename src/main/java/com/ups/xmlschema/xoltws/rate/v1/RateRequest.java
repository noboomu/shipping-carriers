
package com.ups.xmlschema.xoltws.rate.v1;

import com.ups.xmlschema.xoltws.common.v1.RequestType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Request"/&gt;
 *         &lt;element name="PickupType" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerClassification" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="Shipment" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "pickupType",
    "customerClassification",
    "shipment"
})
@XmlRootElement(name = "RateRequest")
public class RateRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "PickupType")
    protected CodeDescriptionType pickupType;
    @XmlElement(name = "CustomerClassification")
    protected CodeDescriptionType customerClassification;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentType shipment;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the pickupType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getPickupType() {
        return pickupType;
    }

    /**
     * Sets the value of the pickupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setPickupType(CodeDescriptionType value) {
        this.pickupType = value;
    }

    /**
     * Gets the value of the customerClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getCustomerClassification() {
        return customerClassification;
    }

    /**
     * Sets the value of the customerClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setCustomerClassification(CodeDescriptionType value) {
        this.customerClassification = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
    }

}
