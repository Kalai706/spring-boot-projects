package com.corejava8.learn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BasicArrayExamples {

    public static void main(String args[]){
        System.out.println("hello world");
       // sumOfEvenNumber();

        deleteElementFromArray();
    }

    private static void sumOfEvenNumber(){
        int[] num = {1,3,5,6,2,7};
        int sum = 0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2 == 0){
                sum += num[i];
            }
        }
        System.out.println("Sum of even numbers using logic :"+ sum);

        int sumusingStrams = Arrays.stream(num).filter(x->x%2==0).sum();

        System.out.println("Sum of even numbers using strams :"+ sumusingStrams);

    }

    private static void deleteElementFromArray(){
        int[] arr = {1,2,3,4};

        List<Integer> obj =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(obj);
    }
}
