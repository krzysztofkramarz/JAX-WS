package com.fonowizja.api;

import com.fonowizja.api.model.Car;
import com.fonowizja.api.model.Person;
import com.fonowizja.api.model.address.Adres;
import com.fonowizja.api.model.sport.Sport;
import com.fonowizja.api.model.sport.SportMap;

import javax.jws.WebService;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author krzysztof.kramarz
 */
@WebService(endpointInterface = "com.fonowizja.api.NextWorkingDayProviderService")
public class NextWorkingDayProviderServiceImpl implements NextWorkingDayProviderService {
    @Override
    public String getNextWorkingDay(String previousDate) {
        return getNextWorkingDay(LocalDate.parse(previousDate)).toString();
    }

    @Override
    public Person getPerson(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException();
        }
        HashMap<String, Adres> adresHashMap = new HashMap<>();
        Adres domowy = new Adres();
        domowy.setUlica("Strażacka");
        Adres praca = new Adres();
        praca.setUlica("Grodzka");
        adresHashMap.put("domowy", domowy);
        adresHashMap.put("praca", praca);

        HashMap<String, Car> cars = new HashMap<>();
        cars.put("domowy", new Car("Fiat"));
        cars.put("praca", new Car("Lamborghini"));


        Person person = new Person();
        person.setId(888L);
        person.setPersonName("Pafnucy");
        person.setPersonSurName("Pokorniak");
        person.setBirth(LocalDate.of(1998, 5, 20));
        person.setCars(cars);
        person.setAddresses(adresHashMap);

        Sport sport = new Sport();
        sport.setGender("meskie");
        sport.setType("narty_biegowe");
        //dajemy element zamiast value
//        sport.setDesription("Ten sport jest bardzo spokojny, a jednecześnie pomaga osiągnac silna kondycję");
        sport.setPunkty(23);

        Sport sport2 = new Sport();
        sport2.setGender("damskie");
        sport2.setType("łyzwy");
        //dajemy element zamist value
//        sport2.setDesription("Jeżdzenie na łyzwach poprawia kondycje i hartuje ducha");
        sport2.setPunkty(34);

        List<Sport> sports = new ArrayList<>();
        sports.add(sport);
        sports.add(sport2);
        SportMap sportMap = new SportMap();
        sportMap.setSports(sports);
        person.setSportMap(sportMap);


//   <birth xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
//        person.setBirth(null);

        //data works without  @XmlJavaTypeAdapter
//        person.setBirth(new Date(119,10,20));
        return person;
    }


    /**
     * Returns next working day for a given date, unless it is Friday or Saturday, then it returns next Monday.
     * When date falls on Friday or Saturday, date of next Monday will be returned
     *
     * @param date of day for which next working day will be calculated.
     * @return {@link LocalDate} of next working day
     */
    static LocalDate getNextWorkingDay(LocalDate date) {

        DayOfWeek dayOfWeek = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
        switch (dayOfWeek) {
            case FRIDAY:
                return date.plus(3, ChronoUnit.DAYS);
            case SATURDAY:
                return date.plus(2, ChronoUnit.DAYS);
            default:
                return date.plus(1, ChronoUnit.DAYS);
        }
    }
}
