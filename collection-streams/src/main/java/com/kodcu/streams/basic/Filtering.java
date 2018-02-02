package com.kodcu.streams.basic;



import com.kodcu.streams.Yemek;

import java.util.Arrays;
import java.util.List;

import static com.kodcu.streams.Yemek.menu;
import static java.util.stream.Collectors.toList;


public class Filtering {

    public static void main(String...args){

        // Filtering with predicate
        List<Yemek> vegetarianMenu =
            menu.stream()
                .filter(Yemek::isVegetarian)
                .collect(toList());

        vegetarianMenu.forEach(System.out::println);

        System.out.println("----------------");

        // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
               .filter(i -> i % 2 == 0)
               .distinct()
               .forEach(System.out::println);

        System.out.println("----------------");

        // Truncating a stream
        List<Yemek> dishesLimit3 =
            menu.stream()
                .filter(d -> d.getKalorisi() > 300)
                .limit(3)
                .collect(toList());

        dishesLimit3.forEach(System.out::println);

        System.out.println("----------------");

        // Skipping elements
        List<Yemek> dishesSkip2 =
            menu.stream()
                .filter(d -> d.getKalorisi() > 300)
                .skip(2)
                .collect(toList());

        dishesSkip2.forEach(System.out::println);


    }
}
