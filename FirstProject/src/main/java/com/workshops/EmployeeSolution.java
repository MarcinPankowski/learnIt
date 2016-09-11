package com.workshops;

import java.util.*;

/**
 * Created by marcinpankowski on 27.08.16.
 */
public class EmployeeSolution {
    public static void main(String[] args) {
        System.out.println("------- sort po pensji ");
        Set<Employee> employees = new TreeSet<>();

        employees.add(new Employee("Monika",200));
        employees.add(new Employee("Jozek",2));
        employees.add(new Employee("Wolfgang",1200));
        employees.add(new Employee("Iza",2200));
        employees.add(new Employee("Henryk",3200));



        for (Employee e : employees){
            System.out.println(e.getImie() + " : " + e.getPensja());
        }

        Set<Employee> employees2 = new TreeSet<>( new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getImie().compareTo(o2.getImie());
            }
        });

        System.out.println("------- sort po imieniu ");

        employees2.add(new Employee("Monika",200));
        employees2.add(new Employee("Jozek",2));
        employees2.add(new Employee("Wolfgang",1200));
        employees2.add(new Employee("Iza",2200));
        employees2.add(new Employee("Henryk",3200));



        for (Employee e : employees2){
            System.out.println(e.getImie() + " : " + e.getPensja());
        }


       // System.out.println("------- sort  ");
      //  List<Employee> employeeList = new ArrayList<>();
      //  Collection.sort()

    }
}
