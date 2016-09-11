package com.workshops;

import org.apache.log4j.Logger;

/**
 * Created by marcinpankowski on 27.08.16.
 */
public class MyFirstApp {

    private static final Logger log = Logger.getLogger(MyFirstApp.class);
    public static void main(String[] args) {

        log.info("log4j logging");
        System.out.println("Hello World2 " + args[0] + " second " + args[1]);
        System.out.println("Hello");
    }

}