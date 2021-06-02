
package com.ups.xmlschema.xoltws._if.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CN22FormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CN22FormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintsPerPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelPrintType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CN22Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CN22OtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FoldHereText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CN22Content" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}CN22ContentType" maxOccurs="30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CN22FormType", propOrder = {
    "labelSize",
    "printsPerPage",
    "labelPrintType",
    "cn22Type",
    "cn22OtherDescription",
    "foldHereText",
    "cn22Content"
})
public class CN22FormType {

    @XmlElement(name = "LabelSize")
    protected String labelSize;
    @XmlElement(name = "PrintsPerPage")
    protected String printsPerPage;
    @XmlElement(name = "LabelPrintType")
    protected String labelPrintType;
    @XmlElement(name = "CN22Type")
    protected String cn22Type;
    @XmlElement(name = "CN22OtherDescription")
    protected String cn22OtherDescription;
    @XmlElement(name = "FoldHereText")
    protected String foldHereText;
    @XmlElement(name = "CN22Content")
    protected List<CN22ContentType> cn22Content;

    /**
     * Gets the value of the labelSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelSize() {
        return labelSize;
    }

    /**
     * Sets the value of the labelSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelSize(String value) {
        this.labelSize = value;
    }

    /**
     * Gets the value of the printsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintsPerPage() {
        return printsPerPage;
    }

    /**
     * Sets the value of the printsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintsPerPage(String value) {
        this.printsPerPage = value;
    }

    /**
     * Gets the value of the labelPrintType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelPrintType() {
        return labelPrintType;
    }

    /**
     * Sets the value of the labelPrintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelPrintType(String value) {
        this.labelPrintType = value;
    }

    /**
     * Gets the value of the cn22Type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22Type() {
        return cn22Type;
    }

    /**
     * Sets the value of the cn22Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22Type(String value) {
        this.cn22Type = value;
    }

    /**
     * Gets the value of the cn22OtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN22OtherDescription() {
        return cn22OtherDescription;
    }

    /**
     * Sets the value of the cn22OtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN22OtherDescription(String value) {
        this.cn22OtherDescription = value;
    }

    /**
     * Gets the value of the foldHereText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldHereText() {
        return foldHereText;
    }

    /**
     * Sets the value of the foldHereText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldHereText(String value) {
        this.foldHereText = value;
    }

    /**
     * Gets the value of the cn22Content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cn22Content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCN22Content().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CN22ContentType }
     * 
     * 
     */
    public List<CN22ContentType> getCN22Content() {
        if (cn22Content == null) {
            cn22Content = new ArrayList<CN22ContentType>();
        }
        return this.cn22Content;
    }

}
