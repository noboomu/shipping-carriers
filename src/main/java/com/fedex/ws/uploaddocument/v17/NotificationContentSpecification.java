
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationContentSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationContentSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclusions" type="{http://fedex.com/ws/uploaddocument/v17}NotificationContentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationContentSpecification", propOrder = {
    "exclusions"
})
public class NotificationContentSpecification {

    @XmlElement(name = "Exclusions")
    @XmlSchemaType(name = "string")
    protected List<NotificationContentType> exclusions;

    /**
     * Gets the value of the exclusions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exclusions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationContentType }
     * 
     * 
     */
    public List<NotificationContentType> getExclusions() {
        if (exclusions == null) {
            exclusions = new ArrayList<NotificationContentType>();
        }
        return this.exclusions;
    }

}
