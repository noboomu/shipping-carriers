
package com.fedex.ws.openship.v18;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryProhibition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryProhibition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://fedex.com/ws/openship/v18}ProhibitionStatusType" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://fedex.com/ws/openship/v18}ProhibitionSourceType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/openship/v18}ProhibitionType" minOccurs="0"/&gt;
 *         &lt;element name="Categories" type="{http://fedex.com/ws/openship/v18}ShipmentRuleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommodityIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="DerivedHarmonizedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Advisory" type="{http://fedex.com/ws/openship/v18}Message" minOccurs="0"/&gt;
 *         &lt;element name="Waiver" type="{http://fedex.com/ws/openship/v18}RegulatoryWaiver" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryProhibition", propOrder = {
    "status",
    "source",
    "type",
    "categories",
    "commodityIndex",
    "derivedHarmonizedCode",
    "advisory",
    "waiver"
})
public class RegulatoryProhibition {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected ProhibitionStatusType status;
    @XmlElement(name = "Source")
    @XmlSchemaType(name = "string")
    protected ProhibitionSourceType source;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected ProhibitionType type;
    @XmlElement(name = "Categories")
    @XmlSchemaType(name = "string")
    protected List<ShipmentRuleType> categories;
    @XmlElement(name = "CommodityIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger commodityIndex;
    @XmlElement(name = "DerivedHarmonizedCode")
    protected String derivedHarmonizedCode;
    @XmlElement(name = "Advisory")
    protected Message advisory;
    @XmlElement(name = "Waiver")
    protected RegulatoryWaiver waiver;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProhibitionStatusType }
     *     
     */
    public ProhibitionStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProhibitionStatusType }
     *     
     */
    public void setStatus(ProhibitionStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ProhibitionSourceType }
     *     
     */
    public ProhibitionSourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProhibitionSourceType }
     *     
     */
    public void setSource(ProhibitionSourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProhibitionType }
     *     
     */
    public ProhibitionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProhibitionType }
     *     
     */
    public void setType(ProhibitionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentRuleType }
     * 
     * 
     */
    public List<ShipmentRuleType> getCategories() {
        if (categories == null) {
            categories = new ArrayList<ShipmentRuleType>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the commodityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCommodityIndex() {
        return commodityIndex;
    }

    /**
     * Sets the value of the commodityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCommodityIndex(BigInteger value) {
        this.commodityIndex = value;
    }

    /**
     * Gets the value of the derivedHarmonizedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedHarmonizedCode() {
        return derivedHarmonizedCode;
    }

    /**
     * Sets the value of the derivedHarmonizedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedHarmonizedCode(String value) {
        this.derivedHarmonizedCode = value;
    }

    /**
     * Gets the value of the advisory property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getAdvisory() {
        return advisory;
    }

    /**
     * Sets the value of the advisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setAdvisory(Message value) {
        this.advisory = value;
    }

    /**
     * Gets the value of the waiver property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryWaiver }
     *     
     */
    public RegulatoryWaiver getWaiver() {
        return waiver;
    }

    /**
     * Sets the value of the waiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryWaiver }
     *     
     */
    public void setWaiver(RegulatoryWaiver value) {
        this.waiver = value;
    }

}
