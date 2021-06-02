
package com.ups.schema.xpci._1_0.lc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAnswerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAnswerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Question" type="{http://www.ups.com/schema/xpci/1.0/lc}AnswerType" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAnswerType", propOrder = {
    "tariffCode",
    "question"
})
public class ProductAnswerType {

    @XmlElement(name = "TariffCode", required = true)
    protected String tariffCode;
    @XmlElement(name = "Question")
    protected List<AnswerType> question;

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the question property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnswerType }
     * 
     * 
     */
    public List<AnswerType> getQuestion() {
        if (question == null) {
            question = new ArrayList<AnswerType>();
        }
        return this.question;
    }

}
