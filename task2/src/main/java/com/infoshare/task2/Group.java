package com.infoshare.task2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by marcinpankowski on 28.08.16.
 */
public class Group {
    private String name; //nazwe grupy
    private Set<User> users = new HashSet<>(); //zbior unikalnych uzytkownikow pusty

    public void setName(String name) {
        if (name.length() > 20){
            throw new IllegalArgumentException(" Nazwa grupy jest zbyt długa");
        }
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }


    public void saveUser(User user){
        users.add(user);
    }

    public void removeUser(int userId){
        for (User user : users){
            if (user.getId() == userId){
                users.remove(user);
            }
        }
    }

    public void printAllUsers(){
        for ( User user : users){
            System.out.println(user);
        }
    }
}
