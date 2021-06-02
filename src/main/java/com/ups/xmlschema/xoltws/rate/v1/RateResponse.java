
package com.ups.xmlschema.xoltws.rate.v1;

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
 *         &lt;element name="RatedShipment" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}RatedShipmentType" maxOccurs="unbounded"/&gt;
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
    "ratedShipment"
})
@XmlRootElement(name = "RateResponse")
public class RateResponse {

    @XmlElement(name = "Response", namespace = "http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0", required = true)
    protected ResponseType response;
    @XmlElement(name = "RatedShipment", required = true)
    protected List<RatedShipmentType> ratedShipment;

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
     * Gets the value of the ratedShipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ratedShipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatedShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatedShipmentType }
     * 
     * 
     */
    public List<RatedShipmentType> getRatedShipment() {
        if (ratedShipment == null) {
            ratedShipment = new ArrayList<RatedShipmentType>();
        }
        return this.ratedShipment;
    }

}
