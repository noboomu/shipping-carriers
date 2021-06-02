
package com.fedex.ws.rate.v28;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies additional labels to be produced. All required labels for shipments will be produced without the need to request additional labels. These are only available as thermal labels.
 * 
 * <p>Java class for AdditionalLabelsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalLabelsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/rate/v28}AdditionalLabelsType" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalLabelsDetail", propOrder = {
    "type",
    "count"
})
public class AdditionalLabelsDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AdditionalLabelsType type;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalLabelsType }
     *     
     */
    public AdditionalLabelsType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalLabelsType }
     *     
     */
    public void setType(AdditionalLabelsType value) {
        this.type = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

}
