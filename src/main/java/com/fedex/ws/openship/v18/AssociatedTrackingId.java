
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Identifies a relationship from one tracked entity to another.
 * 
 * <p>Java class for AssociatedTrackingId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedTrackingId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}AssociatedTrackingIdType" minOccurs="0"/&gt;
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/openship/v18}TrackingId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedTrackingId", propOrder = {
    "type",
    "trackingId"
})
public class AssociatedTrackingId {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AssociatedTrackingIdType type;
    @XmlElement(name = "TrackingId")
    protected TrackingId trackingId;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedTrackingIdType }
     *     
     */
    public AssociatedTrackingIdType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedTrackingIdType }
     *     
     */
    public void setType(AssociatedTrackingIdType value) {
        this.type = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setTrackingId(TrackingId value) {
        this.trackingId = value;
    }

}
