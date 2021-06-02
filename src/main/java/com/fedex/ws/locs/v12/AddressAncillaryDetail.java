
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Additional information about a physical location, such as suite number, cross street, floor number in a building. These details are not typically a part of a standard address definition; however, these details might help locate the address.
 * 
 * <p>Java class for AddressAncillaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressAncillaryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationInCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationInProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Accessibility" type="{http://fedex.com/ws/locs/v12}LocationAccessibilityType" minOccurs="0"/&gt;
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Suite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Apartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CrossStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalDescriptions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressAncillaryDetail", propOrder = {
    "locationInCity",
    "locationInProperty",
    "accessibility",
    "building",
    "department",
    "roomFloor",
    "suite",
    "apartment",
    "room",
    "crossStreet",
    "additionalDescriptions"
})
public class AddressAncillaryDetail {

    @XmlElement(name = "LocationInCity")
    protected String locationInCity;
    @XmlElement(name = "LocationInProperty")
    protected String locationInProperty;
    @XmlElement(name = "Accessibility")
    @XmlSchemaType(name = "string")
    protected LocationAccessibilityType accessibility;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "RoomFloor")
    protected String roomFloor;
    @XmlElement(name = "Suite")
    protected String suite;
    @XmlElement(name = "Apartment")
    protected String apartment;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "CrossStreet")
    protected String crossStreet;
    @XmlElement(name = "AdditionalDescriptions")
    protected List<String> additionalDescriptions;

    /**
     * Gets the value of the locationInCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationInCity() {
        return locationInCity;
    }

    /**
     * Sets the value of the locationInCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationInCity(String value) {
        this.locationInCity = value;
    }

    /**
     * Gets the value of the locationInProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationInProperty() {
        return locationInProperty;
    }

    /**
     * Sets the value of the locationInProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationInProperty(String value) {
        this.locationInProperty = value;
    }

    /**
     * Gets the value of the accessibility property.
     * 
     * @return
     *     possible object is
     *     {@link LocationAccessibilityType }
     *     
     */
    public LocationAccessibilityType getAccessibility() {
        return accessibility;
    }

    /**
     * Sets the value of the accessibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationAccessibilityType }
     *     
     */
    public void setAccessibility(LocationAccessibilityType value) {
        this.accessibility = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the roomFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomFloor() {
        return roomFloor;
    }

    /**
     * Sets the value of the roomFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomFloor(String value) {
        this.roomFloor = value;
    }

    /**
     * Gets the value of the suite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuite() {
        return suite;
    }

    /**
     * Sets the value of the suite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuite(String value) {
        this.suite = value;
    }

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the crossStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossStreet() {
        return crossStreet;
    }

    /**
     * Sets the value of the crossStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossStreet(String value) {
        this.crossStreet = value;
    }

    /**
     * Gets the value of the additionalDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalDescriptions() {
        if (additionalDescriptions == null) {
            additionalDescriptions = new ArrayList<String>();
        }
        return this.additionalDescriptions;
    }

}
