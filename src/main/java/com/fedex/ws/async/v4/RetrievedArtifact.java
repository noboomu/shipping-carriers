
package com.fedex.ws.async.v4;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievedArtifact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrievedArtifact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HighestSeverity" type="{http://fedex.com/ws/async/v4}NotificationSeverityType" minOccurs="0"/&gt;
 *         &lt;element name="Notifications" type="{http://fedex.com/ws/async/v4}Notification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/async/v4}ArtifactType" minOccurs="0"/&gt;
 *         &lt;element name="Format" type="{http://fedex.com/ws/async/v4}ArtifactFormatType" minOccurs="0"/&gt;
 *         &lt;element name="FormatSpecification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parts" type="{http://fedex.com/ws/async/v4}ArtifactPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievedArtifact", propOrder = {
    "accessReference",
    "highestSeverity",
    "notifications",
    "type",
    "format",
    "formatSpecification",
    "referenceId",
    "parts"
})
public class RetrievedArtifact {

    @XmlElement(name = "AccessReference")
    protected String accessReference;
    @XmlElement(name = "HighestSeverity")
    @XmlSchemaType(name = "string")
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications")
    protected List<Notification> notifications;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ArtifactType type;
    @XmlElement(name = "Format")
    @XmlSchemaType(name = "string")
    protected ArtifactFormatType format;
    @XmlElement(name = "FormatSpecification")
    protected String formatSpecification;
    @XmlElement(name = "ReferenceId")
    protected String referenceId;
    @XmlElement(name = "Parts")
    protected List<ArtifactPart> parts;

    /**
     * Gets the value of the accessReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessReference() {
        return accessReference;
    }

    /**
     * Sets the value of the accessReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessReference(String value) {
        this.accessReference = value;
    }

    /**
     * Gets the value of the highestSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSeverityType }
     *     
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * Sets the value of the highestSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSeverityType }
     *     
     */
    public void setHighestSeverity(NotificationSeverityType value) {
        this.highestSeverity = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<Notification>();
        }
        return this.notifications;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactType }
     *     
     */
    public ArtifactType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactType }
     *     
     */
    public void setType(ArtifactType value) {
        this.type = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactFormatType }
     *     
     */
    public ArtifactFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactFormatType }
     *     
     */
    public void setFormat(ArtifactFormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the formatSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatSpecification() {
        return formatSpecification;
    }

    /**
     * Sets the value of the formatSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatSpecification(String value) {
        this.formatSpecification = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtifactPart }
     * 
     * 
     */
    public List<ArtifactPart> getParts() {
        if (parts == null) {
            parts = new ArrayList<ArtifactPart>();
        }
        return this.parts;
    }

}
