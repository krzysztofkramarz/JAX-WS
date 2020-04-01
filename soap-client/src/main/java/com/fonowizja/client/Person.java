
package com.fonowizja.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for person complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="samochody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.example.org/package}car" minOccurs="0"/>
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
 *         &lt;element name="nazwisko_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imie_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresy" type="{http://api.fonowizja.com/}addressMap"/>
 *         &lt;element name="sportMap" type="{http://api.fonowizja.com/}sportMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", namespace = "http://www.example.org/package", propOrder = {
        "samochody",
        "nazwisko1",
        "imie2",
        "birth",
        "adresy",
        "sportMap"
})
public class Person {

    @XmlElement(required = true, nillable = true)
    protected Person.Samochody samochody;
    @XmlElement(name = "nazwisko_1")
    protected String nazwisko1;
    @XmlElement(name = "imie_2")
    protected String imie2;
    @XmlElement(required = true, nillable = true)
    protected String birth;
    @XmlElement(required = true, nillable = true)
    protected AddressMap adresy;
    protected SportMap sportMap;

    /**
     * Gets the value of the samochody property.
     *
     * @return possible object is
     * {@link Person.Samochody }
     */
    public Person.Samochody getSamochody() {
        return samochody;
    }

    /**
     * Sets the value of the samochody property.
     *
     * @param value allowed object is
     *              {@link Person.Samochody }
     */
    public void setSamochody(Person.Samochody value) {
        this.samochody = value;
    }

    /**
     * Gets the value of the nazwisko1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNazwisko1() {
        return nazwisko1;
    }

    /**
     * Sets the value of the nazwisko1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNazwisko1(String value) {
        this.nazwisko1 = value;
    }

    /**
     * Gets the value of the imie2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getImie2() {
        return imie2;
    }

    /**
     * Sets the value of the imie2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImie2(String value) {
        this.imie2 = value;
    }

    /**
     * Gets the value of the birth property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBirth() {
        return birth;
    }

    /**
     * Sets the value of the birth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBirth(String value) {
        this.birth = value;
    }

    /**
     * Gets the value of the adresy property.
     *
     * @return possible object is
     * {@link AddressMap }
     */
    public AddressMap getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     *
     * @param value allowed object is
     *              {@link AddressMap }
     */
    public void setAdresy(AddressMap value) {
        this.adresy = value;
    }

    /**
     * Gets the value of the sportMap property.
     *
     * @return possible object is
     * {@link SportMap }
     */
    public SportMap getSportMap() {
        return sportMap;
    }

    /**
     * Sets the value of the sportMap property.
     *
     * @param value allowed object is
     *              {@link SportMap }
     */
    public void setSportMap(SportMap value) {
        this.sportMap = value;
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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.example.org/package}car" minOccurs="0"/>
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
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "entry"
    })
    public static class Samochody {

        @XmlElement(namespace = "http://www.example.org/package")
        protected List<Person.Samochody.Entry> entry;

        /**
         * Gets the value of the entry property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Person.Samochody.Entry }
         */
        public List<Person.Samochody.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Person.Samochody.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.example.org/package}car" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "key",
                "value"
        })
        public static class Entry {

            @XmlElement(namespace = "http://www.example.org/package")
            protected String key;
            @XmlElement(namespace = "http://www.example.org/package")
            protected Car value;

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

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link Car }
             */
            public Car getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link Car }
             */
            public void setValue(Car value) {
                this.value = value;
            }

        }

    }

}
