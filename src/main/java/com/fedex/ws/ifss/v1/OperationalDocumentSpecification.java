
package com.fedex.ws.ifss.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalDocumentSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationalDocumentSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentTypes" type="{http://fedex.com/ws/ifss/v1}OperationalDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SignatureReleaseDocumentDetail" type="{http://fedex.com/ws/ifss/v1}SignatureReleaseDocumentDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalDocumentSpecification", propOrder = {
    "documentTypes",
    "signatureReleaseDocumentDetail"
})
public class OperationalDocumentSpecification {

    @XmlElement(name = "DocumentTypes")
    @XmlSchemaType(name = "string")
    protected List<OperationalDocumentType> documentTypes;
    @XmlElement(name = "SignatureReleaseDocumentDetail")
    protected SignatureReleaseDocumentDetail signatureReleaseDocumentDetail;

    /**
     * Gets the value of the documentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalDocumentType }
     * 
     * 
     */
    public List<OperationalDocumentType> getDocumentTypes() {
        if (documentTypes == null) {
            documentTypes = new ArrayList<OperationalDocumentType>();
        }
        return this.documentTypes;
    }

    /**
     * Gets the value of the signatureReleaseDocumentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureReleaseDocumentDetail }
     *     
     */
    public SignatureReleaseDocumentDetail getSignatureReleaseDocumentDetail() {
        return signatureReleaseDocumentDetail;
    }

    /**
     * Sets the value of the signatureReleaseDocumentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureReleaseDocumentDetail }
     *     
     */
    public void setSignatureReleaseDocumentDetail(SignatureReleaseDocumentDetail value) {
        this.signatureReleaseDocumentDetail = value;
    }

}
