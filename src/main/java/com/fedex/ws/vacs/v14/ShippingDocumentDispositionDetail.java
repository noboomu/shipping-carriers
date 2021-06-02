
package com.fedex.ws.vacs.v14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Each occurrence of this class specifies a particular way in which a kind of shipping document is to be produced and provided.
 * 
 * <p>Java class for ShippingDocumentDispositionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentDispositionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DispositionType" type="{http://fedex.com/ws/vacs/v14}ShippingDocumentDispositionType" minOccurs="0"/&gt;
 *         &lt;element name="Grouping" type="{http://fedex.com/ws/vacs/v14}ShippingDocumentGroupingType" minOccurs="0"/&gt;
 *         &lt;element name="StorageDetail" type="{http://fedex.com/ws/vacs/v14}ShippingDocumentStorageDetail" minOccurs="0"/&gt;
 *         &lt;element name="EMailDetail" type="{http://fedex.com/ws/vacs/v14}ShippingDocumentEMailDetail" minOccurs="0"/&gt;
 *         &lt;element name="PrintDetail" type="{http://fedex.com/ws/vacs/v14}ShippingDocumentPrintDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentDispositionDetail", propOrder = {
    "dispositionType",
    "grouping",
    "storageDetail",
    "eMailDetail",
    "printDetail"
})
public class ShippingDocumentDispositionDetail {

    @XmlElement(name = "DispositionType")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentDispositionType dispositionType;
    @XmlElement(name = "Grouping")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentGroupingType grouping;
    @XmlElement(name = "StorageDetail")
    protected ShippingDocumentStorageDetail storageDetail;
    @XmlElement(name = "EMailDetail")
    protected ShippingDocumentEMailDetail eMailDetail;
    @XmlElement(name = "PrintDetail")
    protected ShippingDocumentPrintDetail printDetail;

    /**
     * Gets the value of the dispositionType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public ShippingDocumentDispositionType getDispositionType() {
        return dispositionType;
    }

    /**
     * Sets the value of the dispositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public void setDispositionType(ShippingDocumentDispositionType value) {
        this.dispositionType = value;
    }

    /**
     * Gets the value of the grouping property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentGroupingType }
     *     
     */
    public ShippingDocumentGroupingType getGrouping() {
        return grouping;
    }

    /**
     * Sets the value of the grouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentGroupingType }
     *     
     */
    public void setGrouping(ShippingDocumentGroupingType value) {
        this.grouping = value;
    }

    /**
     * Gets the value of the storageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentStorageDetail }
     *     
     */
    public ShippingDocumentStorageDetail getStorageDetail() {
        return storageDetail;
    }

    /**
     * Sets the value of the storageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentStorageDetail }
     *     
     */
    public void setStorageDetail(ShippingDocumentStorageDetail value) {
        this.storageDetail = value;
    }

    /**
     * Gets the value of the eMailDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentEMailDetail }
     *     
     */
    public ShippingDocumentEMailDetail getEMailDetail() {
        return eMailDetail;
    }

    /**
     * Sets the value of the eMailDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentEMailDetail }
     *     
     */
    public void setEMailDetail(ShippingDocumentEMailDetail value) {
        this.eMailDetail = value;
    }

    /**
     * Gets the value of the printDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentPrintDetail }
     *     
     */
    public ShippingDocumentPrintDetail getPrintDetail() {
        return printDetail;
    }

    /**
     * Sets the value of the printDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentPrintDetail }
     *     
     */
    public void setPrintDetail(ShippingDocumentPrintDetail value) {
        this.printDetail = value;
    }

}
