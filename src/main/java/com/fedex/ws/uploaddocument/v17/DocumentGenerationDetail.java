
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentGenerationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentGenerationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/uploaddocument/v17}EnterpriseDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumCopiesRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Letterhead" type="{http://fedex.com/ws/uploaddocument/v17}RequirementType" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicSignature" type="{http://fedex.com/ws/uploaddocument/v17}RequirementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentGenerationDetail", propOrder = {
    "type",
    "minimumCopiesRequired",
    "letterhead",
    "electronicSignature"
})
public class DocumentGenerationDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected EnterpriseDocumentType type;
    @XmlElement(name = "MinimumCopiesRequired")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumCopiesRequired;
    @XmlElement(name = "Letterhead")
    @XmlSchemaType(name = "string")
    protected RequirementType letterhead;
    @XmlElement(name = "ElectronicSignature")
    @XmlSchemaType(name = "string")
    protected RequirementType electronicSignature;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseDocumentType }
     *     
     */
    public EnterpriseDocumentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseDocumentType }
     *     
     */
    public void setType(EnterpriseDocumentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the minimumCopiesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumCopiesRequired() {
        return minimumCopiesRequired;
    }

    /**
     * Sets the value of the minimumCopiesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumCopiesRequired(BigInteger value) {
        this.minimumCopiesRequired = value;
    }

    /**
     * Gets the value of the letterhead property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getLetterhead() {
        return letterhead;
    }

    /**
     * Sets the value of the letterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setLetterhead(RequirementType value) {
        this.letterhead = value;
    }

    /**
     * Gets the value of the electronicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getElectronicSignature() {
        return electronicSignature;
    }

    /**
     * Sets the value of the electronicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setElectronicSignature(RequirementType value) {
        this.electronicSignature = value;
    }

}
