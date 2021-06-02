
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the relationship between the address specificed and the address of the FedEx Location in terms of distance.
 * 
 * <p>Java class for AddressToLocationRelationshipDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressToLocationRelationshipDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MatchedAddress" type="{http://fedex.com/ws/locs/v12}Address" minOccurs="0"/&gt;
 *         &lt;element name="MatchedAddressGeographicCoordinates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistanceAndLocationDetails" type="{http://fedex.com/ws/locs/v12}DistanceAndLocationDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressToLocationRelationshipDetail", propOrder = {
    "matchedAddress",
    "matchedAddressGeographicCoordinates",
    "distanceAndLocationDetails"
})
public class AddressToLocationRelationshipDetail {

    @XmlElement(name = "MatchedAddress")
    protected Address matchedAddress;
    @XmlElement(name = "MatchedAddressGeographicCoordinates")
    protected String matchedAddressGeographicCoordinates;
    @XmlElement(name = "DistanceAndLocationDetails")
    protected List<DistanceAndLocationDetail> distanceAndLocationDetails;

    /**
     * Gets the value of the matchedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMatchedAddress() {
        return matchedAddress;
    }

    /**
     * Sets the value of the matchedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMatchedAddress(Address value) {
        this.matchedAddress = value;
    }

    /**
     * Gets the value of the matchedAddressGeographicCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchedAddressGeographicCoordinates() {
        return matchedAddressGeographicCoordinates;
    }

    /**
     * Sets the value of the matchedAddressGeographicCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchedAddressGeographicCoordinates(String value) {
        this.matchedAddressGeographicCoordinates = value;
    }

    /**
     * Gets the value of the distanceAndLocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the distanceAndLocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistanceAndLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistanceAndLocationDetail }
     * 
     * 
     */
    public List<DistanceAndLocationDetail> getDistanceAndLocationDetails() {
        if (distanceAndLocationDetails == null) {
            distanceAndLocationDetails = new ArrayList<DistanceAndLocationDetail>();
        }
        return this.distanceAndLocationDetails;
    }

}
