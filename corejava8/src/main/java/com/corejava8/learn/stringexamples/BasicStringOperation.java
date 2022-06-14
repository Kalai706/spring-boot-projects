package com.corejava8.learn.stringexamples;

import java.util.Arrays;

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
        System.out.println("Reverse String: "+ revString);

          //TODO: String Reverse logic with streams

    }
}
