
package com.ups.schema.xpci._1_0.dps;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseTransportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeniedPartySearchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseTransportType", propOrder = {
    "deniedPartySearchStatus",
    "warning"
})
public class ResponseTransportType {

    @XmlElement(name = "DeniedPartySearchStatus")
    protected String deniedPartySearchStatus;
    @XmlElement(name = "Warning")
    protected List<String> warning;

    /**
     * Gets the value of the deniedPartySearchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeniedPartySearchStatus() {
        return deniedPartySearchStatus;
    }

    /**
     * Sets the value of the deniedPartySearchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeniedPartySearchStatus(String value) {
        this.deniedPartySearchStatus = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarning() {
        if (warning == null) {
            warning = new ArrayList<String>();
        }
        return this.warning;
    }

}
