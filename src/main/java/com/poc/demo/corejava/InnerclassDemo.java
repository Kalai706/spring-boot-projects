package com.poc.demo.corejava;


/***
 * Inner Class is the class with in the other class
 * Outerclass can access all the variable of the inner class
 * There are 4 type of inner class
 * 1. Non-static (or) Member Inner class
 * 2. static (or) Nested Inner Class
 * 3. Anonymous Inner class ---> Lambda
 * 4. Local Inner Class
 *
 *
 * Interview Question
 * Can we make class static ?
 * What are the access specifier allowed for Outer class ?
 * Can we assign non-static member of the outerclass to the static inner class ?
 *
 *
 */
public class InnerclassDemo {

    private String greetings ="Hello World!!";
    String s2 = new InnerClassDemoA().str1;

    public static void show(){
        System.out.println("outerclass method");
    }

    /**
     * Nested Inner class can have both static non-static method
     * Nested Inner class cannot access the non-static outclass members variable eg:  public String str1 = InnerclassDemo.greetings;
     */
    public static class InnerClassDemoA {
        String str1 = "Static Innerclass variable";
        //TODO: how to call outerclass variable in nested inner class
        InnerclassDemo obj = new InnerclassDemo();


        public void a () {
            System.out.println();
        }
    }

    /**
     * Method Inner class can have only non-static method
     */
    public class InnerClassDemoB {
          String str2 = "non-static fields are allowed in member Innerclass";
        InnerclassDemo obj = new InnerclassDemo();

        //TODO: how to call outerclass variable in method inner class
        public String b () {
            return "non-static methos are only allowed in member Innerclass";
        }
    }
}
