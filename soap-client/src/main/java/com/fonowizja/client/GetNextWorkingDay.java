
package com.fonowizja.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNextWorkingDay complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getNextWorkingDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPoprzednia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNextWorkingDay", propOrder = {
        "dataPoprzednia"
})
public class GetNextWorkingDay {

    @XmlElement(namespace = "")
    protected String dataPoprzednia;

    /**
     * Gets the value of the dataPoprzednia property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDataPoprzednia() {
        return dataPoprzednia;
    }

    /**
     * Sets the value of the dataPoprzednia property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDataPoprzednia(String value) {
        this.dataPoprzednia = value;
    }

}
