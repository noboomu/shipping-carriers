
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentRequirementsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentRequirementsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequiredDocuments" type="{http://fedex.com/ws/uploaddocument/v17}RequiredDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GenerationDetails" type="{http://fedex.com/ws/uploaddocument/v17}DocumentGenerationDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProhibitedDocuments" type="{http://fedex.com/ws/uploaddocument/v17}EnterpriseDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRequirementsDetail", propOrder = {
    "requiredDocuments",
    "generationDetails",
    "prohibitedDocuments"
})
public class DocumentRequirementsDetail {

    @XmlElement(name = "RequiredDocuments")
    @XmlSchemaType(name = "string")
    protected List<RequiredDocumentType> requiredDocuments;
    @XmlElement(name = "GenerationDetails")
    protected List<DocumentGenerationDetail> generationDetails;
    @XmlElement(name = "ProhibitedDocuments")
    @XmlSchemaType(name = "string")
    protected List<EnterpriseDocumentType> prohibitedDocuments;

    /**
     * Gets the value of the requiredDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the requiredDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredDocumentType }
     * 
     * 
     */
    public List<RequiredDocumentType> getRequiredDocuments() {
        if (requiredDocuments == null) {
            requiredDocuments = new ArrayList<RequiredDocumentType>();
        }
        return this.requiredDocuments;
    }

    /**
     * Gets the value of the generationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGenerationDetail }
     * 
     * 
     */
    public List<DocumentGenerationDetail> getGenerationDetails() {
        if (generationDetails == null) {
            generationDetails = new ArrayList<DocumentGenerationDetail>();
        }
        return this.generationDetails;
    }

    /**
     * Gets the value of the prohibitedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the prohibitedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProhibitedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnterpriseDocumentType }
     * 
     * 
     */
    public List<EnterpriseDocumentType> getProhibitedDocuments() {
        if (prohibitedDocuments == null) {
            prohibitedDocuments = new ArrayList<EnterpriseDocumentType>();
        }
        return this.prohibitedDocuments;
    }

}
