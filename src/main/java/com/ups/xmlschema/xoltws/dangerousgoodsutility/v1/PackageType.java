
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PackageWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}PackageWeightType"/&gt;
 *         &lt;element name="QValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverPackedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChemicalRecord" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}ChemicalRecordType" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "packageIdentifier",
    "packageWeight",
    "qValue",
    "overPackedIndicator",
    "transportationMode",
    "emergencyPhone",
    "emergencyContact",
    "chemicalRecord"
})
public class PackageType {

    @XmlElement(name = "PackageIdentifier", required = true)
    protected String packageIdentifier;
    @XmlElement(name = "PackageWeight", required = true)
    protected PackageWeightType packageWeight;
    @XmlElement(name = "QValue")
    protected String qValue;
    @XmlElement(name = "OverPackedIndicator")
    protected String overPackedIndicator;
    @XmlElement(name = "TransportationMode")
    protected String transportationMode;
    @XmlElement(name = "EmergencyPhone")
    protected String emergencyPhone;
    @XmlElement(name = "EmergencyContact")
    protected String emergencyContact;
    @XmlElement(name = "ChemicalRecord", required = true)
    protected List<ChemicalRecordType> chemicalRecord;

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
     * Gets the value of the packageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PackageWeightType }
     *     
     */
    public PackageWeightType getPackageWeight() {
        return packageWeight;
    }

    /**
     * Sets the value of the packageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageWeightType }
     *     
     */
    public void setPackageWeight(PackageWeightType value) {
        this.packageWeight = value;
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
     * Gets the value of the transportationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationMode() {
        return transportationMode;
    }

    /**
     * Sets the value of the transportationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationMode(String value) {
        this.transportationMode = value;
    }

    /**
     * Gets the value of the emergencyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    /**
     * Sets the value of the emergencyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyPhone(String value) {
        this.emergencyPhone = value;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContact(String value) {
        this.emergencyContact = value;
    }

    /**
     * Gets the value of the chemicalRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalRecordType }
     * 
     * 
     */
    public List<ChemicalRecordType> getChemicalRecord() {
        if (chemicalRecord == null) {
            chemicalRecord = new ArrayList<ChemicalRecordType>();
        }
        return this.chemicalRecord;
    }

}
