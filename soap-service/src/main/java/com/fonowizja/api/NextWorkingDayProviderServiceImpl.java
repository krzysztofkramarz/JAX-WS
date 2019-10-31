package com.fonowizja.api;

import javax.jws.WebService;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author krzysztof.kramarz
 */
@WebService(endpointInterface = "com.fonowizja.api.NextWorkingDayProviderService")
public class NextWorkingDayProviderServiceImpl implements NextWorkingDayProviderService {
    @Override
    public String getNextWorkingDay(String previousDate) {
        return getNextWorkingDay(LocalDate.parse(previousDate)).toString();
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
