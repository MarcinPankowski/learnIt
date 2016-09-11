package com.workshops;

import java.util.Comparator;

/**
 * Created by marcinpankowski on 27.08.16.
 */
public class Employee implements Comparable<Employee>{
    private String imie;
    private int pensja;

public Employee(String imie, int pensja){
    this.imie = imie;
    this.pensja = pensja;
}
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return imie;
    }

    @Override
    public int compareTo(Employee o) { //zwraca -1 , 0 ,1 ; 1 - wieksza nasza , 0 - rowne ; -1 - wieksza ta co pszyszla od naszej
        if (pensja > o.getPensja()) {
            return 1;
        }else{
            return -1;
        }

    }
}
