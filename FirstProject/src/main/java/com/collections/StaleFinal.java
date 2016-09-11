package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by marcinpankowski on 10.09.16.
 */
public class StaleFinal {
    public static final String STALA = "100"; //static nalezy do tej klasy, stala  nie zminimy

    public final List<String> a = new ArrayList<String>();
    private final int b =0;
    //public void foo(){
    //     b =3 ; blad
    //
    //}

    public static void main(String[] args) {

        String cosTam = StaleFinal.STALA; //korzystanie ze stalej


        //////////
        // kontrakt hashCode i equals
        Person osoba1 = new Person("Marcin", "Pankowski", "12345678901");
        Person osoba2 = new Person("Marcin", "Pankowski", "12345678901");

        if (osoba1.equals(osoba2)){
            System.out.println("OK");
        }else{
            System.out.println("NO ok");
        }

        System.out.println(osoba1.hashCode());
        System.out.println(osoba2.hashCode());



    }
}
