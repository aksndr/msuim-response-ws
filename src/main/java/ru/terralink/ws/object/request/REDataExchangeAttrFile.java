
package ru.terralink.ws.object.request;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REDataExchangeAttrFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDataExchangeAttrFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="File_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Current_Part" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="All_Parts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Current_Hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="All_Hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOMER" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="FILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERSTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDataExchangeAttrFile", namespace = "http://inform.gazprom.ru/C/SUIM/REDataExchange", propOrder = {
    "fileID",
    "currentPart",
    "allParts",
    "currentHash",
    "allHash",
    "nomer",
    "filename",
    "users",
    "userstxt",
    "datum",
    "delete"
})
@Component("REDataExchangeAttrFile")
public class REDataExchangeAttrFile {

    @XmlElement(name = "File_ID", required = true)
    protected String fileID;
    @XmlElement(name = "Current_Part", required = true)
    protected BigInteger currentPart;
    @XmlElement(name = "All_Parts", required = true)
    protected BigInteger allParts;
    @XmlElement(name = "Current_Hash", required = true)
    protected String currentHash;
    @XmlElement(name = "All_Hash", required = true)
    protected String allHash;
    @XmlElement(name = "NOMER", required = true)
    protected BigInteger nomer;
    @XmlElement(name = "FILE_NAME", required = true)
    protected String filename;
    @XmlElement(name = "USERS")
    protected String users;
    @XmlElement(name = "USERSTXT")
    protected String userstxt;
    @XmlElement(name = "DATUM", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "Delete")
    protected Boolean delete;

    /**
     * Gets the value of the fileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Sets the value of the fileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

    /**
     * Gets the value of the currentPart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentPart() {
        return currentPart;
    }

    /**
     * Sets the value of the currentPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentPart(BigInteger value) {
        this.currentPart = value;
    }

    /**
     * Gets the value of the allParts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllParts() {
        return allParts;
    }

    /**
     * Sets the value of the allParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllParts(BigInteger value) {
        this.allParts = value;
    }

    /**
     * Gets the value of the currentHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentHash() {
        return currentHash;
    }

    /**
     * Sets the value of the currentHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentHash(String value) {
        this.currentHash = value;
    }

    /**
     * Gets the value of the allHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllHash() {
        return allHash;
    }

    /**
     * Sets the value of the allHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllHash(String value) {
        this.allHash = value;
    }

    /**
     * Gets the value of the nomer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNOMER() {
        return nomer;
    }

    /**
     * Sets the value of the nomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNOMER(BigInteger value) {
        this.nomer = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERS() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERS(String value) {
        this.users = value;
    }

    /**
     * Gets the value of the userstxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERSTXT() {
        return userstxt;
    }

    /**
     * Sets the value of the userstxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERSTXT(String value) {
        this.userstxt = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATUM() {
        if (datum == null){
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            DatatypeFactory datatypeFactory = null;
            try {
                datatypeFactory = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
                return null;
            }
            return datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        }
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATUM(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return (delete == null) ? false : delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
