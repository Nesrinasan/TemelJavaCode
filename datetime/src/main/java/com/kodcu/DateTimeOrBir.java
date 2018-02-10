package com.kodcu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;


/**
 * eski Date > LocalDate nasil ceviririz.
 */
public class DateTimeOrBir {


    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static void main(String... args) {

        LocalDate localDateTime = convertToLocalDateViaInstant(new Date()) ;
        System.out.println(" Yil : " + localDateTime.getYear());
        System.out.println(" Ay : " + localDateTime.getMonth());
        System.out.println(" Gun : " + localDateTime.getDayOfMonth());


    }
}
