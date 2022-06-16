package com.corejava8.learn.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicCollectionsExamples {


    public static void main(String[] args){
//        listVsSet();
//        arrayListDemo();
//        linkedListDemo();
//        hashmapDemo();
//
//        System.out.println("------------");
//
//        combineTwoCollection();
//        System.out.println("------------");
        setDemo();
    }

    private static void listVsSet(){

        List<Integer> orderList = new ArrayList<>();
        orderList.add(1);
        orderList.add(6);
        orderList.add(3);
        orderList.add(5);
        orderList.add(4);

        System.out.println("Order List :"+ orderList);

        Set<Integer> unorderSet = new HashSet<>();
        unorderSet.add(1);
        unorderSet.add(6);
        unorderSet.add(3);
        unorderSet.add(5);
        unorderSet.add(4);
        System.out.println("unorderList List :"+ unorderSet);

    }

    private static void arrayListDemo(){
        List<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        // Perfomance low when adding the element in between the arraylist
        obj.add(2,5);

        System.out.println(obj);

    }

    private static void linkedListDemo(){
        List<Integer> obj = new LinkedList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(2,5);

        System.out.println(obj.get(4)); //Get operation is time consuming
    }

    private static void hashmapDemo(){
        Map<Integer,String> obj = new HashMap<>();
        obj.put(1,"kalai");
        obj.put(2,"vani");
        obj.put(3,"Joe");
        obj.put(4,"Dhiya");
        obj.put(5,obj.getOrDefault(9,"jjjjjjjj"));
        System.out.println("------------");
        System.out.println(new ArrayList<>(obj.keySet()));
        System.out.println("------------");

        obj.entrySet().stream().filter(x->x.getValue()=="Joe").forEach(System.out::println);

        obj.entrySet().stream().forEach(System.out::println);
        List<String> objAr = obj.values().stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(objAr);

        System.out.println("------------");



        class Employee {
            int empId;
            int age;
            String name;
            String company;

            public Employee(int empId, int age, String name, String company) {
                this.empId = empId;
                this.age = age;
                this.name = name;
                this.company = company;
            }

            public int getEmpId() {
                return empId;
            }

            public int getAge() {
                return age;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "empId=" + empId +
                        ", age=" + age +
                        ", name='" + name + '\'' +
                        ", company='" + company + '\'' +
                        '}';
            }

            public String getCompany() {
                return company;
            }
        }

        Map<Integer, Employee> hashMap = new HashMap<>();
        hashMap.put(11, new Employee(11, 35, "Bill", "Infosys"));
        hashMap.put(22, new Employee(22, 29, "Stew", "TCS"));
        hashMap.put(33, new Employee(33, 24, "Elon", "Wipro"));
        hashMap.put(44, new Employee(44, 22, "Jenifer", "Infosys"));

       List<Employee> filteredEmployee = hashMap.values().stream()
               .filter(x->x.getCompany()=="Infosys")
               .collect(Collectors.toList());

        Map<String,List<Employee>> groupEmployees = hashMap.values().stream()
                .collect(Collectors.groupingBy(Employee::getCompany));
        System.out.println(groupEmployees);
        groupEmployees.entrySet().stream().forEach(x->x.getValue());
    }

    private static void setDemo(){
        List<String> name = new ArrayList<>(Arrays.asList("kalai","vani","Joe"));

        Set<String> unOrderedSet = new HashSet<>(name);
        Set<String> orderedSet = new LinkedHashSet<>(name);
        Set<String> orderedTreeSet = new TreeSet<>(name);

        System.out.println(unOrderedSet);
        System.out.println("----------");
        System.out.println(orderedSet);
        System.out.println("----------");
        System.out.println(orderedTreeSet);



    }

    private static void combineTwoCollection(){

        class Student {
            int student_id;
            String name;

            public Student(int student_id, String name) {
                this.student_id = student_id;
                this.name = name;
            }

            public int getStudent_id() {
                return student_id;
            }

            public String getName() {
                return name;
            }
        }

        class Marksheet {
            int student_id;
            int total_mark;

            public Marksheet(int student_id, int total_mark) {
                this.student_id = student_id;
                this.total_mark = total_mark;
            }

            public int getStudent_id() {
                return student_id;
            }

            public int getTotal_mark() {
                return total_mark;
            }

            @Override
            public String toString() {
                return "Marksheet{" +
                        "student_id=" + student_id +
                        ", total_mark=" + total_mark +
                        '}';
            }
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"kalai"));
        students.add(new Student(2,"vani"));
        students.add(new Student(3,"joe"));

        List<Marksheet> marksheets = new ArrayList<>();
        marksheets.add(new Marksheet(1,400));
        marksheets.add(new Marksheet(2,500));
        marksheets.add(new Marksheet(4,500));


        Set<Student> studentsset = new HashSet<>(students);

    //TODO: need to find the solution
        marksheets.stream()
                .peek(x->System.out.println(x.toString()))
                .filter(x->studentsset.contains(x.student_id) )
                .peek(x->System.out.println(x.toString()))
                .count();

//        marksheets.stream()
//                .peek(x->System.out.println(x.toString()))
//                .filter(x->students.contains(x.getStudent_id()))
//                .forEach(x->System.out.println(x.toString()));

    }
}
