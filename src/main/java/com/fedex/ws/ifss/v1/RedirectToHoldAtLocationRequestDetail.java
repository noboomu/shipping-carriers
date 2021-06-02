
package com.fedex.ws.ifss.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedirectToHoldAtLocationRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedirectToHoldAtLocationRequestDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HoldingLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldingLocationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoldingLocationContactAndAddress" type="{http://fedex.com/ws/ifss/v1}ContactAndAddress" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedirectToHoldAtLocationRequestDetail", propOrder = {
    "holdingLocationId",
    "holdingLocationNumber",
    "holdingLocationContactAndAddress",
    "comments"
})
public class RedirectToHoldAtLocationRequestDetail {

    @XmlElement(name = "HoldingLocationId")
    protected String holdingLocationId;
    @XmlElement(name = "HoldingLocationNumber")
    protected Integer holdingLocationNumber;
    @XmlElement(name = "HoldingLocationContactAndAddress")
    protected ContactAndAddress holdingLocationContactAndAddress;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the holdingLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldingLocationId() {
        return holdingLocationId;
    }

    /**
     * Sets the value of the holdingLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldingLocationId(String value) {
        this.holdingLocationId = value;
    }

    /**
     * Gets the value of the holdingLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoldingLocationNumber() {
        return holdingLocationNumber;
    }

    /**
     * Sets the value of the holdingLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoldingLocationNumber(Integer value) {
        this.holdingLocationNumber = value;
    }

    /**
     * Gets the value of the holdingLocationContactAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getHoldingLocationContactAndAddress() {
        return holdingLocationContactAndAddress;
    }

    /**
     * Sets the value of the holdingLocationContactAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setHoldingLocationContactAndAddress(ContactAndAddress value) {
        this.holdingLocationContactAndAddress = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
