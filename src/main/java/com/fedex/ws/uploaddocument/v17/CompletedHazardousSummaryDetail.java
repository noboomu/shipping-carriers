
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletedHazardousSummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedHazardousSummaryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SmallQuantityExceptionPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedHazardousSummaryDetail", propOrder = {
    "smallQuantityExceptionPackageCount"
})
public class CompletedHazardousSummaryDetail {

    @XmlElement(name = "SmallQuantityExceptionPackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallQuantityExceptionPackageCount;

    /**
     * Gets the value of the smallQuantityExceptionPackageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallQuantityExceptionPackageCount() {
        return smallQuantityExceptionPackageCount;
    }

    /**
     * Sets the value of the smallQuantityExceptionPackageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallQuantityExceptionPackageCount(BigInteger value) {
        this.smallQuantityExceptionPackageCount = value;
    }

}
