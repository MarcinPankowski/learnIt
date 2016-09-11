package com.infoshare.task2;

import java.time.LocalDate;

/**
 * Created by marcinpankowski on 28.08.16.
 */
public class MainApp {
    public static void main(String[] args) {
        Group jeden = new Group();
        jeden.setName(" grupa 1");

        User user1 = new User();
        user1.setId(1);
        user1.setName("Janek");
        user1.setSurname("Kowalski");
        user1.setDeteOfBirth(LocalDate.of(1980, 2, 20));
        jeden.saveUser(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("Henryk");
        user2.setSurname("Powalski");
        user2.setDeteOfBirth(LocalDate.of(1985, 3, 10));
        jeden.saveUser(user2);




        Administrator admin = new Administrator();
        admin.setId(3);
        admin.setName("Marcin");
        admin.setSurname("Kopytko");
        admin.setDeteOfBirth(LocalDate.of(1970,2,21));

        jeden.saveUser(admin);



//        User userno = new User();
//        userno.setId(4);
//        userno.setName("sdfslfheos;ihfsluiohf;seirhfo;seirhg");
//        userno.setSurname("fsdfsdfuhsduf");
//        userno.setDeteOfBirth(LocalDate.of(1100,1,1));
//
//        jeden.saveUser(userno);

        jeden.printAllUsers();
    }
}
