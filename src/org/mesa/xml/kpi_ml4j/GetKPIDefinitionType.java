//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.28 at 11:16:59 AM CST 
//


package org.mesa.xml.kpi_ml4j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GetKPIDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetKPIDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/KPI-ML-V01}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Get" type="{http://www.mesa.org/xml/KPI-ML-V01}TransGetType"/>
 *                   &lt;element name="KPIDefinition" type="{http://www.mesa.org/xml/KPI-ML-V01}KPIDefinitionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="releaseID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="versionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetKPIDefinitionType", propOrder = {
    "applicationArea",
    "dataArea"
})
public class GetKPIDefinitionType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected GetKPIDefinitionType.DataArea dataArea;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String versionID;

    /**
     * Gets the value of the applicationArea property.
     * 
     * @return
     *     possible object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public TransApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * Sets the value of the applicationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public void setApplicationArea(TransApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link GetKPIDefinitionType.DataArea }
     *     
     */
    public GetKPIDefinitionType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetKPIDefinitionType.DataArea }
     *     
     */
    public void setDataArea(GetKPIDefinitionType.DataArea value) {
        this.dataArea = value;
    }

    /**
     * Gets the value of the releaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        return releaseID;
    }

    /**
     * Sets the value of the releaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the versionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Get" type="{http://www.mesa.org/xml/KPI-ML-V01}TransGetType"/>
     *         &lt;element name="KPIDefinition" type="{http://www.mesa.org/xml/KPI-ML-V01}KPIDefinitionType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "get",
        "kpiDefinition"
    })
    public static class DataArea {

        @XmlElement(name = "Get", required = true)
        protected TransGetType get;
        @XmlElement(name = "KPIDefinition", required = true)
        protected List<KPIDefinitionType> kpiDefinition;

        /**
         * Gets the value of the get property.
         * 
         * @return
         *     possible object is
         *     {@link TransGetType }
         *     
         */
        public TransGetType getGet() {
            return get;
        }

        /**
         * Sets the value of the get property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransGetType }
         *     
         */
        public void setGet(TransGetType value) {
            this.get = value;
        }

        /**
         * Gets the value of the kpiDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kpiDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKPIDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KPIDefinitionType }
         * 
         * 
         */
        public List<KPIDefinitionType> getKPIDefinition() {
            if (kpiDefinition == null) {
                kpiDefinition = new ArrayList<KPIDefinitionType>();
            }
            return this.kpiDefinition;
        }

    }

}
