
package ru.terralink.ws.object.response;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REAttrDataExchangeResponse",
         namespace = "http://inform.gazprom.ru/C/SUIM/REDataExchange",
         propOrder = {
                        "logicalSystem",
                        "internalObjectNumber",
                        "externalObjectNumber",
                        "trayCode",
                        "success",
                        "destination",
                        "parentMsgID",
                        "files",
                        "errorText"
         })

@Component("REAttrDataExchangeResponse")
public class REAttrDataExchangeResponse {
    @XmlElement(name = "LogicalSystem", required = true)
    protected String logicalSystem;
    @XmlElement(name = "InternalObjectNumber")
    protected String internalObjectNumber;
    @XmlElement(name = "ExternalObjectNumber", required = true)
    protected String externalObjectNumber;
    @XmlElement(name = "Tray_Code")
    protected String trayCode;
    @XmlElement(name = "Success")
    protected String success;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "ParentMsgID", required = true)
    protected String parentMsgID;
    @XmlElement(name = "Files")
    protected REAttrDataExchangeResponse.Files files;
    @XmlElement(name = "ErrorText")
    protected REAttrDataExchangeResponse.ErrorText errorText;

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
     * Gets the value of the internalObjectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalObjectNumber() {
        return internalObjectNumber;
    }

    /**
     * Sets the value of the internalObjectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalObjectNumber(String value) {
        this.internalObjectNumber = value;
    }

    /**
     * Gets the value of the externalObjectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalObjectNumber() {
        return externalObjectNumber;
    }

    /**
     * Sets the value of the externalObjectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalObjectNumber(String value) {
        this.externalObjectNumber = value;
    }

    /**
     * Gets the value of the trayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrayCode() {
        return trayCode;
    }

    /**
     * Sets the value of the trayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrayCode(String value) {
        this.trayCode = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccess(String value) {
        this.success = value;
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

    /**
     * Gets the value of the parentMsgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMsgID() {
        return parentMsgID;
    }

    /**
     * Sets the value of the parentMsgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMsgID(String value) {
        this.parentMsgID = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link REAttrDataExchangeResponse.Files }
     *     
     */
    public REAttrDataExchangeResponse.Files getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link REAttrDataExchangeResponse.Files }
     *     
     */
    public void setFiles(REAttrDataExchangeResponse.Files value) {
        this.files = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link REAttrDataExchangeResponse.ErrorText }
     *     
     */
    public REAttrDataExchangeResponse.ErrorText getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link REAttrDataExchangeResponse.ErrorText }
     *     
     */
    public void setErrorText(REAttrDataExchangeResponse.ErrorText value) {
        this.errorText = value;
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
     *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "line"
    })
    public static class ErrorText {

        @XmlElement(name = "Line", required = true)
        protected List<String> line;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLine() {
            if (line == null) {
                line = new ArrayList<String>();
            }
            return this.line;
        }

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
     *         &lt;element name="File" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="File_Name">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="283"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="File_Size">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Internal_File_ID" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="250"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="External_File_ID">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="250"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Current_Part">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;totalDigits value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="All_Parts">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;totalDigits value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Location_SUIM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Location_ELAR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ErrorText" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "file"
    })
    public static class Files {

        @XmlElement(name = "File", required = true)
        protected List<REAttrDataExchangeResponse.Files.File> file;

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REAttrDataExchangeResponse.Files.File }
         * 
         * 
         */
        public List<REAttrDataExchangeResponse.Files.File> getFile() {
            if (file == null) {
                file = new ArrayList<REAttrDataExchangeResponse.Files.File>();
            }
            return this.file;
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
         *         &lt;element name="File_Name">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="283"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="File_Size">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Internal_File_ID" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="250"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="External_File_ID">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="250"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Current_Part">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;totalDigits value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="All_Parts">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;totalDigits value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Location_SUIM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Location_ELAR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ErrorText" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "fileName",
            "fileSize",
            "internalFileID",
            "externalFileID",
            "currentPart",
            "allParts",
            "locationSUIM",
            "locationELAR",
            "errorText"
        })
        public static class File {

            @XmlElement(name = "File_Name", required = true)
            protected String fileName;
            @XmlElement(name = "File_Size", required = true)
            protected String fileSize;
            @XmlElement(name = "Internal_File_ID")
            protected String internalFileID;
            @XmlElement(name = "External_File_ID", required = true)
            protected String externalFileID;
            @XmlElement(name = "Current_Part", required = true)
            protected BigInteger currentPart;
            @XmlElement(name = "All_Parts", required = true)
            protected BigInteger allParts;
            @XmlElement(name = "Location_SUIM")
            protected String locationSUIM;
            @XmlElement(name = "Location_ELAR")
            protected String locationELAR;
            @XmlElement(name = "ErrorText")
            protected REAttrDataExchangeResponse.Files.File.ErrorText errorText;

            /**
             * Gets the value of the fileName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileName() {
                return fileName;
            }

            /**
             * Sets the value of the fileName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileName(String value) {
                this.fileName = value;
            }

            /**
             * Gets the value of the fileSize property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileSize() {
                return fileSize;
            }

            /**
             * Sets the value of the fileSize property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileSize(String value) {
                this.fileSize = value;
            }

            /**
             * Gets the value of the internalFileID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInternalFileID() {
                return internalFileID;
            }

            /**
             * Sets the value of the internalFileID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInternalFileID(String value) {
                this.internalFileID = value;
            }

            /**
             * Gets the value of the externalFileID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExternalFileID() {
                return externalFileID;
            }

            /**
             * Sets the value of the externalFileID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExternalFileID(String value) {
                this.externalFileID = value;
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
             * Gets the value of the locationSUIM property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationSUIM() {
                return locationSUIM;
            }

            /**
             * Sets the value of the locationSUIM property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationSUIM(String value) {
                this.locationSUIM = value;
            }

            /**
             * Gets the value of the locationELAR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationELAR() {
                return locationELAR;
            }

            /**
             * Sets the value of the locationELAR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationELAR(String value) {
                this.locationELAR = value;
            }

            /**
             * Gets the value of the errorText property.
             * 
             * @return
             *     possible object is
             *     {@link REAttrDataExchangeResponse.Files.File.ErrorText }
             *     
             */
            public REAttrDataExchangeResponse.Files.File.ErrorText getErrorText() {
                return errorText;
            }

            /**
             * Sets the value of the errorText property.
             * 
             * @param value
             *     allowed object is
             *     {@link REAttrDataExchangeResponse.Files.File.ErrorText }
             *     
             */
            public void setErrorText(REAttrDataExchangeResponse.Files.File.ErrorText value) {
                this.errorText = value;
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
             *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
                "line"
            })
            public static class ErrorText {

                @XmlElement(name = "Line", required = true)
                protected List<String> line;

                /**
                 * Gets the value of the line property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the line property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLine().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getLine() {
                    if (line == null) {
                        line = new ArrayList<String>();
                    }
                    return this.line;
                }

            }

        }

    }

}
