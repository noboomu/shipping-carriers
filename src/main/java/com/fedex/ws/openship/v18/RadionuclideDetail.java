
package com.fedex.ws.openship.v18;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadionuclideDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadionuclideDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Radionuclide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Activity" type="{http://fedex.com/ws/openship/v18}RadionuclideActivity" minOccurs="0"/&gt;
 *         &lt;element name="ExceptedPackagingIsReportableQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalForm" type="{http://fedex.com/ws/openship/v18}PhysicalFormType" minOccurs="0"/&gt;
 *         &lt;element name="ChemicalForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadionuclideDetail", propOrder = {
    "radionuclide",
    "activity",
    "exceptedPackagingIsReportableQuantity",
    "physicalForm",
    "chemicalForm"
})
public class RadionuclideDetail {

    @XmlElement(name = "Radionuclide")
    protected String radionuclide;
    @XmlElement(name = "Activity")
    protected RadionuclideActivity activity;
    @XmlElement(name = "ExceptedPackagingIsReportableQuantity")
    protected Boolean exceptedPackagingIsReportableQuantity;
    @XmlElement(name = "PhysicalForm")
    @XmlSchemaType(name = "string")
    protected PhysicalFormType physicalForm;
    @XmlElement(name = "ChemicalForm")
    protected String chemicalForm;

    /**
     * Gets the value of the radionuclide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadionuclide() {
        return radionuclide;
    }

    /**
     * Sets the value of the radionuclide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadionuclide(String value) {
        this.radionuclide = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link RadionuclideActivity }
     *     
     */
    public RadionuclideActivity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadionuclideActivity }
     *     
     */
    public void setActivity(RadionuclideActivity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the exceptedPackagingIsReportableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExceptedPackagingIsReportableQuantity() {
        return exceptedPackagingIsReportableQuantity;
    }

    /**
     * Sets the value of the exceptedPackagingIsReportableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExceptedPackagingIsReportableQuantity(Boolean value) {
        this.exceptedPackagingIsReportableQuantity = value;
    }

    /**
     * Gets the value of the physicalForm property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalFormType }
     *     
     */
    public PhysicalFormType getPhysicalForm() {
        return physicalForm;
    }

    /**
     * Sets the value of the physicalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalFormType }
     *     
     */
    public void setPhysicalForm(PhysicalFormType value) {
        this.physicalForm = value;
    }

    /**
     * Gets the value of the chemicalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalForm() {
        return chemicalForm;
    }

    /**
     * Sets the value of the chemicalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalForm(String value) {
        this.chemicalForm = value;
    }

}
