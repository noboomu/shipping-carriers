
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the location details and other information relevant to the location that is derived from the inputs provided in the request.
 * 
 * <p>Java class for DistanceAndLocationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceAndLocationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Distance" type="{http://fedex.com/ws/locs/v12}Distance" minOccurs="0"/&gt;
 *         &lt;element name="ReservationAvailabilityDetail" type="{http://fedex.com/ws/locs/v12}ReservationAvailabilityDetail" minOccurs="0"/&gt;
 *         &lt;element name="SupportedRedirectToHoldServices" type="{http://fedex.com/ws/locs/v12}SupportedRedirectToHoldServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocationDetail" type="{http://fedex.com/ws/locs/v12}LocationDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceAndLocationDetail", propOrder = {
    "distance",
    "reservationAvailabilityDetail",
    "supportedRedirectToHoldServices",
    "locationDetail"
})
public class DistanceAndLocationDetail {

    @XmlElement(name = "Distance")
    protected Distance distance;
    @XmlElement(name = "ReservationAvailabilityDetail")
    protected ReservationAvailabilityDetail reservationAvailabilityDetail;
    @XmlElement(name = "SupportedRedirectToHoldServices")
    @XmlSchemaType(name = "string")
    protected List<SupportedRedirectToHoldServiceType> supportedRedirectToHoldServices;
    @XmlElement(name = "LocationDetail")
    protected LocationDetail locationDetail;

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the reservationAvailabilityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationAvailabilityDetail }
     *     
     */
    public ReservationAvailabilityDetail getReservationAvailabilityDetail() {
        return reservationAvailabilityDetail;
    }

    /**
     * Sets the value of the reservationAvailabilityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationAvailabilityDetail }
     *     
     */
    public void setReservationAvailabilityDetail(ReservationAvailabilityDetail value) {
        this.reservationAvailabilityDetail = value;
    }

    /**
     * Gets the value of the supportedRedirectToHoldServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedRedirectToHoldServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedRedirectToHoldServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedRedirectToHoldServiceType }
     * 
     * 
     */
    public List<SupportedRedirectToHoldServiceType> getSupportedRedirectToHoldServices() {
        if (supportedRedirectToHoldServices == null) {
            supportedRedirectToHoldServices = new ArrayList<SupportedRedirectToHoldServiceType>();
        }
        return this.supportedRedirectToHoldServices;
    }

    /**
     * Gets the value of the locationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetail }
     *     
     */
    public LocationDetail getLocationDetail() {
        return locationDetail;
    }

    /**
     * Sets the value of the locationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetail }
     *     
     */
    public void setLocationDetail(LocationDetail value) {
        this.locationDetail = value;
    }

}
