
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the location hours for a location.
 * 
 * <p>Java class for LocationHours complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationHours"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayofWeek" type="{http://fedex.com/ws/locs/v12}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="OperationalHours" type="{http://fedex.com/ws/locs/v12}OperationalHoursType" minOccurs="0"/&gt;
 *         &lt;element name="Hours" type="{http://fedex.com/ws/locs/v12}TimeRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationHours", propOrder = {
    "dayofWeek",
    "operationalHours",
    "hours"
})
public class LocationHours {

    @XmlElement(name = "DayofWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayofWeek;
    @XmlElement(name = "OperationalHours")
    @XmlSchemaType(name = "string")
    protected OperationalHoursType operationalHours;
    @XmlElement(name = "Hours")
    protected List<TimeRange> hours;

    /**
     * Gets the value of the dayofWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayofWeek() {
        return dayofWeek;
    }

    /**
     * Sets the value of the dayofWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayofWeek(DayOfWeekType value) {
        this.dayofWeek = value;
    }

    /**
     * Gets the value of the operationalHours property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalHoursType }
     *     
     */
    public OperationalHoursType getOperationalHours() {
        return operationalHours;
    }

    /**
     * Sets the value of the operationalHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalHoursType }
     *     
     */
    public void setOperationalHours(OperationalHoursType value) {
        this.operationalHours = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeRange }
     * 
     * 
     */
    public List<TimeRange> getHours() {
        if (hours == null) {
            hours = new ArrayList<TimeRange>();
        }
        return this.hours;
    }

}
