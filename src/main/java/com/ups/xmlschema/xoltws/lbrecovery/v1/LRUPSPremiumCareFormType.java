
package com.ups.xmlschema.xoltws.lbrecovery.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LRUPSPremiumCareFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LRUPSPremiumCareFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRUPSPremiumCareFormType", propOrder = {
    "pageSize",
    "printType"
})
public class LRUPSPremiumCareFormType {

    @XmlElement(name = "PageSize", required = true)
    protected String pageSize;
    @XmlElement(name = "PrintType", required = true)
    protected String printType;

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(String value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the printType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * Sets the value of the printType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintType(String value) {
        this.printType = value;
    }

}
