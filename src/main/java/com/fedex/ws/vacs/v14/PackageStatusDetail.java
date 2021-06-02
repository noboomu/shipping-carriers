
package com.fedex.ws.vacs.v14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageStatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageStatusDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://fedex.com/ws/vacs/v14}PackageLineItemStatusType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeletionDetail" type="{http://fedex.com/ws/vacs/v14}DeletionDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageStatusDetail", propOrder = {
    "status",
    "deletionDetail"
})
public class PackageStatusDetail {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected List<PackageLineItemStatusType> status;
    @XmlElement(name = "DeletionDetail")
    protected DeletionDetail deletionDetail;

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageLineItemStatusType }
     * 
     * 
     */
    public List<PackageLineItemStatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<PackageLineItemStatusType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the deletionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DeletionDetail }
     *     
     */
    public DeletionDetail getDeletionDetail() {
        return deletionDetail;
    }

    /**
     * Sets the value of the deletionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletionDetail }
     *     
     */
    public void setDeletionDetail(DeletionDetail value) {
        this.deletionDetail = value;
    }

}
