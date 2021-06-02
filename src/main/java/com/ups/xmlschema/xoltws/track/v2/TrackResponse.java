
package com.ups.xmlschema.xoltws.track.v2;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws.common.v1.ResponseType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0}Response"/&gt;
 *         &lt;element name="Shipment" type="{http://www.ups.com/XMLSchema/XOLTWS/Track/v2.0}ShipmentType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response",
    "shipment",
    "disclaimer"
})
@XmlRootElement(name = "TrackResponse")
public class TrackResponse {

    @XmlElement(name = "Response", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected ResponseType response;
    @XmlElement(name = "Shipment", required = true)
    protected List<ShipmentType> shipment;
    @XmlElement(name = "Disclaimer")
    protected List<String> disclaimer;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getShipment() {
        if (shipment == null) {
            shipment = new ArrayList<ShipmentType>();
        }
        return this.shipment;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisclaimer() {
        if (disclaimer == null) {
            disclaimer = new ArrayList<String>();
        }
        return this.disclaimer;
    }

}
