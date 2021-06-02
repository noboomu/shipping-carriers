
package com.fedex.ws.track.v19;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PieceCountVerificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PieceCountVerificationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountLocationType" type="{http://fedex.com/ws/track/v19}PieceCountLocationType" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceCountVerificationDetail", propOrder = {
    "countLocationType",
    "count",
    "description"
})
public class PieceCountVerificationDetail {

    @XmlElement(name = "CountLocationType")
    @XmlSchemaType(name = "string")
    protected PieceCountLocationType countLocationType;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the countLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link PieceCountLocationType }
     *     
     */
    public PieceCountLocationType getCountLocationType() {
        return countLocationType;
    }

    /**
     * Sets the value of the countLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PieceCountLocationType }
     *     
     */
    public void setCountLocationType(PieceCountLocationType value) {
        this.countLocationType = value;
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
