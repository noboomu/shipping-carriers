
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazMatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazMatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverPackedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllPackedInOneIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HazMatChemicalRecord" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}HazMatChemicalRecordType" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazMatType", propOrder = {
    "packageIdentifier",
    "qValue",
    "overPackedIndicator",
    "allPackedInOneIndicator",
    "hazMatChemicalRecord"
})
public class HazMatType {

    @XmlElement(name = "PackageIdentifier")
    protected String packageIdentifier;
    @XmlElement(name = "QValue")
    protected String qValue;
    @XmlElement(name = "OverPackedIndicator")
    protected String overPackedIndicator;
    @XmlElement(name = "AllPackedInOneIndicator")
    protected String allPackedInOneIndicator;
    @XmlElement(name = "HazMatChemicalRecord", required = true)
    protected List<HazMatChemicalRecordType> hazMatChemicalRecord;

    /**
     * Gets the value of the packageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * Sets the value of the packageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageIdentifier(String value) {
        this.packageIdentifier = value;
    }

    /**
     * Gets the value of the qValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQValue() {
        return qValue;
    }

    /**
     * Sets the value of the qValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQValue(String value) {
        this.qValue = value;
    }

    /**
     * Gets the value of the overPackedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverPackedIndicator() {
        return overPackedIndicator;
    }

    /**
     * Sets the value of the overPackedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverPackedIndicator(String value) {
        this.overPackedIndicator = value;
    }

    /**
     * Gets the value of the allPackedInOneIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPackedInOneIndicator() {
        return allPackedInOneIndicator;
    }

    /**
     * Sets the value of the allPackedInOneIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPackedInOneIndicator(String value) {
        this.allPackedInOneIndicator = value;
    }

    /**
     * Gets the value of the hazMatChemicalRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hazMatChemicalRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazMatChemicalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazMatChemicalRecordType }
     * 
     * 
     */
    public List<HazMatChemicalRecordType> getHazMatChemicalRecord() {
        if (hazMatChemicalRecord == null) {
            hazMatChemicalRecord = new ArrayList<HazMatChemicalRecordType>();
        }
        return this.hazMatChemicalRecord;
    }

}
