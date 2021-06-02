
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the type and location id of a distribution location used to process a consolidation.
 * 
 * <p>Java class for RequestedDistributionLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedDistributionLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/uploaddocument/v17}FedExDistributionLocationType" minOccurs="0"/&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationContactAndAddress" type="{http://fedex.com/ws/uploaddocument/v17}ContactAndAddress" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InclusionSpecifications" type="{http://fedex.com/ws/uploaddocument/v17}ShipmentInclusionSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedDistributionLocation", propOrder = {
    "id",
    "type",
    "locationId",
    "locationNumber",
    "locationContactAndAddress",
    "clearanceNumber",
    "inclusionSpecifications"
})
public class RequestedDistributionLocation {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected FedExDistributionLocationType type;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "LocationNumber")
    protected Integer locationNumber;
    @XmlElement(name = "LocationContactAndAddress")
    protected ContactAndAddress locationContactAndAddress;
    @XmlElement(name = "ClearanceNumber")
    protected String clearanceNumber;
    @XmlElement(name = "InclusionSpecifications")
    protected List<ShipmentInclusionSpecification> inclusionSpecifications;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FedExDistributionLocationType }
     *     
     */
    public FedExDistributionLocationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedExDistributionLocationType }
     *     
     */
    public void setType(FedExDistributionLocationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the locationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationNumber() {
        return locationNumber;
    }

    /**
     * Sets the value of the locationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationNumber(Integer value) {
        this.locationNumber = value;
    }

    /**
     * Gets the value of the locationContactAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    /**
     * Sets the value of the locationContactAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setLocationContactAndAddress(ContactAndAddress value) {
        this.locationContactAndAddress = value;
    }

    /**
     * Gets the value of the clearanceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceNumber() {
        return clearanceNumber;
    }

    /**
     * Sets the value of the clearanceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceNumber(String value) {
        this.clearanceNumber = value;
    }

    /**
     * Gets the value of the inclusionSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inclusionSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclusionSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentInclusionSpecification }
     * 
     * 
     */
    public List<ShipmentInclusionSpecification> getInclusionSpecifications() {
        if (inclusionSpecifications == null) {
            inclusionSpecifications = new ArrayList<ShipmentInclusionSpecification>();
        }
        return this.inclusionSpecifications;
    }

}
