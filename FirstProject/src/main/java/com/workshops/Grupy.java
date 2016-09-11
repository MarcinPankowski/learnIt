package com.workshops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by marcinpankowski on 27.08.16.
 * - wykorzystując grupowanie z klasy Matcher, stwórz wzorzec, który wyciągnie z daty w formacie DD/MM/YYYY
 dzień, miesiąc oraz rok
 */
public class Grupy {
    public static void main(String[] args) {
        String input = "20/05/1999";
        //String pattern = "(\\d(2))/((01)\\d)/(\\d(4))";
        final String pattern = "(\\d{2})/(\\d{2})/(\\d{4})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        while(m.find()){
            System.out.println(">>>");
            System.out.println(m.group(1));

        }

    }

}
