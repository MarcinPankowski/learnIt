package com.infoshare.task2;

import java.time.LocalDate;

/**
 * Created by marcinpankowski on 28.08.16.
 */
public class User {
    public static final int NAME_LENGTH_LIMIT = 20;
    public static final int SURNAME_LENGTH_LIMIT = 30;
    public static final LocalDate DATE_BIRTH_AFTER = LocalDate.of(1920, 1, 1);
    public static final LocalDate DATE_BIRTH_BEFORE = LocalDate.of(2016, 1, 1);
    private int id;
    private String name;
    private String surname;
    private LocalDate deteOfBirth; //okresla dzien miesiac rok



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(" Imię dłuższe niż 20 znaków");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length() > SURNAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(" Nazwisko dłuższe niż 30 znaków");
        }
        this.surname = surname;
    }

    public LocalDate getDeteOfBirth() {
        return deteOfBirth;
    }

    public void setDeteOfBirth(LocalDate deteOfBirth) {
        if (!deteOfBirth.isAfter(DATE_BIRTH_AFTER) ||
                !deteOfBirth.isBefore(DATE_BIRTH_BEFORE)) {
            throw new IllegalArgumentException(" Nieprawidłowa data urodzenia");
        }
        this.deteOfBirth = deteOfBirth;
    }

    @Override
    public String toString() {
        return name + " " + surname + " [" + deteOfBirth + "] ";
    }
}

