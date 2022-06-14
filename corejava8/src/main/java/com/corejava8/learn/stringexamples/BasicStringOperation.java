package com.corejava8.learn.stringexamples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStringOperation {

    public static void main(String[] args){
        System.out.println("--------- Reverse String --------");
        BasicStringOperation.stringReverse("Hello");

    }

    private static void stringReverse(String s){
        System.out.println("Given String: "+ s);
        char[] tempArray =  s.toCharArray();
        String revString ="";
          for(int i=tempArray.length;i>0;i--){
              revString+= tempArray[i-1];
          }
        System.out.println("Reverse String using logic : "+ revString);
       var streamReverseValue = Stream.of(s)
               .map(letter-> new StringBuilder(letter).reverse())
               .collect(Collectors.joining());
        System.out.println("Reverse String using streams : "+ streamReverseValue);

    }
}
