
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies how to store shipping documents.
 * 
 * <p>Java class for ShippingDocumentStorageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentStorageDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/vacs/v14}ShippingDocumentStorageDetailType" minOccurs="0"/&gt;
 *         &lt;element name="FilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileNaming" type="{http://fedex.com/ws/vacs/v14}ShippingDocumentNamingType" minOccurs="0"/&gt;
 *         &lt;element name="FileSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentStorageDetail", propOrder = {
    "type",
    "filePath",
    "fileNaming",
    "fileSuffix"
})
public class ShippingDocumentStorageDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentStorageDetailType type;
    @XmlElement(name = "FilePath")
    protected String filePath;
    @XmlElement(name = "FileNaming")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentNamingType fileNaming;
    @XmlElement(name = "FileSuffix")
    protected String fileSuffix;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentStorageDetailType }
     *     
     */
    public ShippingDocumentStorageDetailType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentStorageDetailType }
     *     
     */
    public void setType(ShippingDocumentStorageDetailType value) {
        this.type = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the fileNaming property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentNamingType }
     *     
     */
    public ShippingDocumentNamingType getFileNaming() {
        return fileNaming;
    }

    /**
     * Sets the value of the fileNaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentNamingType }
     *     
     */
    public void setFileNaming(ShippingDocumentNamingType value) {
        this.fileNaming = value;
    }

    /**
     * Gets the value of the fileSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSuffix() {
        return fileSuffix;
    }

    /**
     * Sets the value of the fileSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSuffix(String value) {
        this.fileSuffix = value;
    }

}
