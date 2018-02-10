package com.kodcu;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;


/**
 * eski Date > LocalDateTime nasil ceviririz.
 */
public class DateTimeOrIki {


    public static LocalDateTime convertToLocalDateViaInstant(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static void main(String... args) {

        LocalDateTime localDateTime = convertToLocalDateViaInstant(new Date()) ;
        System.out.println(" Yil : " + localDateTime.getYear());
        System.out.println(" Ay : " + localDateTime.getMonth());
        System.out.println(" Gun : " + localDateTime.getDayOfMonth());
        System.out.println(" Saat : " + localDateTime.getHour());
        System.out.println(" Dakika : " + localDateTime.getMinute());
        System.out.println(" Saniye : " + localDateTime.getSecond());

    }
}
