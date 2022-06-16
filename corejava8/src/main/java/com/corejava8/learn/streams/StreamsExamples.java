package com.corejava8.learn.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExamples {

    public static void main(String[] args){
        System.out.println("------- Print alphabet to uppercase using parallel streams ------");
        System.out.println(getAlphaToList());
        List<String> uppercase = getAlphaToList()
                .parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercase);

        System.out.println("Prime or not:  "+isPrime(1001));

        System.out.println("------- Check the number is prime ------");
        var t1 = System.currentTimeMillis();
        var total = IntStream.iterate(1,n->n+1)
                .limit(100)
                .peek(i->System.out.println(i))
                .filter(StreamsExamples::isPrime)
                .count();
        var t2 = System.currentTimeMillis();
        System.out.println("total: "+total);
        System.out.println("total Execution time:"+(t2-t1));
    }

    public static List<String> getAlphaToList(){
        int i = 97;
        List<String> alphabets = new ArrayList<>();

        while(i<=122){
            char c = (char) i;
            alphabets.add(String.valueOf(c));
            i++;
        }
        return alphabets;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return !IntStream.rangeClosed(2, number / 2).anyMatch(x -> number % x == 0);
    }

    //TODO: Create custom thread using fork join
}


