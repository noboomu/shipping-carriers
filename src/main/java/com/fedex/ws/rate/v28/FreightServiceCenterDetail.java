
package com.fedex.ws.rate.v28;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This class describes the relationship between a customer-specified address and the FedEx Freight / FedEx National Freight Service Center that supports that address.
 * 
 * <p>Java class for FreightServiceCenterDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightServiceCenterDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterlineCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InterlineCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocalService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalDistance" type="{http://fedex.com/ws/rate/v28}Distance" minOccurs="0"/&gt;
 *         &lt;element name="LocalDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="LocalServiceScheduling" type="{http://fedex.com/ws/rate/v28}FreightServiceSchedulingType" minOccurs="0"/&gt;
 *         &lt;element name="LimitedServiceDays" type="{http://fedex.com/ws/rate/v28}DayOfWeekType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GatewayLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactAndAddress" type="{http://fedex.com/ws/rate/v28}ContactAndAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightServiceCenterDetail", propOrder = {
    "interlineCarrierCode",
    "interlineCarrierName",
    "additionalDays",
    "localService",
    "localDistance",
    "localDuration",
    "localServiceScheduling",
    "limitedServiceDays",
    "gatewayLocationId",
    "location",
    "contactAndAddress"
})
public class FreightServiceCenterDetail {

    @XmlElement(name = "InterlineCarrierCode")
    protected String interlineCarrierCode;
    @XmlElement(name = "InterlineCarrierName")
    protected String interlineCarrierName;
    @XmlElement(name = "AdditionalDays")
    protected Integer additionalDays;
    @XmlElement(name = "LocalService")
    protected String localService;
    @XmlElement(name = "LocalDistance")
    protected Distance localDistance;
    @XmlElement(name = "LocalDuration")
    protected Duration localDuration;
    @XmlElement(name = "LocalServiceScheduling")
    @XmlSchemaType(name = "string")
    protected FreightServiceSchedulingType localServiceScheduling;
    @XmlElement(name = "LimitedServiceDays")
    @XmlSchemaType(name = "string")
    protected List<DayOfWeekType> limitedServiceDays;
    @XmlElement(name = "GatewayLocationId")
    protected String gatewayLocationId;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "ContactAndAddress")
    protected ContactAndAddress contactAndAddress;

    /**
     * Gets the value of the interlineCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlineCarrierCode() {
        return interlineCarrierCode;
    }

    /**
     * Sets the value of the interlineCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlineCarrierCode(String value) {
        this.interlineCarrierCode = value;
    }

    /**
     * Gets the value of the interlineCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlineCarrierName() {
        return interlineCarrierName;
    }

    /**
     * Sets the value of the interlineCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlineCarrierName(String value) {
        this.interlineCarrierName = value;
    }

    /**
     * Gets the value of the additionalDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalDays() {
        return additionalDays;
    }

    /**
     * Sets the value of the additionalDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalDays(Integer value) {
        this.additionalDays = value;
    }

    /**
     * Gets the value of the localService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalService() {
        return localService;
    }

    /**
     * Sets the value of the localService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalService(String value) {
        this.localService = value;
    }

    /**
     * Gets the value of the localDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getLocalDistance() {
        return localDistance;
    }

    /**
     * Sets the value of the localDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setLocalDistance(Distance value) {
        this.localDistance = value;
    }

    /**
     * Gets the value of the localDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLocalDuration() {
        return localDuration;
    }

    /**
     * Sets the value of the localDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLocalDuration(Duration value) {
        this.localDuration = value;
    }

    /**
     * Gets the value of the localServiceScheduling property.
     * 
     * @return
     *     possible object is
     *     {@link FreightServiceSchedulingType }
     *     
     */
    public FreightServiceSchedulingType getLocalServiceScheduling() {
        return localServiceScheduling;
    }

    /**
     * Sets the value of the localServiceScheduling property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightServiceSchedulingType }
     *     
     */
    public void setLocalServiceScheduling(FreightServiceSchedulingType value) {
        this.localServiceScheduling = value;
    }

    /**
     * Gets the value of the limitedServiceDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the limitedServiceDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitedServiceDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekType }
     * 
     * 
     */
    public List<DayOfWeekType> getLimitedServiceDays() {
        if (limitedServiceDays == null) {
            limitedServiceDays = new ArrayList<DayOfWeekType>();
        }
        return this.limitedServiceDays;
    }

    /**
     * Gets the value of the gatewayLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayLocationId() {
        return gatewayLocationId;
    }

    /**
     * Sets the value of the gatewayLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayLocationId(String value) {
        this.gatewayLocationId = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the contactAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getContactAndAddress() {
        return contactAndAddress;
    }

    /**
     * Sets the value of the contactAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setContactAndAddress(ContactAndAddress value) {
        this.contactAndAddress = value;
    }

}
