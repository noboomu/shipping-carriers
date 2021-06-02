
package com.fedex.ws.ifss.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatedDeliveryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatedDeliveryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPieces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalNetCharge" type="{http://fedex.com/ws/ifss/v1}Money" minOccurs="0"/&gt;
 *         &lt;element name="TotalSurcharges" type="{http://fedex.com/ws/ifss/v1}Money" minOccurs="0"/&gt;
 *         &lt;element name="Surcharges" type="{http://fedex.com/ws/ifss/v1}Surcharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedDeliveryDetail", propOrder = {
    "totalPieces",
    "totalNetCharge",
    "totalSurcharges",
    "surcharges"
})
public class RatedDeliveryDetail {

    @XmlElement(name = "TotalPieces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalPieces;
    @XmlElement(name = "TotalNetCharge")
    protected Money totalNetCharge;
    @XmlElement(name = "TotalSurcharges")
    protected Money totalSurcharges;
    @XmlElement(name = "Surcharges")
    protected List<Surcharge> surcharges;

    /**
     * Gets the value of the totalPieces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPieces() {
        return totalPieces;
    }

    /**
     * Sets the value of the totalPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPieces(BigInteger value) {
        this.totalPieces = value;
    }

    /**
     * Gets the value of the totalNetCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalNetCharge() {
        return totalNetCharge;
    }

    /**
     * Sets the value of the totalNetCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalNetCharge(Money value) {
        this.totalNetCharge = value;
    }

    /**
     * Gets the value of the totalSurcharges property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalSurcharges() {
        return totalSurcharges;
    }

    /**
     * Sets the value of the totalSurcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalSurcharges(Money value) {
        this.totalSurcharges = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the surcharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Surcharge }
     * 
     * 
     */
    public List<Surcharge> getSurcharges() {
        if (surcharges == null) {
            surcharges = new ArrayList<Surcharge>();
        }
        return this.surcharges;
    }

}
