
package com.ups.xmlschema.xoltws.freightship.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODValue" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}CODValueType"/&gt;
 *         &lt;element name="CODPaymentMethod" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ShipCodeDescriptionType"/&gt;
 *         &lt;element name="CODBillingOption" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ShipCodeDescriptionType"/&gt;
 *         &lt;element name="RemitTo" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}RemitToType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODType", propOrder = {
    "codValue",
    "codPaymentMethod",
    "codBillingOption",
    "remitTo"
})
public class CODType {

    @XmlElement(name = "CODValue", required = true)
    protected CODValueType codValue;
    @XmlElement(name = "CODPaymentMethod", required = true)
    protected ShipCodeDescriptionType codPaymentMethod;
    @XmlElement(name = "CODBillingOption", required = true)
    protected ShipCodeDescriptionType codBillingOption;
    @XmlElement(name = "RemitTo", required = true)
    protected RemitToType remitTo;

    /**
     * Gets the value of the codValue property.
     * 
     * @return
     *     possible object is
     *     {@link CODValueType }
     *     
     */
    public CODValueType getCODValue() {
        return codValue;
    }

    /**
     * Sets the value of the codValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODValueType }
     *     
     */
    public void setCODValue(CODValueType value) {
        this.codValue = value;
    }

    /**
     * Gets the value of the codPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public ShipCodeDescriptionType getCODPaymentMethod() {
        return codPaymentMethod;
    }

    /**
     * Sets the value of the codPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public void setCODPaymentMethod(ShipCodeDescriptionType value) {
        this.codPaymentMethod = value;
    }

    /**
     * Gets the value of the codBillingOption property.
     * 
     * @return
     *     possible object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public ShipCodeDescriptionType getCODBillingOption() {
        return codBillingOption;
    }

    /**
     * Sets the value of the codBillingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipCodeDescriptionType }
     *     
     */
    public void setCODBillingOption(ShipCodeDescriptionType value) {
        this.codBillingOption = value;
    }

    /**
     * Gets the value of the remitTo property.
     * 
     * @return
     *     possible object is
     *     {@link RemitToType }
     *     
     */
    public RemitToType getRemitTo() {
        return remitTo;
    }

    /**
     * Sets the value of the remitTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitToType }
     *     
     */
    public void setRemitTo(RemitToType value) {
        this.remitTo = value;
    }

}
