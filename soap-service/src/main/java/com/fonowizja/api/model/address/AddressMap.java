package com.fonowizja.api.model.address;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author krzysztof.kramarz
 */
//uwaga ogólna - można pominąc wszystkie adnotacje związane z JAXB w tej i poniższych klasach AddressMapEntry i Adres
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressMap {

    @XmlElement(name = "adres_pojedynczy")
    private List<AddressMapEntry> addressMapEntries;
}
