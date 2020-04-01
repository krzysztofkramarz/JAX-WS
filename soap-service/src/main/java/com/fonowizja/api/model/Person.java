package com.fonowizja.api.model;

import com.fonowizja.api.model.address.AddressMapAdapter;
import com.fonowizja.api.model.address.Adres;
import com.fonowizja.api.model.sport.SportMap;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.HashMap;

/**
 * @author krzysztof.kramarz
 */
@Getter
@Setter
@XmlRootElement(name = "Osoba")
@XmlType(propOrder = {"cars", "personSurName", "personName", "birth", "addresses", "sportMap"})
//musi być filed, bo inaczej zczytuje z geterów
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

    @XmlTransient
    private Long id;

    @XmlElement(name = "imie_2")
    private String personName;

    @XmlElement(name = "nazwisko_1")
    private String personSurName;

    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement(nillable = true, required = true)
//    private Date birth;
    private LocalDate birth;


//    1. Identify the unmappable class
//    2. Create an equivalent class that is mappable
//    3. Create an XmlAdapter to convert between unmappable and mappable objects
//    4. Specify the XmlAdapter

    //a tutaj z kolei  @XmlElementWrapper(name = "adresy") nie działa
//Now during marshal/unmarshal operations the instance of Map is treated as an instance of AddressMapEntryType.
    @XmlJavaTypeAdapter(value = AddressMapAdapter.class)
    @XmlElement(name = "adresy", required = true, nillable = true)
    private HashMap<String, Adres> addresses;

    //mapa samochodów, jako wraper musi być, działa
    // a tutaj z kolei  @XmlElement(name = "adresy") nie działa
    @XmlElementWrapper(name = "samochody", required = true, nillable = true, namespace = "innyNameSpace")
    private HashMap<String, Car> cars;

    //lista sportów opakowana w klase, której pole jest listą, działa
    @XmlElement
    private SportMap sportMap;

    // Invoked by Marshaller after it has created an instance of this object.
    boolean beforeMarshal(Marshaller marshaller) {
        System.out.println("Before Marshaller Callback");
        return true;
    }

    // Invoked by Marshaller after it has marshalled all properties of this object.
    void afterMarshal(Marshaller marshaller) {
        System.out.println("After Marshaller Callback");
    }

    @Override
    public String toString() {
        return "moj tostrin  Person{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", personSurName='" + personSurName + '\'' +
                ", birth=" + birth +
                ", addresses=" + addresses +
                ", cars=" + cars +
                ", sportMap=" + sportMap +
                '}';
    }
}
