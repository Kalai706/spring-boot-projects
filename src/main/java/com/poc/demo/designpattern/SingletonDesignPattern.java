package com.poc.demo.designpattern;


/**
 * Singleton design pattern create the object only once
 * constuctor should be private, and one static method check and return the instance ( create if the instance is null )
 *
 *
 *
 * Interview Question
 *
 * How can we create the singleton design pattern
 * use case scenario of singleton design pattern
 * How can we handle multiple thread create call the singleton class at a time
 * is it possible to break the singleton class
 */
public class SingletonDesignPattern {

    private static SingletonDesignPattern obj = null;

    private SingletonDesignPattern(){
        System.out.println("creating singleton instance.....");
    }

    public static SingletonDesignPattern getInstance(){
            if(obj == null){
                obj = new SingletonDesignPattern();
            }
            return obj;
    }
}
