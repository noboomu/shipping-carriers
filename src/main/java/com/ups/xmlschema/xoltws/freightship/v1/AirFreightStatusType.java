
package com.ups.xmlschema.xoltws.freightship.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirFreightStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirFreightStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}StatusType"/&gt;
 *         &lt;element name="PreAuthorizationReason" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}PreAuthReasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirFreightStatusType", propOrder = {
    "status",
    "preAuthorizationReason"
})
public class AirFreightStatusType {

    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "PreAuthorizationReason")
    protected List<PreAuthReasonType> preAuthorizationReason;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the preAuthorizationReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the preAuthorizationReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAuthorizationReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreAuthReasonType }
     * 
     * 
     */
    public List<PreAuthReasonType> getPreAuthorizationReason() {
        if (preAuthorizationReason == null) {
            preAuthorizationReason = new ArrayList<PreAuthReasonType>();
        }
        return this.preAuthorizationReason;
    }

}
