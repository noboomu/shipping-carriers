
package com.fedex.ws.rate.v28;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the optional features/characteristics requested for a Freight shipment utilizing a flatbed trailer.
 * 
 * <p>Java class for FlatbedTrailerDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlatbedTrailerDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://fedex.com/ws/rate/v28}FlatbedTrailerOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlatbedTrailerDetail", propOrder = {
    "options"
})
public class FlatbedTrailerDetail {

    @XmlElement(name = "Options")
    @XmlSchemaType(name = "string")
    protected List<FlatbedTrailerOption> options;

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlatbedTrailerOption }
     * 
     * 
     */
    public List<FlatbedTrailerOption> getOptions() {
        if (options == null) {
            options = new ArrayList<FlatbedTrailerOption>();
        }
        return this.options;
    }

}
