package com.workshops;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcinpankowski on 27.08.16.
 */
public class SolveIt {

    public static void main(String[] args) {
        SolveIt solveit = new SolveIt();
        try {
            solveit.parse();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void parse() throws URISyntaxException, IOException{
        List<Persons> persons = new ArrayList<>();
        final URL resource = getClass().getResource("/persons.csv");
        final List<String> strings = Files.readAllLines(Paths.get(resource.toURI()));
        //System.out.println(strings);
        for (String line:strings){
            //System.out.println(line);
            String[] parts = line.split(",");

            Persons e = new Persons(Integer.parseInt(parts[0]),parts[1],parts[2],parts[3],parts[4],parts[5]);
            persons.add(e);
            //System.out.println(parts[0]);

        }

        for (Persons osoba:persons){
            if (osoba.getSex().equals(Persons.Sex.FEMALE)){
                System.out.println(" Kobieta: " + osoba.getId() + ": " + osoba.getName() + " - " + osoba.getSurname());
                System.out.println(osoba);
            }
        }


    }

}
