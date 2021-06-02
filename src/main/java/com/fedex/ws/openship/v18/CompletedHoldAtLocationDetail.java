
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletedHoldAtLocationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedHoldAtLocationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HoldingLocation" type="{http://fedex.com/ws/openship/v18}ContactAndAddress" minOccurs="0"/&gt;
 *         &lt;element name="HoldingLocationType" type="{http://fedex.com/ws/openship/v18}FedExLocationType" minOccurs="0"/&gt;
 *         &lt;element name="HoldingLocationTypeForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedHoldAtLocationDetail", propOrder = {
    "holdingLocation",
    "holdingLocationType",
    "holdingLocationTypeForDisplay"
})
public class CompletedHoldAtLocationDetail {

    @XmlElement(name = "HoldingLocation")
    protected ContactAndAddress holdingLocation;
    @XmlElement(name = "HoldingLocationType")
    @XmlSchemaType(name = "string")
    protected FedExLocationType holdingLocationType;
    @XmlElement(name = "HoldingLocationTypeForDisplay")
    protected String holdingLocationTypeForDisplay;

    /**
     * Gets the value of the holdingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getHoldingLocation() {
        return holdingLocation;
    }

    /**
     * Sets the value of the holdingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setHoldingLocation(ContactAndAddress value) {
        this.holdingLocation = value;
    }

    /**
     * Gets the value of the holdingLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link FedExLocationType }
     *     
     */
    public FedExLocationType getHoldingLocationType() {
        return holdingLocationType;
    }

    /**
     * Sets the value of the holdingLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedExLocationType }
     *     
     */
    public void setHoldingLocationType(FedExLocationType value) {
        this.holdingLocationType = value;
    }

    /**
     * Gets the value of the holdingLocationTypeForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldingLocationTypeForDisplay() {
        return holdingLocationTypeForDisplay;
    }

    /**
     * Sets the value of the holdingLocationTypeForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldingLocationTypeForDisplay(String value) {
        this.holdingLocationTypeForDisplay = value;
    }

}
