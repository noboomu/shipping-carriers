
package com.ups.xmlschema.xoltws._if.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForwardAgent" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ForwardAgentType" minOccurs="0"/&gt;
 *         &lt;element name="UltimateConsignee" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}UltimateConsigneeType" minOccurs="0"/&gt;
 *         &lt;element name="IntermediateConsignee" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}IntermediateConsigneeType" minOccurs="0"/&gt;
 *         &lt;element name="Producer" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}ProducerType" minOccurs="0"/&gt;
 *         &lt;element name="SoldTo" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}SoldToType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "forwardAgent",
    "ultimateConsignee",
    "intermediateConsignee",
    "producer",
    "soldTo"
})
public class ContactType {

    @XmlElement(name = "ForwardAgent")
    protected ForwardAgentType forwardAgent;
    @XmlElement(name = "UltimateConsignee")
    protected UltimateConsigneeType ultimateConsignee;
    @XmlElement(name = "IntermediateConsignee")
    protected IntermediateConsigneeType intermediateConsignee;
    @XmlElement(name = "Producer")
    protected ProducerType producer;
    @XmlElement(name = "SoldTo")
    protected SoldToType soldTo;

    /**
     * Gets the value of the forwardAgent property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardAgentType }
     *     
     */
    public ForwardAgentType getForwardAgent() {
        return forwardAgent;
    }

    /**
     * Sets the value of the forwardAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardAgentType }
     *     
     */
    public void setForwardAgent(ForwardAgentType value) {
        this.forwardAgent = value;
    }

    /**
     * Gets the value of the ultimateConsignee property.
     * 
     * @return
     *     possible object is
     *     {@link UltimateConsigneeType }
     *     
     */
    public UltimateConsigneeType getUltimateConsignee() {
        return ultimateConsignee;
    }

    /**
     * Sets the value of the ultimateConsignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link UltimateConsigneeType }
     *     
     */
    public void setUltimateConsignee(UltimateConsigneeType value) {
        this.ultimateConsignee = value;
    }

    /**
     * Gets the value of the intermediateConsignee property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateConsigneeType }
     *     
     */
    public IntermediateConsigneeType getIntermediateConsignee() {
        return intermediateConsignee;
    }

    /**
     * Sets the value of the intermediateConsignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateConsigneeType }
     *     
     */
    public void setIntermediateConsignee(IntermediateConsigneeType value) {
        this.intermediateConsignee = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerType }
     *     
     */
    public ProducerType getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerType }
     *     
     */
    public void setProducer(ProducerType value) {
        this.producer = value;
    }

    /**
     * Gets the value of the soldTo property.
     * 
     * @return
     *     possible object is
     *     {@link SoldToType }
     *     
     */
    public SoldToType getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoldToType }
     *     
     */
    public void setSoldTo(SoldToType value) {
        this.soldTo = value;
    }

}
