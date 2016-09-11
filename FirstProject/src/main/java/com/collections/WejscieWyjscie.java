package com.collections;

import java.io.*;

/**
 * Created by marcinpankowski on 10.09.16.
 */
public class WejscieWyjscie {

    public void CopyBytes(String from, String to) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream(from);
            out = new FileOutputStream(to);
            int c;

            while ((c = in.read()) != -1){
                //System.out.println(c);// kody bajtowe znakow
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (in != null){
                in.close(); // zamykac zeby zasoby nie wyciekly i nie wywalilo bledem
             }
            if (out != null){
                out.close();
            }

        }
    }

    public void CopyBytesChars(String from, String to) throws IOException {// znakowe strumienie we/wy
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader(from);
            out = new FileWriter(to);
            int c;

            while ((c = in.read()) != -1){
                //System.out.println(c);//nadal wyswietla bajty
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (in != null){
                in.close(); // zamykac zeby zasoby nie wyciekly i nie wywalilo bledem
            }
            if (out != null){
                out.close();
            }

        }
    }

    public void CopyBytesCharsBuffer(String from, String to) throws IOException {// znakowe strumienie we/wy
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            in = new BufferedReader(new FileReader(from));
            out = new PrintWriter(new FileWriter(to));
           String line;

            while ((line = in.readLine()) != null){ //nie ma czego czytac to zwraca null
                out.println(line); // ze znakiem konca lini, bo czyta cala linie
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (in != null){
                in.close(); // zamykac zeby zasoby nie wyciekly i nie wywalilo bledem
            }
            if (out != null){
                out.close();
            }

        }
    }

        public static void main(String[] args) throws IOException {
            WejscieWyjscie ww = new WejscieWyjscie();
            // ww.CopyBytes("a.txt", "b.txt");
            //ww.CopyBytesChars("a.txt", "c.txt"); //
            ww.CopyBytesCharsBuffer("a.txt", "d.txt"); //


        }

}
