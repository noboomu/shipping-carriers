
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightCollectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightCollectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillReceiver" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}BillReceiverType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightCollectType", propOrder = {
    "billReceiver"
})
public class FreightCollectType {

    @XmlElement(name = "BillReceiver", required = true)
    protected BillReceiverType billReceiver;

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

}
