
package com.fedex.ws.locs.v12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the special services supported at the clearance location for an individual destination country.
 * 
 * <p>Java class for ClearanceCountryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearanceCountryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClearanceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicesSupported" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServicesSupported" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearanceCountryDetail", propOrder = {
    "clearanceCountry",
    "servicesSupported",
    "specialServicesSupported"
})
public class ClearanceCountryDetail {

    @XmlElement(name = "ClearanceCountry")
    protected String clearanceCountry;
    @XmlElement(name = "ServicesSupported")
    protected List<String> servicesSupported;
    @XmlElement(name = "SpecialServicesSupported")
    protected List<String> specialServicesSupported;

    /**
     * Gets the value of the clearanceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceCountry() {
        return clearanceCountry;
    }

    /**
     * Sets the value of the clearanceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceCountry(String value) {
        this.clearanceCountry = value;
    }

    /**
     * Gets the value of the servicesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the servicesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServicesSupported() {
        if (servicesSupported == null) {
            servicesSupported = new ArrayList<String>();
        }
        return this.servicesSupported;
    }

    /**
     * Gets the value of the specialServicesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specialServicesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServicesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialServicesSupported() {
        if (specialServicesSupported == null) {
            specialServicesSupported = new ArrayList<String>();
        }
        return this.specialServicesSupported;
    }

}
