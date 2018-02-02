package com.kodcu.streams.basic;



import com.kodcu.streams.Yemek;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static com.kodcu.streams.Yemek.menu;


public class Reducing {

    public static void main(String...args){

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);

        int min = numbers.stream().reduce(1 ,(a,b) -> Integer.min(a,b));
        System.out.println(min);



    }
}
