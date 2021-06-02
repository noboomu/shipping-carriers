
package com.fedex.ws.openship.v18;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalDistributionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalDistributionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DropoffType" type="{http://fedex.com/ws/openship/v18}DropoffType" minOccurs="0"/&gt;
 *         &lt;element name="TotalDimensions" type="{http://fedex.com/ws/openship/v18}Dimensions" minOccurs="0"/&gt;
 *         &lt;element name="TotalInsuredValue" type="{http://fedex.com/ws/openship/v18}Money" minOccurs="0"/&gt;
 *         &lt;element name="UnitSystem" type="{http://fedex.com/ws/openship/v18}UnitSystemType" minOccurs="0"/&gt;
 *         &lt;element name="DeclarationCurrencies" type="{http://fedex.com/ws/openship/v18}DeclarationCurrency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceFacilityLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalDistributionDetail", propOrder = {
    "dropoffType",
    "totalDimensions",
    "totalInsuredValue",
    "unitSystem",
    "declarationCurrencies",
    "clearanceFacilityLocationId"
})
public class InternationalDistributionDetail {

    @XmlElement(name = "DropoffType")
    @XmlSchemaType(name = "string")
    protected DropoffType dropoffType;
    @XmlElement(name = "TotalDimensions")
    protected Dimensions totalDimensions;
    @XmlElement(name = "TotalInsuredValue")
    protected Money totalInsuredValue;
    @XmlElement(name = "UnitSystem")
    @XmlSchemaType(name = "string")
    protected UnitSystemType unitSystem;
    @XmlElement(name = "DeclarationCurrencies")
    protected List<DeclarationCurrency> declarationCurrencies;
    @XmlElement(name = "ClearanceFacilityLocationId")
    protected String clearanceFacilityLocationId;

    /**
     * Gets the value of the dropoffType property.
     * 
     * @return
     *     possible object is
     *     {@link DropoffType }
     *     
     */
    public DropoffType getDropoffType() {
        return dropoffType;
    }

    /**
     * Sets the value of the dropoffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropoffType }
     *     
     */
    public void setDropoffType(DropoffType value) {
        this.dropoffType = value;
    }

    /**
     * Gets the value of the totalDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getTotalDimensions() {
        return totalDimensions;
    }

    /**
     * Sets the value of the totalDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setTotalDimensions(Dimensions value) {
        this.totalDimensions = value;
    }

    /**
     * Gets the value of the totalInsuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalInsuredValue() {
        return totalInsuredValue;
    }

    /**
     * Sets the value of the totalInsuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalInsuredValue(Money value) {
        this.totalInsuredValue = value;
    }

    /**
     * Gets the value of the unitSystem property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSystemType }
     *     
     */
    public UnitSystemType getUnitSystem() {
        return unitSystem;
    }

    /**
     * Sets the value of the unitSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSystemType }
     *     
     */
    public void setUnitSystem(UnitSystemType value) {
        this.unitSystem = value;
    }

    /**
     * Gets the value of the declarationCurrencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the declarationCurrencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarationCurrencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclarationCurrency }
     * 
     * 
     */
    public List<DeclarationCurrency> getDeclarationCurrencies() {
        if (declarationCurrencies == null) {
            declarationCurrencies = new ArrayList<DeclarationCurrency>();
        }
        return this.declarationCurrencies;
    }

    /**
     * Gets the value of the clearanceFacilityLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceFacilityLocationId() {
        return clearanceFacilityLocationId;
    }

    /**
     * Sets the value of the clearanceFacilityLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceFacilityLocationId(String value) {
        this.clearanceFacilityLocationId = value;
    }

}
