package com.collections;

import java.util.*;

/**
 * Created by marcinpankowski on 10.09.16.
 */
class Collectionss {
        // ew Set<String> unNames = new HashSet<String>();
    public List<String> distinct(List<String> names){ //jak static to jest to metoda klasy , jedna na wszystkie, lepiej bez static
        Set<String> unNames = new HashSet<String>(names); //Set / List - deklarujemy za pomocą interfejsu /HashSet jest najszybszy
        //ew: unNames.addAll(names);
        List<String> list = new ArrayList<String>(unNames);
        return list;
    }

    public static void main(String[] args) {
        List<String> imiona = new ArrayList<String>();
        imiona.add("Marcin");
        imiona.add("Marcin");
        imiona.add("Kowalski");

        Collectionss col1 = new Collectionss();
        List<String> imiona2 = col1.distinct(imiona);
        System.out.println(imiona2);

       // imiona2 = distinct(imiona);

       // for  (String e : imiona2){
       //    System.out.println(">>" + e);
       // }

       //ew List<String> names2 = new ArrayList<>();
       //ew names2.add("Marek");

    }
}

