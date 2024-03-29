
package com.ups.xmlschema.xoltws.ship.v1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="LabelImageFormat" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}LabelImageFormatType"/&gt;
 *         &lt;element name="HTTPUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelStockSize" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}LabelStockSizeType" minOccurs="0"/&gt;
 *         &lt;element name="Instruction" type="{http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0}InstructionCodeDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CharacterSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "labelImageFormat",
    "httpUserAgent",
    "labelStockSize",
    "instruction",
    "characterSet"
})
public class LabelSpecificationType {

    @XmlElement(name = "LabelImageFormat", required = true)
    protected LabelImageFormatType labelImageFormat;
    @XmlElement(name = "HTTPUserAgent")
    protected String httpUserAgent;
    @XmlElement(name = "LabelStockSize")
    protected LabelStockSizeType labelStockSize;
    @XmlElement(name = "Instruction")
    protected List<InstructionCodeDescriptionType> instruction;
    @XmlElement(name = "CharacterSet")
    protected String characterSet;

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

    /**
     * Gets the value of the instruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the instruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionCodeDescriptionType }
     * 
     * 
     */
    public List<InstructionCodeDescriptionType> getInstruction() {
        if (instruction == null) {
            instruction = new ArrayList<InstructionCodeDescriptionType>();
        }
        return this.instruction;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSet(String value) {
        this.characterSet = value;
    }

}
