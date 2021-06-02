
package com.fedex.ws.ship.v26;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityAlertDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityAlertDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnhancementTypes" type="{http://fedex.com/ws/ship/v26}PriorityAlertEnhancementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityAlertDetail", propOrder = {
    "enhancementTypes",
    "content"
})
public class PriorityAlertDetail {

    @XmlElement(name = "EnhancementTypes")
    @XmlSchemaType(name = "string")
    protected List<PriorityAlertEnhancementType> enhancementTypes;
    @XmlElement(name = "Content", required = true)
    protected List<String> content;

    /**
     * Gets the value of the enhancementTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the enhancementTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancementTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityAlertEnhancementType }
     * 
     * 
     */
    public List<PriorityAlertEnhancementType> getEnhancementTypes() {
        if (enhancementTypes == null) {
            enhancementTypes = new ArrayList<PriorityAlertEnhancementType>();
        }
        return this.enhancementTypes;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContent() {
        if (content == null) {
            content = new ArrayList<String>();
        }
        return this.content;
    }

}
