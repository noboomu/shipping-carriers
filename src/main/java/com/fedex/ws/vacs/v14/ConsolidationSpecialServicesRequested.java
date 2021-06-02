
package com.fedex.ws.vacs.v14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * These special services are available at the consolidation level for some or all consolidation types. If the shipper is requesting a special service which requires additional data (such as the COD amount), the consolidation special service type must be present in the specialServiceTypes collection, and the supporting detail must be provided in the appropriate sub-object below.
 * 
 * <p>Java class for ConsolidationSpecialServicesRequested complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidationSpecialServicesRequested"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialServiceTypes" type="{http://fedex.com/ws/vacs/v14}ConsolidationSpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriorityAlertDetail" type="{http://fedex.com/ws/vacs/v14}PriorityAlertDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidationSpecialServicesRequested", propOrder = {
    "specialServiceTypes",
    "priorityAlertDetail"
})
public class ConsolidationSpecialServicesRequested {

    @XmlElement(name = "SpecialServiceTypes")
    @XmlSchemaType(name = "string")
    protected List<ConsolidationSpecialServiceType> specialServiceTypes;
    @XmlElement(name = "PriorityAlertDetail")
    protected PriorityAlertDetail priorityAlertDetail;

    /**
     * Gets the value of the specialServiceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidationSpecialServiceType }
     * 
     * 
     */
    public List<ConsolidationSpecialServiceType> getSpecialServiceTypes() {
        if (specialServiceTypes == null) {
            specialServiceTypes = new ArrayList<ConsolidationSpecialServiceType>();
        }
        return this.specialServiceTypes;
    }

    /**
     * Gets the value of the priorityAlertDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityAlertDetail }
     *     
     */
    public PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }

    /**
     * Sets the value of the priorityAlertDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityAlertDetail }
     *     
     */
    public void setPriorityAlertDetail(PriorityAlertDetail value) {
        this.priorityAlertDetail = value;
    }

}
