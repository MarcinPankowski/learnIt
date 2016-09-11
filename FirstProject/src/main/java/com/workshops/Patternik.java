package com.workshops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by marcinpankowski on 27.08.16.
 */
public class Patternik {
    public static void main(String[] args) {
        String text = "ala ma kota. ala ma kota, a kot ma Alę.";
        String pattern = "ma";

        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(text);


        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("found" + count + " : " + matcher.start() + " - " + matcher.end());

        }
    }

}
