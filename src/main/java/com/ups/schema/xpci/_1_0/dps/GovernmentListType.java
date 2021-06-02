
package com.ups.schema.xpci._1_0.dps;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovernmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GovernmentListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListDescription"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ControlAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LastRegulatoryUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeniedParty" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Names" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Addresses" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Address" type="{http://www.ups.com/schema/xpci/1.0/dps}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovernmentListType", propOrder = {
    "listDescription",
    "deniedParty"
})
public class GovernmentListType {

    @XmlElement(name = "ListDescription", required = true)
    protected GovernmentListType.ListDescription listDescription;
    @XmlElement(name = "DeniedParty")
    protected List<GovernmentListType.DeniedParty> deniedParty;

    /**
     * Gets the value of the listDescription property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentListType.ListDescription }
     *     
     */
    public GovernmentListType.ListDescription getListDescription() {
        return listDescription;
    }

    /**
     * Sets the value of the listDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentListType.ListDescription }
     *     
     */
    public void setListDescription(GovernmentListType.ListDescription value) {
        this.listDescription = value;
    }

    /**
     * Gets the value of the deniedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deniedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeniedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernmentListType.DeniedParty }
     * 
     * 
     */
    public List<GovernmentListType.DeniedParty> getDeniedParty() {
        if (deniedParty == null) {
            deniedParty = new ArrayList<GovernmentListType.DeniedParty>();
        }
        return this.deniedParty;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Names" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Addresses" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Address" type="{http://www.ups.com/schema/xpci/1.0/dps}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "names",
        "addresses",
        "remarks"
    })
    public static class DeniedParty {

        @XmlElement(name = "Names")
        protected GovernmentListType.DeniedParty.Names names;
        @XmlElement(name = "Addresses")
        protected GovernmentListType.DeniedParty.Addresses addresses;
        @XmlElement(name = "Remarks")
        protected String remarks;

        /**
         * Gets the value of the names property.
         * 
         * @return
         *     possible object is
         *     {@link GovernmentListType.DeniedParty.Names }
         *     
         */
        public GovernmentListType.DeniedParty.Names getNames() {
            return names;
        }

        /**
         * Sets the value of the names property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovernmentListType.DeniedParty.Names }
         *     
         */
        public void setNames(GovernmentListType.DeniedParty.Names value) {
            this.names = value;
        }

        /**
         * Gets the value of the addresses property.
         * 
         * @return
         *     possible object is
         *     {@link GovernmentListType.DeniedParty.Addresses }
         *     
         */
        public GovernmentListType.DeniedParty.Addresses getAddresses() {
            return addresses;
        }

        /**
         * Sets the value of the addresses property.
         * 
         * @param value
         *     allowed object is
         *     {@link GovernmentListType.DeniedParty.Addresses }
         *     
         */
        public void setAddresses(GovernmentListType.DeniedParty.Addresses value) {
            this.addresses = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Address" type="{http://www.ups.com/schema/xpci/1.0/dps}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "address"
        })
        public static class Addresses {

            @XmlElement(name = "Address")
            protected List<AddressType> address;

            /**
             * Gets the value of the address property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the address property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddress().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddressType }
             * 
             * 
             */
            public List<AddressType> getAddress() {
                if (address == null) {
                    address = new ArrayList<AddressType>();
                }
                return this.address;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name"
        })
        public static class Names {

            @XmlElement(name = "Name", required = true)
            protected List<String> name;

            /**
             * Gets the value of the name property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the name property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getName() {
                if (name == null) {
                    name = new ArrayList<String>();
                }
                return this.name;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ControlAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LastRegulatoryUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listName",
        "description",
        "controlAgency",
        "lastRegulatoryUpdate"
    })
    public static class ListDescription {

        @XmlElement(name = "ListName")
        protected String listName;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "ControlAgency")
        protected String controlAgency;
        @XmlElement(name = "LastRegulatoryUpdate")
        protected String lastRegulatoryUpdate;

        /**
         * Gets the value of the listName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListName() {
            return listName;
        }

        /**
         * Sets the value of the listName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListName(String value) {
            this.listName = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the controlAgency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlAgency() {
            return controlAgency;
        }

        /**
         * Sets the value of the controlAgency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlAgency(String value) {
            this.controlAgency = value;
        }

        /**
         * Gets the value of the lastRegulatoryUpdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastRegulatoryUpdate() {
            return lastRegulatoryUpdate;
        }

        /**
         * Sets the value of the lastRegulatoryUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastRegulatoryUpdate(String value) {
            this.lastRegulatoryUpdate = value;
        }

    }

}
