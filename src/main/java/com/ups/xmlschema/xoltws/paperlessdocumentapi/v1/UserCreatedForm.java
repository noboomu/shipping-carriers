
package com.ups.xmlschema.xoltws.paperlessdocumentapi.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserCreatedForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCreatedForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserCreatedFormFileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCreatedFormFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="UserCreatedFormFileFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCreatedFormDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="13"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCreatedForm", propOrder = {
    "userCreatedFormFileName",
    "userCreatedFormFile",
    "userCreatedFormFileFormat",
    "userCreatedFormDocumentType"
})
public class UserCreatedForm {

    @XmlElement(name = "UserCreatedFormFileName", required = true)
    protected String userCreatedFormFileName;
    @XmlElement(name = "UserCreatedFormFile", required = true)
    protected byte[] userCreatedFormFile;
    @XmlElement(name = "UserCreatedFormFileFormat", required = true)
    protected String userCreatedFormFileFormat;
    @XmlElement(name = "UserCreatedFormDocumentType", required = true)
    protected List<String> userCreatedFormDocumentType;

    /**
     * Gets the value of the userCreatedFormFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCreatedFormFileName() {
        return userCreatedFormFileName;
    }

    /**
     * Sets the value of the userCreatedFormFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCreatedFormFileName(String value) {
        this.userCreatedFormFileName = value;
    }

    /**
     * Gets the value of the userCreatedFormFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUserCreatedFormFile() {
        return userCreatedFormFile;
    }

    /**
     * Sets the value of the userCreatedFormFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUserCreatedFormFile(byte[] value) {
        this.userCreatedFormFile = value;
    }

    /**
     * Gets the value of the userCreatedFormFileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCreatedFormFileFormat() {
        return userCreatedFormFileFormat;
    }

    /**
     * Sets the value of the userCreatedFormFileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCreatedFormFileFormat(String value) {
        this.userCreatedFormFileFormat = value;
    }

    /**
     * Gets the value of the userCreatedFormDocumentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the userCreatedFormDocumentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserCreatedFormDocumentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserCreatedFormDocumentType() {
        if (userCreatedFormDocumentType == null) {
            userCreatedFormDocumentType = new ArrayList<String>();
        }
        return this.userCreatedFormDocumentType;
    }

}
