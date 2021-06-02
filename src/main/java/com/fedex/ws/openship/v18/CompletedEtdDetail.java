
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletedEtdDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedEtdDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}CompletedEtdType" minOccurs="0"/&gt;
 *         &lt;element name="UploadDocumentReferenceDetails" type="{http://fedex.com/ws/openship/v18}UploadDocumentReferenceDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedEtdDetail", propOrder = {
    "folderId",
    "type",
    "uploadDocumentReferenceDetails"
})
public class CompletedEtdDetail {

    @XmlElement(name = "FolderId")
    protected String folderId;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected CompletedEtdType type;
    @XmlElement(name = "UploadDocumentReferenceDetails")
    protected List<UploadDocumentReferenceDetail> uploadDocumentReferenceDetails;

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedEtdType }
     *     
     */
    public CompletedEtdType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedEtdType }
     *     
     */
    public void setType(CompletedEtdType value) {
        this.type = value;
    }

    /**
     * Gets the value of the uploadDocumentReferenceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the uploadDocumentReferenceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUploadDocumentReferenceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadDocumentReferenceDetail }
     * 
     * 
     */
    public List<UploadDocumentReferenceDetail> getUploadDocumentReferenceDetails() {
        if (uploadDocumentReferenceDetails == null) {
            uploadDocumentReferenceDetails = new ArrayList<UploadDocumentReferenceDetail>();
        }
        return this.uploadDocumentReferenceDetails;
    }

}
