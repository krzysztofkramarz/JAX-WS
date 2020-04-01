
package com.fonowizja.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.fonowizja.client package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Sport_QNAME = new QName("http://api.fonowizja.com/", "sport");
    private final static QName _MojaOperacja_QNAME = new QName("http://api.fonowizja.com/", "mojaOperacja");
    private final static QName _Adres_QNAME = new QName("http://api.fonowizja.com/", "adres");
    private final static QName _AddressMapEntry_QNAME = new QName("http://api.fonowizja.com/", "addressMapEntry");
    private final static QName _GetPersonResponse_QNAME = new QName("http://api.fonowizja.com/", "getPersonResponse");
    private final static QName _GetPerson_QNAME = new QName("http://api.fonowizja.com/", "getPerson");
    private final static QName _MojaOperacjaResponse_QNAME = new QName("http://api.fonowizja.com/", "mojaOperacjaResponse");
    private final static QName _Osoba_QNAME = new QName("http://www.example.org/package", "Osoba");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fonowizja.client
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Person.Samochody }
     */
    public Person.Samochody createPersonSamochody() {
        return new Person.Samochody();
    }

    /**
     * Create an instance of {@link MojaOperacjaResponse }
     */
    public MojaOperacjaResponse createMojaOperacjaResponse() {
        return new MojaOperacjaResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link AddressMapEntry }
     */
    public AddressMapEntry createAddressMapEntry() {
        return new AddressMapEntry();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link MojaOperacja }
     */
    public MojaOperacja createMojaOperacja() {
        return new MojaOperacja();
    }

    /**
     * Create an instance of {@link Sport }
     */
    public Sport createSport() {
        return new Sport();
    }

    /**
     * Create an instance of {@link AddressMap }
     */
    public AddressMap createAddressMap() {
        return new AddressMap();
    }

    /**
     * Create an instance of {@link SportMap }
     */
    public SportMap createSportMap() {
        return new SportMap();
    }

    /**
     * Create an instance of {@link Car }
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link Person.Samochody.Entry }
     */
    public Person.Samochody.Entry createPersonSamochodyEntry() {
        return new Person.Samochody.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sport }{@code >}}
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "sport")
    public JAXBElement<Sport> createSport(Sport value) {
        return new JAXBElement<Sport>(_Sport_QNAME, Sport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MojaOperacja }{@code >}}
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "mojaOperacja")
    public JAXBElement<MojaOperacja> createMojaOperacja(MojaOperacja value) {
        return new JAXBElement<MojaOperacja>(_MojaOperacja_QNAME, MojaOperacja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "adres")
    public JAXBElement<String> createAdres(String value) {
        return new JAXBElement<String>(_Adres_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressMapEntry }{@code >}}
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "addressMapEntry")
    public JAXBElement<AddressMapEntry> createAddressMapEntry(AddressMapEntry value) {
        return new JAXBElement<AddressMapEntry>(_AddressMapEntry_QNAME, AddressMapEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MojaOperacjaResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://api.fonowizja.com/", name = "mojaOperacjaResponse")
    public JAXBElement<MojaOperacjaResponse> createMojaOperacjaResponse(MojaOperacjaResponse value) {
        return new JAXBElement<MojaOperacjaResponse>(_MojaOperacjaResponse_QNAME, MojaOperacjaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.example.org/package", name = "Osoba")
    public JAXBElement<Person> createOsoba(Person value) {
        return new JAXBElement<Person>(_Osoba_QNAME, Person.class, null, value);
    }

}
