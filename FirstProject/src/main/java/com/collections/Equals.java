package com.collections;

import java.util.ArrayList;

/**
 * Created by marcinpankowski on 10.09.16.
 */
public class Equals {
    public static void main(String[] args) {
        String a1 = "A1"; //stworzenie obiektu A1, wskazuje na to a1
        String a2 = "A1"; // uzytkownik chce A1, sprawdza na puli ze juz jest i a2 wskazuje na miejsce w pamieciu ,
        // gdzie jest A1
        // pula ma rozmiar staly, i jak bedzie duza aplikacja, to A1 mogloby zniknac z puli  i by nie zadzialalo
        // ["A1"] <- pula
        //możnaby wymusic stworzenie nowych obiektów
        //String a1 = new String("A1");
        //String a2 = new String("A1"); //będzie :"a1 != a2"
        if(a1 == a2){
            System.out.println("a1 == a2"); //TU
                                            //
        }else{
            System.out.println("a1 != a2"); // bo miejsce w pamieci jest rozne
        }

        if(a1.equals(a2)){
            System.out.println("a1 equals a2"); //TU
                                                //
        }else{
            System.out.println("a1 !equals a2");
        }

        Person p1 = new Person("M","P","1");
        Person p2 = new Person("M","P","1");

        if(p1.equals(p2)){ //nadpisalismy equals, bo w przeciwnym wypadku bedzie ze !equals - bo jest to typ zlozony, na typach prostych jak String to wartosci sa takie same bo tworcy zaimplementowali takie rozwiazanie
            System.out.println("p1 equals p2");
        }else{
            System.out.println("p1 !equals p2");
        }



    }
}
