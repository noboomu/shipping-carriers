
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POMNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POMNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupNotifications" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}PickupNotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POMType", propOrder = {
    "pomNumber",
    "pomNumberType",
    "pickupNotifications"
})
public class POMType {

    @XmlElement(name = "POMNumber")
    protected String pomNumber;
    @XmlElement(name = "POMNumberType")
    protected String pomNumberType;
    @XmlElement(name = "PickupNotifications")
    protected PickupNotificationsType pickupNotifications;

    /**
     * Gets the value of the pomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOMNumber() {
        return pomNumber;
    }

    /**
     * Sets the value of the pomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOMNumber(String value) {
        this.pomNumber = value;
    }

    /**
     * Gets the value of the pomNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOMNumberType() {
        return pomNumberType;
    }

    /**
     * Sets the value of the pomNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOMNumberType(String value) {
        this.pomNumberType = value;
    }

    /**
     * Gets the value of the pickupNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link PickupNotificationsType }
     *     
     */
    public PickupNotificationsType getPickupNotifications() {
        return pickupNotifications;
    }

    /**
     * Sets the value of the pickupNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupNotificationsType }
     *     
     */
    public void setPickupNotifications(PickupNotificationsType value) {
        this.pickupNotifications = value;
    }

}
