
package com.fedex.ws.uploaddocument.v17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageUploadStatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageUploadStatusDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://fedex.com/ws/uploaddocument/v17}ImageId" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://fedex.com/ws/uploaddocument/v17}UploadImageStatusType" minOccurs="0"/&gt;
 *         &lt;element name="StatusInfo" type="{http://fedex.com/ws/uploaddocument/v17}UploadImageStatusInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageUploadStatusDetail", propOrder = {
    "id",
    "status",
    "statusInfo",
    "message"
})
public class ImageUploadStatusDetail {

    @XmlElement(name = "Id")
    @XmlSchemaType(name = "string")
    protected ImageId id;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected UploadImageStatusType status;
    @XmlElement(name = "StatusInfo")
    @XmlSchemaType(name = "string")
    protected UploadImageStatusInfoType statusInfo;
    @XmlElement(name = "Message")
    protected String message;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ImageId }
     *     
     */
    public ImageId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageId }
     *     
     */
    public void setId(ImageId value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UploadImageStatusType }
     *     
     */
    public UploadImageStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadImageStatusType }
     *     
     */
    public void setStatus(UploadImageStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UploadImageStatusInfoType }
     *     
     */
    public UploadImageStatusInfoType getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadImageStatusInfoType }
     *     
     */
    public void setStatusInfo(UploadImageStatusInfoType value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
