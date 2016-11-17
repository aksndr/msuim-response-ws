
package ru.terralink.ws.object.request;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDataExchangeHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDataExchangeHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectNumber_ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectTypeDiff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDataExchangeHeader", namespace = "http://inform.gazprom.ru/C/SUIM/REDataExchange", propOrder = {
    "logicalSystem",
    "objectType",
    "objectNumber",
    "objectNumberExt",
    "activity",
    "objectTypeDiff",
    "destination"
})
@Component("REDataExchangeHeader")
public class REDataExchangeHeader {

    @XmlElement(name = "LogicalSystem", required = true)
    protected String logicalSystem;
    @XmlElement(name = "ObjectType", required = true)
    protected String objectType;
    @XmlElement(name = "ObjectNumber", required = true)
    protected String objectNumber;
    @XmlElement(name = "ObjectNumber_ext")
    protected String objectNumberExt;
    @XmlElement(name = "Activity", required = true)
    protected String activity;
    @XmlElement(name = "ObjectTypeDiff", required = true)
    protected String objectTypeDiff;
    @XmlElement(name = "Destination", required = true)
    protected String destination;

    /**
     * Gets the value of the logicalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalSystem() {
        return logicalSystem;
    }

    /**
     * Sets the value of the logicalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalSystem(String value) {
        this.logicalSystem = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /**
     * Sets the value of the objectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNumber(String value) {
        this.objectNumber = value;
    }

    /**
     * Gets the value of the objectNumberExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNumberExt() {
        return objectNumberExt;
    }

    /**
     * Sets the value of the objectNumberExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNumberExt(String value) {
        this.objectNumberExt = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the objectTypeDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTypeDiff() {
        return objectTypeDiff;
    }

    /**
     * Sets the value of the objectTypeDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTypeDiff(String value) {
        this.objectTypeDiff = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

}
