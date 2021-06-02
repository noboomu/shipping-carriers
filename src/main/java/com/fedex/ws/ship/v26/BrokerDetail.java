
package com.fedex.ws.ship.v26;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrokerDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokerDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v26}BrokerType" minOccurs="0"/&gt;
 *         &lt;element name="Broker" type="{http://fedex.com/ws/ship/v26}Party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerDetail", propOrder = {
    "type",
    "broker"
})
public class BrokerDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected BrokerType type;
    @XmlElement(name = "Broker")
    protected Party broker;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerType }
     *     
     */
    public BrokerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerType }
     *     
     */
    public void setType(BrokerType value) {
        this.type = value;
    }

    /**
     * Gets the value of the broker property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getBroker() {
        return broker;
    }

    /**
     * Sets the value of the broker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setBroker(Party value) {
        this.broker = value;
    }

}
