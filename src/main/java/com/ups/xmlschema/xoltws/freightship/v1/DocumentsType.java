
package com.ups.xmlschema.xoltws.freightship.v1;

import java.util.ArrayList;
import java.util.List;
import com.ups.xmlschema.xoltws._if.v1.InternationalFormType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormGroupIdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}ImageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackingList" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightShip/v1.0}PackingListType" minOccurs="0"/&gt;
 *         &lt;element name="InternationalForms" type="{http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0}InternationalFormType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsType", propOrder = {
    "formGroupId",
    "formGroupIdName",
    "image",
    "packingList",
    "internationalForms"
})
public class DocumentsType {

    @XmlElement(name = "FormGroupId")
    protected String formGroupId;
    @XmlElement(name = "FormGroupIdName")
    protected String formGroupIdName;
    @XmlElement(name = "Image")
    protected List<ImageType> image;
    @XmlElement(name = "PackingList")
    protected PackingListType packingList;
    @XmlElement(name = "InternationalForms")
    protected InternationalFormType internationalForms;

    /**
     * Gets the value of the formGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormGroupId() {
        return formGroupId;
    }

    /**
     * Sets the value of the formGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormGroupId(String value) {
        this.formGroupId = value;
    }

    /**
     * Gets the value of the formGroupIdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormGroupIdName() {
        return formGroupIdName;
    }

    /**
     * Sets the value of the formGroupIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormGroupIdName(String value) {
        this.formGroupIdName = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageType }
     * 
     * 
     */
    public List<ImageType> getImage() {
        if (image == null) {
            image = new ArrayList<ImageType>();
        }
        return this.image;
    }

    /**
     * Gets the value of the packingList property.
     * 
     * @return
     *     possible object is
     *     {@link PackingListType }
     *     
     */
    public PackingListType getPackingList() {
        return packingList;
    }

    /**
     * Sets the value of the packingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingListType }
     *     
     */
    public void setPackingList(PackingListType value) {
        this.packingList = value;
    }

    /**
     * Gets the value of the internationalForms property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalFormType }
     *     
     */
    public InternationalFormType getInternationalForms() {
        return internationalForms;
    }

    /**
     * Sets the value of the internationalForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalFormType }
     *     
     */
    public void setInternationalForms(InternationalFormType value) {
        this.internationalForms = value;
    }

}
