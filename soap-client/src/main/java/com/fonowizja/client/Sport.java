
package com.fonowizja.client;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for sport complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="punkty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sport", propOrder = {
        "punkty"
})
public class Sport {

    @XmlElement(namespace = "")
    protected Integer punkty;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the punkty property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getPunkty() {
        return punkty;
    }

    /**
     * Sets the value of the punkty property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPunkty(Integer value) {
        this.punkty = value;
    }

    /**
     * Gets the value of the gender property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
