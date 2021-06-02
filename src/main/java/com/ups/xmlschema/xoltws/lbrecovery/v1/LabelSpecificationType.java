
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HTTPUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelImageFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelImageFormatType" minOccurs="0"/&gt;
 *         &lt;element name="LabelStockSize" type="{http://www.ups.com/XMLSchema/XOLTWS/LBRecovery/v1.0}LabelStockSizeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelSpecificationType", propOrder = {
    "httpUserAgent",
    "labelImageFormat",
    "labelStockSize"
})
public class LabelSpecificationType {

    @XmlElement(name = "HTTPUserAgent")
    protected String httpUserAgent;
    @XmlElement(name = "LabelImageFormat")
    protected LabelImageFormatType labelImageFormat;
    @XmlElement(name = "LabelStockSize")
    protected LabelStockSizeType labelStockSize;

    /**
     * Gets the value of the httpUserAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTTPUserAgent() {
        return httpUserAgent;
    }

    /**
     * Sets the value of the httpUserAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTTPUserAgent(String value) {
        this.httpUserAgent = value;
    }

    /**
     * Gets the value of the labelImageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LabelImageFormatType }
     *     
     */
    public LabelImageFormatType getLabelImageFormat() {
        return labelImageFormat;
    }

    /**
     * Sets the value of the labelImageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelImageFormatType }
     *     
     */
    public void setLabelImageFormat(LabelImageFormatType value) {
        this.labelImageFormat = value;
    }

    /**
     * Gets the value of the labelStockSize property.
     * 
     * @return
     *     possible object is
     *     {@link LabelStockSizeType }
     *     
     */
    public LabelStockSizeType getLabelStockSize() {
        return labelStockSize;
    }

    /**
     * Sets the value of the labelStockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelStockSizeType }
     *     
     */
    public void setLabelStockSize(LabelStockSizeType value) {
        this.labelStockSize = value;
    }

}
