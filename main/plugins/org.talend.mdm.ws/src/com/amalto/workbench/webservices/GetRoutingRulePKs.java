
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoutingRulePKs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoutingRulePKs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetRoutingRulePKs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingRulePKs", propOrder = {
    "arg0"
})
public class GetRoutingRulePKs {

    protected WSGetRoutingRulePKs arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetRoutingRulePKs() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetRoutingRulePKs(final WSGetRoutingRulePKs arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetRoutingRulePKs }
     *     
     */
    public WSGetRoutingRulePKs getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetRoutingRulePKs }
     *     
     */
    public void setArg0(WSGetRoutingRulePKs value) {
        this.arg0 = value;
    }

}
