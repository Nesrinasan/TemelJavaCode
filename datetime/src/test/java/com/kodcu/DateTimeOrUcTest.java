package com.kodcu;



import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodcu.DateTimeOrUc.getDatesBetweenUsingJava7;
import static com.kodcu.DateTimeOrUc.getDatesBetweenUsingJava8;
import static org.junit.Assert.assertEquals;


public class DateTimeOrUcTest {




    @Test
    public void testZamanZaman() throws Exception{

        // given
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String startDateInString = "11-12-2017 11:54:01";
        String stopDateInString =  "11-02-2018 10:23:08";

        Date start = formatter.parse(startDateInString);
        Date stop  = formatter.parse(stopDateInString);

        // when
        List<Date>  resultsForJava7 = getDatesBetweenUsingJava7(start, stop);
        resultsForJava7.forEach(System.out::println);


        LocalDate startLocalDate = start.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate stopLocalDate = stop.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        List<LocalDate>  resultsForJava8 = getDatesBetweenUsingJava8(startLocalDate, stopLocalDate);
        resultsForJava8.forEach(System.out::println);

        //then
        assertEquals(resultsForJava7.size(),62);
        assertEquals(resultsForJava8.size(),62);




    }


}
