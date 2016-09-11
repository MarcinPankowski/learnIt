package com.workshops;

/**
 * Created by marcinpankowski on 27.08.16.
 */
public class Persons {
    private int id;
    private String name;
    private String surname;
    private String mail;
    private Sex sex;
    private String ipAddress;

    public Persons(int id, String name, String surname, String mail, String sex, String ipAddress) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        if (sex.equals("Female")){
            this.sex = Sex.FEMALE;
        }else{
            this.sex = Sex.MALE;
        }
        this.ipAddress = ipAddress;
    }

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
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    enum Sex{
        MALE, FEMALE
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}

