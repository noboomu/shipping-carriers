
package com.fedex.ws.async.v4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the details about the criteria used for artifact selection during retrieval.
 * 
 * <p>Java class for ArtifactRetrievalFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtifactRetrievalFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/async/v4}ArtifactType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtifactRetrievalFilter", propOrder = {
    "accessReference",
    "type",
    "referenceId"
})
public class ArtifactRetrievalFilter {

    @XmlElement(name = "AccessReference")
    protected String accessReference;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ArtifactType type;
    @XmlElement(name = "ReferenceId")
    protected String referenceId;

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

}
