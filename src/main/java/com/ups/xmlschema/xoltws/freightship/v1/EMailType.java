
package com.ups.xmlschema.xoltws.freightship.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="EMailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UndeliverableEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMailType", propOrder = {
    "eMailAddress",
    "eMailText",
    "undeliverableEMailAddress",
    "subject"
})
public class EMailType {

    @XmlElement(name = "EMailAddress", required = true)
    protected List<String> eMailAddress;
    @XmlElement(name = "EMailText")
    protected String eMailText;
    @XmlElement(name = "UndeliverableEMailAddress", required = true)
    protected String undeliverableEMailAddress;
    @XmlElement(name = "Subject")
    protected String subject;

    /**
     * Gets the value of the eMailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eMailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEMailAddress() {
        if (eMailAddress == null) {
            eMailAddress = new ArrayList<String>();
        }
        return this.eMailAddress;
    }

    /**
     * Gets the value of the eMailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailText() {
        return eMailText;
    }

    /**
     * Sets the value of the eMailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailText(String value) {
        this.eMailText = value;
    }

    /**
     * Gets the value of the undeliverableEMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndeliverableEMailAddress() {
        return undeliverableEMailAddress;
    }

    /**
     * Sets the value of the undeliverableEMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndeliverableEMailAddress(String value) {
        this.undeliverableEMailAddress = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
