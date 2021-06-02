
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification for sorting and/or segregating performed on shipment.
 * 
 * <p>Java class for SortAndSegregateDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortAndSegregateDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PieceCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://fedex.com/ws/uploaddocument/v17}Weight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortAndSegregateDetail", propOrder = {
    "pieceCount",
    "weight"
})
public class SortAndSegregateDetail {

    @XmlElement(name = "PieceCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pieceCount;
    @XmlElement(name = "Weight")
    protected Weight weight;

    /**
     * Gets the value of the pieceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieceCount() {
        return pieceCount;
    }

    /**
     * Sets the value of the pieceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieceCount(BigInteger value) {
        this.pieceCount = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

}
