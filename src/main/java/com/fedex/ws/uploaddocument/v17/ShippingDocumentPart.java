
package com.fedex.ws.uploaddocument.v17;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A single part of a shipping document, such as one page of a multiple-page document whose format requires a separate image per page.
 * 
 * <p>Java class for ShippingDocumentPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentPartSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentPart", propOrder = {
    "documentPartSequenceNumber",
    "image"
})
public class ShippingDocumentPart {

    @XmlElement(name = "DocumentPartSequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger documentPartSequenceNumber;
    @XmlElement(name = "Image")
    protected byte[] image;

    /**
     * Gets the value of the documentPartSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentPartSequenceNumber() {
        return documentPartSequenceNumber;
    }

    /**
     * Sets the value of the documentPartSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentPartSequenceNumber(BigInteger value) {
        this.documentPartSequenceNumber = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

}
