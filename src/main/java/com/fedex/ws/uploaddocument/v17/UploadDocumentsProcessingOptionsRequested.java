
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadDocumentsProcessingOptionsRequested complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentsProcessingOptionsRequested"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://fedex.com/ws/uploaddocument/v17}UploadDocumentsProcessingOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostShipmentUploadDetail" type="{http://fedex.com/ws/uploaddocument/v17}PostShipmentUploadDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentsProcessingOptionsRequested", propOrder = {
    "options",
    "postShipmentUploadDetail"
})
public class UploadDocumentsProcessingOptionsRequested {

    @XmlElement(name = "Options")
    @XmlSchemaType(name = "string")
    protected List<UploadDocumentsProcessingOptionType> options;
    @XmlElement(name = "PostShipmentUploadDetail")
    protected PostShipmentUploadDetail postShipmentUploadDetail;

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadDocumentsProcessingOptionType }
     * 
     * 
     */
    public List<UploadDocumentsProcessingOptionType> getOptions() {
        if (options == null) {
            options = new ArrayList<UploadDocumentsProcessingOptionType>();
        }
        return this.options;
    }

    /**
     * Gets the value of the postShipmentUploadDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PostShipmentUploadDetail }
     *     
     */
    public PostShipmentUploadDetail getPostShipmentUploadDetail() {
        return postShipmentUploadDetail;
    }

    /**
     * Sets the value of the postShipmentUploadDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostShipmentUploadDetail }
     *     
     */
    public void setPostShipmentUploadDetail(PostShipmentUploadDetail value) {
        this.postShipmentUploadDetail = value;
    }

}
