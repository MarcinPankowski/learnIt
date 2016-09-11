package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marcinpankowski on 10.09.16.
 */
public class Person {

//    class Entry{ //klasa w klasie

  //  }

    private String name;
    private String surname;
    private String pesel;

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            Person p = (Person) obj; //rzutowanie
            if(p.name.equals((this.name)) && p.surname.equals((this.surname)) && p.pesel.equals((this.pesel))) { // p.name bo wew klasy ,. bez getera
            return true;
            }

        }
        return false;
    }

    public void validatePesel(int pesel) {
        if (pesel <= 5) {
            throw new IllegalArgumentException("bledna suma kontrolna");
        } else if (pesel > 5 && pesel <= 10){
            throw new IllegalArgumentException("bledny pesel");
        } else if (pesel > 10){
        System.out.println("OK PESEL");
        }else{
        throw new IllegalArgumentException("blad");
        }

    }

    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<>();

        Person osoba1 = new Person("Marcin", "Pankowski", "12345678901");
        Person osoba2 = new Person("Marcin2", "Pankowski2", "12345678902");
        Person osoba3 = new Person("Marcin3", "Pankowski3", "12345678903");
        Person osoba4 = new Person("Marcin4", "Pankowski4", "12345678904");

        persons.put(osoba1.getPesel(),osoba1);
        persons.put(osoba2.getPesel(),osoba2);
        persons.put(osoba3.getPesel(),osoba3);
        persons.put(osoba4.getPesel(),osoba4);

        System.out.println(persons.keySet());
       // System.out.println(persons);

        for (String e : persons.keySet()){
            System.out.println(">> " + e);

            //Person person = persons.get(e);
            }

        //for(Map,Entry<String, Person> entry: persons.entrySet()){ //Entry wew. , ktora trzyma  Mapa [ ENTRY(KEY,VALUES) , ... to lista ale z entry
//            entry.getValue();
//        }


        ////domyslany rozmiar na poczatek 20 elem, tablica 20elementowa, jak dodam wiecej , poszerzy
        //List<String> list = new ArrayList<String>(20);
        //list.add("a");...

        //blokujace kolejki
        //if (list.size() <= 2) {
//            list.add..
//        }
    }
}
