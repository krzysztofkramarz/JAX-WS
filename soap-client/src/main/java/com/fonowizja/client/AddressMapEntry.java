
package com.fonowizja.client;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for addressMapEntry complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="addressMapEntry">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://api.fonowizja.com/>adres">
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressMapEntry", propOrder = {
        "value"
})
public class AddressMapEntry {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "key")
    protected String key;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the key property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKey(String value) {
        this.key = value;
    }

}
