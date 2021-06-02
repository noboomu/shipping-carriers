
package com.ups.xmlschema.xoltws.ship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillShipper" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}BillShipperType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidType", propOrder = {
    "billShipper"
})
public class PrepaidType {

    @XmlElement(name = "BillShipper", required = true)
    protected BillShipperType billShipper;

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

}
