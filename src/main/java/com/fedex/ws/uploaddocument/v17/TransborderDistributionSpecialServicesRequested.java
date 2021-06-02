
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies features of service within a Transborder Distribution shipment.
 * 
 * <p>Java class for TransborderDistributionSpecialServicesRequested complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransborderDistributionSpecialServicesRequested"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialServiceTypes" type="{http://fedex.com/ws/uploaddocument/v17}TransborderDistributionSpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransborderDistributionLtlDetail" type="{http://fedex.com/ws/uploaddocument/v17}TransborderDistributionLtlDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransborderDistributionSpecialServicesRequested", propOrder = {
    "specialServiceTypes",
    "transborderDistributionLtlDetail"
})
public class TransborderDistributionSpecialServicesRequested {

    @XmlElement(name = "SpecialServiceTypes")
    @XmlSchemaType(name = "string")
    protected List<TransborderDistributionSpecialServiceType> specialServiceTypes;
    @XmlElement(name = "TransborderDistributionLtlDetail")
    protected TransborderDistributionLtlDetail transborderDistributionLtlDetail;

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
     * {@link TransborderDistributionSpecialServiceType }
     * 
     * 
     */
    public List<TransborderDistributionSpecialServiceType> getSpecialServiceTypes() {
        if (specialServiceTypes == null) {
            specialServiceTypes = new ArrayList<TransborderDistributionSpecialServiceType>();
        }
        return this.specialServiceTypes;
    }

    /**
     * Gets the value of the transborderDistributionLtlDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TransborderDistributionLtlDetail }
     *     
     */
    public TransborderDistributionLtlDetail getTransborderDistributionLtlDetail() {
        return transborderDistributionLtlDetail;
    }

    /**
     * Sets the value of the transborderDistributionLtlDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransborderDistributionLtlDetail }
     *     
     */
    public void setTransborderDistributionLtlDetail(TransborderDistributionLtlDetail value) {
        this.transborderDistributionLtlDetail = value;
    }

}
