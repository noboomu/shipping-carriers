
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageResultsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccessibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EuropeBUIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChemicalRecordResults" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}ChemicalRecordResultsType" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageResultsType", propOrder = {
    "packageIdentifier",
    "accessibleIndicator",
    "europeBUIndicator",
    "chemicalRecordResults"
})
public class PackageResultsType {

    @XmlElement(name = "PackageIdentifier", required = true)
    protected String packageIdentifier;
    @XmlElement(name = "AccessibleIndicator")
    protected String accessibleIndicator;
    @XmlElement(name = "EuropeBUIndicator")
    protected String europeBUIndicator;
    @XmlElement(name = "ChemicalRecordResults", required = true)
    protected List<ChemicalRecordResultsType> chemicalRecordResults;

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
     * Gets the value of the accessibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessibleIndicator() {
        return accessibleIndicator;
    }

    /**
     * Sets the value of the accessibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessibleIndicator(String value) {
        this.accessibleIndicator = value;
    }

    /**
     * Gets the value of the europeBUIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuropeBUIndicator() {
        return europeBUIndicator;
    }

    /**
     * Sets the value of the europeBUIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuropeBUIndicator(String value) {
        this.europeBUIndicator = value;
    }

    /**
     * Gets the value of the chemicalRecordResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalRecordResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalRecordResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemicalRecordResultsType }
     * 
     * 
     */
    public List<ChemicalRecordResultsType> getChemicalRecordResults() {
        if (chemicalRecordResults == null) {
            chemicalRecordResults = new ArrayList<ChemicalRecordResultsType>();
        }
        return this.chemicalRecordResults;
    }

}
