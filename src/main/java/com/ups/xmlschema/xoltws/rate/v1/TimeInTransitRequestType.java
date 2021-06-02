
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeInTransitRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInTransitRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageBillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pickup" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PickupType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnContractServices" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ReturnContractServicesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInTransitRequestType", propOrder = {
    "packageBillType",
    "pickup",
    "returnContractServices"
})
public class TimeInTransitRequestType {

    @XmlElement(name = "PackageBillType")
    protected String packageBillType;
    @XmlElement(name = "Pickup")
    protected PickupType pickup;
    @XmlElement(name = "ReturnContractServices")
    protected List<ReturnContractServicesType> returnContractServices;

    /**
     * Gets the value of the packageBillType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageBillType() {
        return packageBillType;
    }

    /**
     * Sets the value of the packageBillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageBillType(String value) {
        this.packageBillType = value;
    }

    /**
     * Gets the value of the pickup property.
     * 
     * @return
     *     possible object is
     *     {@link PickupType }
     *     
     */
    public PickupType getPickup() {
        return pickup;
    }

    /**
     * Sets the value of the pickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupType }
     *     
     */
    public void setPickup(PickupType value) {
        this.pickup = value;
    }

    /**
     * Gets the value of the returnContractServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the returnContractServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnContractServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnContractServicesType }
     * 
     * 
     */
    public List<ReturnContractServicesType> getReturnContractServices() {
        if (returnContractServices == null) {
            returnContractServices = new ArrayList<ReturnContractServicesType>();
        }
        return this.returnContractServices;
    }

}
