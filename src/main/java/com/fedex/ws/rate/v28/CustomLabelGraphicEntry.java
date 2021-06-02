
package com.fedex.ws.rate.v28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Image to be included from printer's memory, or from a local file for offline clients.
 * 
 * <p>Java class for CustomLabelGraphicEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomLabelGraphicEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://fedex.com/ws/rate/v28}CustomLabelPosition" minOccurs="0"/&gt;
 *         &lt;element name="PrinterGraphicId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileGraphicFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLabelGraphicEntry", propOrder = {
    "position",
    "printerGraphicId",
    "fileGraphicFullName"
})
public class CustomLabelGraphicEntry {

    @XmlElement(name = "Position")
    protected CustomLabelPosition position;
    @XmlElement(name = "PrinterGraphicId")
    protected String printerGraphicId;
    @XmlElement(name = "FileGraphicFullName")
    protected String fileGraphicFullName;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelPosition }
     *     
     */
    public CustomLabelPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelPosition }
     *     
     */
    public void setPosition(CustomLabelPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the printerGraphicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterGraphicId() {
        return printerGraphicId;
    }

    /**
     * Sets the value of the printerGraphicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterGraphicId(String value) {
        this.printerGraphicId = value;
    }

    /**
     * Gets the value of the fileGraphicFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileGraphicFullName() {
        return fileGraphicFullName;
    }

    /**
     * Sets the value of the fileGraphicFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileGraphicFullName(String value) {
        this.fileGraphicFullName = value;
    }

}
