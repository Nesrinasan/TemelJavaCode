package com.kodcu;



import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import static com.kodcu.DateTimeOrUc.getDatesBetweenUsingJava7;
import static com.kodcu.DateTimeOrUc.getDatesBetweenUsingJava8;
import static org.junit.Assert.assertEquals;


public class DateTimeOrDortTest {




    @Test
    public void testDiffence() throws Exception{

        // given
        DateTimeOrDort dateTimeOrDort = new DateTimeOrDort();
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("dd/M/yyyy hh:mm:ss");

        Date date1 = simpleDateFormat.parse("15/12/2017 20:35:55");
        Date date2 = simpleDateFormat.parse("09/02/2018 11:30:10");


        // when

        long result = dateTimeOrDort.getDifference(date1, date2); //


        //then
        assertEquals(result,55);

    }

    @Test
    public void givenTwoDatesInJava8_whenDifferentiating_thenWeGetSix() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime sixDaysBehind = now.minusDays(6);

        Duration duration = Duration.between(now, sixDaysBehind);
        long diff = Math.abs(duration.toDays());

        assertEquals(diff, 6);
    }

    @Test
    public void givenTwoDateTimesInJava8_whenDifferentiating_thenWeGetSix() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime sixMinutesBehind = now.minusMinutes(6);

        Duration duration = Duration.between(now, sixMinutesBehind);
        long diff = Math.abs(duration.toMinutes());

        assertEquals(diff, 6);
    }



}
