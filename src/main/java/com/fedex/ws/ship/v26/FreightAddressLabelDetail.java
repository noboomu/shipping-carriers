
package com.fedex.ws.ship.v26;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data required to produce the Freight handling-unit-level address labels. Note that the number of UNIQUE labels (the N as in 1 of N, 2 of N, etc.) is determined by total handling units.
 * 
 * <p>Java class for FreightAddressLabelDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightAddressLabelDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Format" type="{http://fedex.com/ws/ship/v26}ShippingDocumentFormat" minOccurs="0"/&gt;
 *         &lt;element name="Copies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="StartingPosition" type="{http://fedex.com/ws/ship/v26}PageQuadrantType" minOccurs="0"/&gt;
 *         &lt;element name="DocTabContent" type="{http://fedex.com/ws/ship/v26}DocTabContent" minOccurs="0"/&gt;
 *         &lt;element name="CustomContentPosition" type="{http://fedex.com/ws/ship/v26}RelativeVerticalPositionType" minOccurs="0"/&gt;
 *         &lt;element name="CustomContent" type="{http://fedex.com/ws/ship/v26}CustomLabelDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightAddressLabelDetail", propOrder = {
    "format",
    "copies",
    "startingPosition",
    "docTabContent",
    "customContentPosition",
    "customContent"
})
public class FreightAddressLabelDetail {

    @XmlElement(name = "Format")
    protected ShippingDocumentFormat format;
    @XmlElement(name = "Copies")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger copies;
    @XmlElement(name = "StartingPosition")
    @XmlSchemaType(name = "string")
    protected PageQuadrantType startingPosition;
    @XmlElement(name = "DocTabContent")
    protected DocTabContent docTabContent;
    @XmlElement(name = "CustomContentPosition")
    @XmlSchemaType(name = "string")
    protected RelativeVerticalPositionType customContentPosition;
    @XmlElement(name = "CustomContent")
    protected CustomLabelDetail customContent;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public void setFormat(ShippingDocumentFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the copies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCopies() {
        return copies;
    }

    /**
     * Sets the value of the copies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCopies(BigInteger value) {
        this.copies = value;
    }

    /**
     * Gets the value of the startingPosition property.
     * 
     * @return
     *     possible object is
     *     {@link PageQuadrantType }
     *     
     */
    public PageQuadrantType getStartingPosition() {
        return startingPosition;
    }

    /**
     * Sets the value of the startingPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageQuadrantType }
     *     
     */
    public void setStartingPosition(PageQuadrantType value) {
        this.startingPosition = value;
    }

    /**
     * Gets the value of the docTabContent property.
     * 
     * @return
     *     possible object is
     *     {@link DocTabContent }
     *     
     */
    public DocTabContent getDocTabContent() {
        return docTabContent;
    }

    /**
     * Sets the value of the docTabContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabContent }
     *     
     */
    public void setDocTabContent(DocTabContent value) {
        this.docTabContent = value;
    }

    /**
     * Gets the value of the customContentPosition property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public RelativeVerticalPositionType getCustomContentPosition() {
        return customContentPosition;
    }

    /**
     * Sets the value of the customContentPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public void setCustomContentPosition(RelativeVerticalPositionType value) {
        this.customContentPosition = value;
    }

    /**
     * Gets the value of the customContent property.
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelDetail }
     *     
     */
    public CustomLabelDetail getCustomContent() {
        return customContent;
    }

    /**
     * Sets the value of the customContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelDetail }
     *     
     */
    public void setCustomContent(CustomLabelDetail value) {
        this.customContent = value;
    }

}
