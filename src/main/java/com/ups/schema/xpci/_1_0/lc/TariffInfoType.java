
package com.ups.schema.xpci._1_0.lc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryTariffCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryDetailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInfoType", propOrder = {
    "tariffCode",
    "detailID",
    "secondaryTariffCode",
    "secondaryDetailID"
})
public class TariffInfoType {

    @XmlElement(name = "TariffCode", required = true)
    protected String tariffCode;
    @XmlElement(name = "DetailID")
    protected String detailID;
    @XmlElement(name = "SecondaryTariffCode")
    protected String secondaryTariffCode;
    @XmlElement(name = "SecondaryDetailID")
    protected String secondaryDetailID;

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the detailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailID() {
        return detailID;
    }

    /**
     * Sets the value of the detailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailID(String value) {
        this.detailID = value;
    }

    /**
     * Gets the value of the secondaryTariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryTariffCode() {
        return secondaryTariffCode;
    }

    /**
     * Sets the value of the secondaryTariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryTariffCode(String value) {
        this.secondaryTariffCode = value;
    }

    /**
     * Gets the value of the secondaryDetailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDetailID() {
        return secondaryDetailID;
    }

    /**
     * Sets the value of the secondaryDetailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDetailID(String value) {
        this.secondaryDetailID = value;
    }

}
