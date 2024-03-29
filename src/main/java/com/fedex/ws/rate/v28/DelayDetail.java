
package com.fedex.ws.rate.v28;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about why a shipment delivery is delayed and at what level( country/service etc.).
 * 
 * <p>Java class for DelayDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelayDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeek" type="{http://fedex.com/ws/rate/v28}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://fedex.com/ws/rate/v28}DelayLevelType" minOccurs="0"/&gt;
 *         &lt;element name="Point" type="{http://fedex.com/ws/rate/v28}DelayPointType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/rate/v28}CommitmentDelayType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayDetail", propOrder = {
    "date",
    "dayOfWeek",
    "level",
    "point",
    "type",
    "description"
})
public class DelayDetail {

    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayOfWeek;
    @XmlElement(name = "Level")
    @XmlSchemaType(name = "string")
    protected DelayLevelType level;
    @XmlElement(name = "Point")
    @XmlSchemaType(name = "string")
    protected DelayPointType point;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected CommitmentDelayType type;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link DelayLevelType }
     *     
     */
    public DelayLevelType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayLevelType }
     *     
     */
    public void setLevel(DelayLevelType value) {
        this.level = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link DelayPointType }
     *     
     */
    public DelayPointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayPointType }
     *     
     */
    public void setPoint(DelayPointType value) {
        this.point = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentDelayType }
     *     
     */
    public CommitmentDelayType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentDelayType }
     *     
     */
    public void setType(CommitmentDelayType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
