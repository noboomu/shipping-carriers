
package com.fedex.ws.track.v19;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingDateOrTimestamp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingDateOrTimestamp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v19}TrackingDateOrTimestampType" minOccurs="0"/&gt;
 *         &lt;element name="DateOrTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingDateOrTimestamp", propOrder = {
    "type",
    "dateOrTimestamp"
})
public class TrackingDateOrTimestamp {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected TrackingDateOrTimestampType type;
    @XmlElement(name = "DateOrTimestamp")
    protected String dateOrTimestamp;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDateOrTimestampType }
     *     
     */
    public TrackingDateOrTimestampType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDateOrTimestampType }
     *     
     */
    public void setType(TrackingDateOrTimestampType value) {
        this.type = value;
    }

    /**
     * Gets the value of the dateOrTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOrTimestamp() {
        return dateOrTimestamp;
    }

    /**
     * Sets the value of the dateOrTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOrTimestamp(String value) {
        this.dateOrTimestamp = value;
    }

}
