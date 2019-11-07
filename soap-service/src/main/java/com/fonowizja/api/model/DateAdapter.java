package com.fonowizja.api.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author krzysztof.kramarz
 */
class DateAdapter extends XmlAdapter<String, LocalDate> {

    private static final String DATE_FORMAT = "yyyy-mm-dd";

    @Override
    public LocalDate unmarshal(String v) {

//        String[] split = v.split("-");
//        return  LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        return LocalDate.parse(v, DateTimeFormatter.ISO_DATE);
    }

    @Override
    public String marshal(LocalDate v) {
        return v.toString();
    }
}
