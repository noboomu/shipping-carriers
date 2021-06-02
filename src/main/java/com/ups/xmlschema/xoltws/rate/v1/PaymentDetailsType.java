
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentChargeType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="SplitDutyVATIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", propOrder = {
    "shipmentCharge",
    "splitDutyVATIndicator"
})
public class PaymentDetailsType {

    @XmlElement(name = "ShipmentCharge")
    protected List<ShipmentChargeType> shipmentCharge;
    @XmlElement(name = "SplitDutyVATIndicator")
    protected String splitDutyVATIndicator;

    /**
     * Gets the value of the shipmentCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentChargeType }
     * 
     * 
     */
    public List<ShipmentChargeType> getShipmentCharge() {
        if (shipmentCharge == null) {
            shipmentCharge = new ArrayList<ShipmentChargeType>();
        }
        return this.shipmentCharge;
    }

    /**
     * Gets the value of the splitDutyVATIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitDutyVATIndicator() {
        return splitDutyVATIndicator;
    }

    /**
     * Sets the value of the splitDutyVATIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitDutyVATIndicator(String value) {
        this.splitDutyVATIndicator = value;
    }

}
