
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the latest time by which a package can be dropped off at a FedEx location.
 * 
 * <p>Java class for LatestDropOffDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatestDropOffDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeek" type="{http://fedex.com/ws/locs/v12}DayOfWeekType" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="Overlays" type="{http://fedex.com/ws/locs/v12}LatestDropoffOverlayDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatestDropOffDetail", propOrder = {
    "dayOfWeek",
    "time",
    "overlays"
})
public class LatestDropOffDetail {

    @XmlElement(name = "DayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayOfWeek;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Overlays")
    protected List<LatestDropoffOverlayDetail> overlays;

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

    /**
     * Gets the value of the overlays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the overlays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverlays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LatestDropoffOverlayDetail }
     * 
     * 
     */
    public List<LatestDropoffOverlayDetail> getOverlays() {
        if (overlays == null) {
            overlays = new ArrayList<LatestDropoffOverlayDetail>();
        }
        return this.overlays;
    }

}
