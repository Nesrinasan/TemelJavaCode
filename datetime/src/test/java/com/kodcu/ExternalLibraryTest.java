package com.kodcu;

import hirondelle.date4j.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

public class ExternalLibraryTest {

    @Test
    public void givenTwoDatesInJodaTime_whenDifferentiating_thenWeGetSix() {
        LocalDate now = LocalDate.now();
        LocalDate sixDaysBehind = now.minusDays(6);

        Period period = new Period(now, sixDaysBehind);
        long diff = Math.abs(period.getDays());

        assertEquals(diff, 6);
    }

    @Test
    public void givenTwoDateTimesInJodaTime_whenDifferentiating_thenWeGetSix() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime sixMinutesBehind = now.minusMinutes(6);

        Period period = new Period(sixMinutesBehind, now );
        long diff = Math.abs(period.getMinutes());

        assertEquals(diff, 6);
    }


    @Test
    public void givenTwoDatesInDate4j_whenDifferentiating_thenWeGetSix() {
        DateTime now = DateTime.now(TimeZone.getDefault());
        DateTime sixDaysBehind = now.minusDays(6);

        long diff = Math.abs(now.numDaysFrom(sixDaysBehind));

        assertEquals(diff, 6);
    }
}
