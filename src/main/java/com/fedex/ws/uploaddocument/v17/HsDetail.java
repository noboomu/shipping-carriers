
package com.fedex.ws.uploaddocument.v17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitsOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExciseDetails" type="{http://fedex.com/ws/uploaddocument/v17}ExciseDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InCoTerms" type="{http://fedex.com/ws/uploaddocument/v17}InternationalCommercialTermsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Ancestry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HsDetail", propOrder = {
    "code",
    "description",
    "unitsOfMeasure",
    "exciseDetails",
    "inCoTerms",
    "ancestry"
})
public class HsDetail {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "UnitsOfMeasure")
    protected List<String> unitsOfMeasure;
    @XmlElement(name = "ExciseDetails")
    protected List<ExciseDetail> exciseDetails;
    @XmlElement(name = "InCoTerms")
    @XmlSchemaType(name = "string")
    protected List<InternationalCommercialTermsType> inCoTerms;
    @XmlElement(name = "Ancestry")
    protected String ancestry;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the unitsOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unitsOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnitsOfMeasure() {
        if (unitsOfMeasure == null) {
            unitsOfMeasure = new ArrayList<String>();
        }
        return this.unitsOfMeasure;
    }

    /**
     * Gets the value of the exciseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exciseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExciseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExciseDetail }
     * 
     * 
     */
    public List<ExciseDetail> getExciseDetails() {
        if (exciseDetails == null) {
            exciseDetails = new ArrayList<ExciseDetail>();
        }
        return this.exciseDetails;
    }

    /**
     * Gets the value of the inCoTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inCoTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInCoTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalCommercialTermsType }
     * 
     * 
     */
    public List<InternationalCommercialTermsType> getInCoTerms() {
        if (inCoTerms == null) {
            inCoTerms = new ArrayList<InternationalCommercialTermsType>();
        }
        return this.inCoTerms;
    }

    /**
     * Gets the value of the ancestry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncestry() {
        return ancestry;
    }

    /**
     * Sets the value of the ancestry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncestry(String value) {
        this.ancestry = value;
    }

}
