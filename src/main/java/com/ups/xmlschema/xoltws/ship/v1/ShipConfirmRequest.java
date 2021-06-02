
package com.ups.xmlschema.xoltws.ship.v1;

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
 *         &lt;element name="Shipment" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ShipmentType"/&gt;
 *         &lt;element name="LabelSpecification" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}LabelSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptSpecification" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}ReceiptSpecificationType" minOccurs="0"/&gt;
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
    "shipment",
    "labelSpecification",
    "receiptSpecification"
})
@XmlRootElement(name = "ShipConfirmRequest")
public class ShipConfirmRequest {

    @XmlElement(name = "Request", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected RequestType request;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentType shipment;
    @XmlElement(name = "LabelSpecification")
    protected LabelSpecificationType labelSpecification;
    @XmlElement(name = "ReceiptSpecification")
    protected ReceiptSpecificationType receiptSpecification;

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

    /**
     * Gets the value of the labelSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSpecificationType }
     *     
     */
    public LabelSpecificationType getLabelSpecification() {
        return labelSpecification;
    }

    /**
     * Sets the value of the labelSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSpecificationType }
     *     
     */
    public void setLabelSpecification(LabelSpecificationType value) {
        this.labelSpecification = value;
    }

    /**
     * Gets the value of the receiptSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptSpecificationType }
     *     
     */
    public ReceiptSpecificationType getReceiptSpecification() {
        return receiptSpecification;
    }

    /**
     * Sets the value of the receiptSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptSpecificationType }
     *     
     */
    public void setReceiptSpecification(ReceiptSpecificationType value) {
        this.receiptSpecification = value;
    }

}
