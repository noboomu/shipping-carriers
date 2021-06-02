
package com.fedex.ws.locs.v12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the time and reason to overlay the last drop off time for a carrier at a FedEx location.
 * 
 * <p>Java class for LatestDropoffOverlayDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatestDropoffOverlayDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/locs/v12}LatestDropOffOverlayType" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatestDropoffOverlayDetail", propOrder = {
    "type",
    "time"
})
public class LatestDropoffOverlayDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected LatestDropOffOverlayType type;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LatestDropOffOverlayType }
     *     
     */
    public LatestDropOffOverlayType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestDropOffOverlayType }
     *     
     */
    public void setType(LatestDropOffOverlayType value) {
        this.type = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

}
