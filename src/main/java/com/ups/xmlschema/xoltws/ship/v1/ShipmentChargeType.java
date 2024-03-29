
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillShipper" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}BillShipperType" minOccurs="0"/&gt;
 *         &lt;element name="BillReceiver" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}BillReceiverType" minOccurs="0"/&gt;
 *         &lt;element name="BillThirdParty" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}BillThirdPartyChargeType" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeBilledIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentChargeType", propOrder = {
    "type",
    "billShipper",
    "billReceiver",
    "billThirdParty",
    "consigneeBilledIndicator"
})
public class ShipmentChargeType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "BillShipper")
    protected BillShipperType billShipper;
    @XmlElement(name = "BillReceiver")
    protected BillReceiverType billReceiver;
    @XmlElement(name = "BillThirdParty")
    protected BillThirdPartyChargeType billThirdParty;
    @XmlElement(name = "ConsigneeBilledIndicator")
    protected String consigneeBilledIndicator;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the billShipper property.
     * 
     * @return
     *     possible object is
     *     {@link BillShipperType }
     *     
     */
    public BillShipperType getBillShipper() {
        return billShipper;
    }

    /**
     * Sets the value of the billShipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillShipperType }
     *     
     */
    public void setBillShipper(BillShipperType value) {
        this.billShipper = value;
    }

    /**
     * Gets the value of the billReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link BillReceiverType }
     *     
     */
    public BillReceiverType getBillReceiver() {
        return billReceiver;
    }

    /**
     * Sets the value of the billReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillReceiverType }
     *     
     */
    public void setBillReceiver(BillReceiverType value) {
        this.billReceiver = value;
    }

    /**
     * Gets the value of the billThirdParty property.
     * 
     * @return
     *     possible object is
     *     {@link BillThirdPartyChargeType }
     *     
     */
    public BillThirdPartyChargeType getBillThirdParty() {
        return billThirdParty;
    }

    /**
     * Sets the value of the billThirdParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillThirdPartyChargeType }
     *     
     */
    public void setBillThirdParty(BillThirdPartyChargeType value) {
        this.billThirdParty = value;
    }

    /**
     * Gets the value of the consigneeBilledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeBilledIndicator() {
        return consigneeBilledIndicator;
    }

    /**
     * Sets the value of the consigneeBilledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeBilledIndicator(String value) {
        this.consigneeBilledIndicator = value;
    }

}
