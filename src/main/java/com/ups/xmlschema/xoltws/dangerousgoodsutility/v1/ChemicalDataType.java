
package com.ups.xmlschema.xoltws.dangerousgoodsutility.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChemicalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChemicalDetail" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}ChemicalDetailType" minOccurs="0"/&gt;
 *         &lt;element name="ProperShippingNameDetail" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}ProperShippingNameDetailType" minOccurs="0"/&gt;
 *         &lt;element name="PackageQuantityLimitDetail" type="{http://www.ups.com/XMLSchema/XOLTWS/DangerousGoodsUtility/v1.0}PackageQuantityLimitDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalDataType", propOrder = {
    "chemicalDetail",
    "properShippingNameDetail",
    "packageQuantityLimitDetail"
})
public class ChemicalDataType {

    @XmlElement(name = "ChemicalDetail")
    protected ChemicalDetailType chemicalDetail;
    @XmlElement(name = "ProperShippingNameDetail")
    protected ProperShippingNameDetailType properShippingNameDetail;
    @XmlElement(name = "PackageQuantityLimitDetail")
    protected List<PackageQuantityLimitDetailType> packageQuantityLimitDetail;

    /**
     * Gets the value of the chemicalDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ChemicalDetailType }
     *     
     */
    public ChemicalDetailType getChemicalDetail() {
        return chemicalDetail;
    }

    /**
     * Sets the value of the chemicalDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChemicalDetailType }
     *     
     */
    public void setChemicalDetail(ChemicalDetailType value) {
        this.chemicalDetail = value;
    }

    /**
     * Gets the value of the properShippingNameDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProperShippingNameDetailType }
     *     
     */
    public ProperShippingNameDetailType getProperShippingNameDetail() {
        return properShippingNameDetail;
    }

    /**
     * Sets the value of the properShippingNameDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProperShippingNameDetailType }
     *     
     */
    public void setProperShippingNameDetail(ProperShippingNameDetailType value) {
        this.properShippingNameDetail = value;
    }

    /**
     * Gets the value of the packageQuantityLimitDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packageQuantityLimitDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageQuantityLimitDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageQuantityLimitDetailType }
     * 
     * 
     */
    public List<PackageQuantityLimitDetailType> getPackageQuantityLimitDetail() {
        if (packageQuantityLimitDetail == null) {
            packageQuantityLimitDetail = new ArrayList<PackageQuantityLimitDetailType>();
        }
        return this.packageQuantityLimitDetail;
    }

}
