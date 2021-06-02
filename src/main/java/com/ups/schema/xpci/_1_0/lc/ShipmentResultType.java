
package com.ups.schema.xpci._1_0.lc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product" type="{http://www.ups.com/schema/xpci/1.0/lc}ProductResultType" maxOccurs="99"/&gt;
 *         &lt;element name="Question" type="{http://www.ups.com/schema/xpci/1.0/lc}QuestionType" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentResultType", propOrder = {
    "product",
    "question"
})
public class ShipmentResultType {

    @XmlElement(name = "Product", required = true)
    protected List<ProductResultType> product;
    @XmlElement(name = "Question")
    protected List<QuestionType> question;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductResultType }
     * 
     * 
     */
    public List<ProductResultType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductResultType>();
        }
        return this.product;
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
     * {@link QuestionType }
     * 
     * 
     */
    public List<QuestionType> getQuestion() {
        if (question == null) {
            question = new ArrayList<QuestionType>();
        }
        return this.question;
    }

}
