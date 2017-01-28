//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.28 at 11:16:59 AM CST 
//


package org.mesa.xml.kpi_ml4j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransSenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransSenderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalID" type="{http://www.mesa.org/xml/KPI-ML-V01}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ComponentID" type="{http://www.mesa.org/xml/KPI-ML-V01}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TaskID" type="{http://www.mesa.org/xml/KPI-ML-V01}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.mesa.org/xml/KPI-ML-V01}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ConfirmationCode" type="{http://www.mesa.org/xml/KPI-ML-V01}TransConfirmationCodeType" minOccurs="0"/>
 *         &lt;element name="AuthorizationID" type="{http://www.mesa.org/xml/KPI-ML-V01}IdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransSenderType", propOrder = {
    "logicalID",
    "componentID",
    "taskID",
    "referenceID",
    "confirmationCode",
    "authorizationID"
})
public class TransSenderType {

    @XmlElement(name = "LogicalID")
    protected IdentifierType logicalID;
    @XmlElement(name = "ComponentID")
    protected IdentifierType componentID;
    @XmlElement(name = "TaskID")
    protected IdentifierType taskID;
    @XmlElement(name = "ReferenceID")
    protected IdentifierType referenceID;
    @XmlElement(name = "ConfirmationCode")
    protected TransConfirmationCodeType confirmationCode;
    @XmlElement(name = "AuthorizationID")
    protected IdentifierType authorizationID;

    /**
     * Gets the value of the logicalID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLogicalID() {
        return logicalID;
    }

    /**
     * Sets the value of the logicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLogicalID(IdentifierType value) {
        this.logicalID = value;
    }

    /**
     * Gets the value of the componentID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getComponentID() {
        return componentID;
    }

    /**
     * Sets the value of the componentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setComponentID(IdentifierType value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setTaskID(IdentifierType value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setReferenceID(IdentifierType value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the confirmationCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransConfirmationCodeType }
     *     
     */
    public TransConfirmationCodeType getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * Sets the value of the confirmationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransConfirmationCodeType }
     *     
     */
    public void setConfirmationCode(TransConfirmationCodeType value) {
        this.confirmationCode = value;
    }

    /**
     * Gets the value of the authorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Sets the value of the authorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setAuthorizationID(IdentifierType value) {
        this.authorizationID = value;
    }

}
