
package com.fonowizja.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for addressMap complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="addressMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adres_pojedynczy" type="{http://api.fonowizja.com/}addressMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressMap", propOrder = {
        "adresPojedynczy"
})
public class AddressMap {

    @XmlElement(name = "adres_pojedynczy", namespace = "")
    protected List<AddressMapEntry> adresPojedynczy;

    /**
     * Gets the value of the adresPojedynczy property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresPojedynczy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresPojedynczy().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressMapEntry }
     */
    public List<AddressMapEntry> getAdresPojedynczy() {
        if (adresPojedynczy == null) {
            adresPojedynczy = new ArrayList<AddressMapEntry>();
        }
        return this.adresPojedynczy;
    }

}
