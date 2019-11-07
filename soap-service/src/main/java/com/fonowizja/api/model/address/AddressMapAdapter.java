package com.fonowizja.api.model.address;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.*;

/**
 * @author krzysztof.kramarz
 */
public class AddressMapAdapter extends XmlAdapter<AddressMap, HashMap<String, Adres>> {
    @Override
    public HashMap<String, Adres> unmarshal(AddressMap v) {
        HashMap<String, Adres> stringAdresMap = new HashMap<>();
        List<AddressMapEntry> addressMapEntries = v.getAddressMapEntries();
        for (AddressMapEntry entry : addressMapEntries) {
            stringAdresMap.put(entry.getKey(), entry.getValue());
        }
        return stringAdresMap;
    }

    @Override
    public AddressMap marshal(HashMap<String, Adres> v) {
        AddressMap addressMap = new AddressMap();
        List<AddressMapEntry> addressMapEntryList = new ArrayList<>();
        Set<Map.Entry<String, Adres>> entries = v.entrySet();
        for (Map.Entry<String, Adres> entry : entries) {
            AddressMapEntry addressMapEntry = new AddressMapEntry();
            addressMapEntry.setKey(entry.getKey());
            addressMapEntry.setValue(entry.getValue());
            addressMapEntryList.add(addressMapEntry);
        }
        addressMap.setAddressMapEntries(addressMapEntryList);
        return addressMap;
    }
}
