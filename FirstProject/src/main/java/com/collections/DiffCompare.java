package com.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcinpankowski on 10.09.16.
 */
public class DiffCompare {

    //List<String> linee = new ArrayList<String>(); //lista w wierszami

    public List<String> readFileToList(String fileName) throws IOException {
        //wczytaj plik i linie        // do listy zaladuje dane do pliku
        List<String> listWithlines1 = new ArrayList<String>();
        //BufferedReader in = null;
     try(BufferedReader in = new BufferedReader(new FileReader(fileName))){ // try - with - resources - w () wszystkie zasoby ktore musza byc zamkniete , zamiast  in.close(); kompilator wywola close na wszystkim w try()
     //   try{
       //     in = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = in.readLine()) != null){
                listWithlines1.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }   //finally{
            //   if (in != null){
            //      in.close();
            //  }
            //  }
        return listWithlines1;
    }

    public void diff(String file1, String file2) throws IOException {
        List<String> lines1 = readFileToList(file1); //lista w wierszami z pliku 1
        List<String> lines2 = readFileToList(file2); //lista w wierszami z pliku 2
        //System.out.println(lines1);
        //

        for(String line: lines2){

            if(!lines1.contains((line))){
                System.out.println("+ "+line);
            }else{
                System.out.println(line);
            }
        }

        System.out.println("========== ");
        System.out.println("No more lines: ");
        for(String line: lines1){
            if(!lines2.contains((line))){
                System.out.println("- "+line);

            }
        }

        /*for( String e1: lines1){
            for (String e2:lines2){
                if(e1.contains(e2)){
                    System.out.println(e1);
                    System.out.println("OK");
                    break;
                }else{
                    System.out.println("no OK");
                }

            }

        }*/
       /* if(lines1.contains(lines2)){
            System.out.println("OK");
        }else{
            System.out.println("no OK");
        }*/


    }

    public static void main(String[] args) throws IOException {

    DiffCompare df = new DiffCompare();
        df.diff("a.txt","b.txt");

        //linie.contains( ); //true ma linie
    }
}
