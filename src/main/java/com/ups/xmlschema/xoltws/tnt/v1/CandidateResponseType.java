
package com.ups.xmlschema.xoltws.tnt.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CandidateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CandidateResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipFromList" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}ShipListType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToList" type="{http://www.ups.com/XMLSchema/XOLTWS/tnt/v1.0}ShipListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateResponseType", propOrder = {
    "shipFromList",
    "shipToList"
})
public class CandidateResponseType {

    @XmlElement(name = "ShipFromList")
    protected ShipListType shipFromList;
    @XmlElement(name = "ShipToList")
    protected ShipListType shipToList;

    /**
     * Gets the value of the shipFromList property.
     * 
     * @return
     *     possible object is
     *     {@link ShipListType }
     *     
     */
    public ShipListType getShipFromList() {
        return shipFromList;
    }

    /**
     * Sets the value of the shipFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipListType }
     *     
     */
    public void setShipFromList(ShipListType value) {
        this.shipFromList = value;
    }

    /**
     * Gets the value of the shipToList property.
     * 
     * @return
     *     possible object is
     *     {@link ShipListType }
     *     
     */
    public ShipListType getShipToList() {
        return shipToList;
    }

    /**
     * Sets the value of the shipToList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipListType }
     *     
     */
    public void setShipToList(ShipListType value) {
        this.shipToList = value;
    }

}
