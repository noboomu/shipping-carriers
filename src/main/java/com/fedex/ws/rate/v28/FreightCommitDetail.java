
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about the Freight Service Centers associated with this shipment.
 * 
 * <p>Java class for FreightCommitDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightCommitDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginDetail" type="{http://fedex.com/ws/rate/v28}FreightServiceCenterDetail" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDetail" type="{http://fedex.com/ws/rate/v28}FreightServiceCenterDetail" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistance" type="{http://fedex.com/ws/rate/v28}Distance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightCommitDetail", propOrder = {
    "originDetail",
    "destinationDetail",
    "totalDistance"
})
public class FreightCommitDetail {

    @XmlElement(name = "OriginDetail")
    protected FreightServiceCenterDetail originDetail;
    @XmlElement(name = "DestinationDetail")
    protected FreightServiceCenterDetail destinationDetail;
    @XmlElement(name = "TotalDistance")
    protected Distance totalDistance;

    /**
     * Gets the value of the originDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreightServiceCenterDetail }
     *     
     */
    public FreightServiceCenterDetail getOriginDetail() {
        return originDetail;
    }

    /**
     * Sets the value of the originDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightServiceCenterDetail }
     *     
     */
    public void setOriginDetail(FreightServiceCenterDetail value) {
        this.originDetail = value;
    }

    /**
     * Gets the value of the destinationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreightServiceCenterDetail }
     *     
     */
    public FreightServiceCenterDetail getDestinationDetail() {
        return destinationDetail;
    }

    /**
     * Sets the value of the destinationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightServiceCenterDetail }
     *     
     */
    public void setDestinationDetail(FreightServiceCenterDetail value) {
        this.destinationDetail = value;
    }

    /**
     * Gets the value of the totalDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getTotalDistance() {
        return totalDistance;
    }

    /**
     * Sets the value of the totalDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setTotalDistance(Distance value) {
        this.totalDistance = value;
    }

}
