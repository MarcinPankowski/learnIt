package com.collections;

/**
 * Created by marcinpankowski on 10.09.16.
 */
public class ExeptionExamples {

    public void foo(int a){
        if(a == 0){
            throw new IllegalArgumentException("A cannot be 0");
        }

    }


    public void foo2(int a) {
        try{
            foo(a);
        }
        catch(Exception e){
            throw  new IllegalArgumentException("A cannot be 0",e);
            // throw new RunTimeException("blad",e); - zle , trzeba dodac ",e" - wtedy nie zgubimy wyjatku jezeli
            //pod foo(a) nie bedzie wiecej metod
        }


//      mniej elegancko
//        try{
//            if(a == 0){
//                throw new IllegalArgumentException("A cannot be 0");
//            }
//        }
//        catch(Exception e){
//          //wyjatek polkniety nie bedzie nic -
        // e.PrintStackTrace() - nie wydrukuje log
        //log.error("ASD", e

//        }
    }

    public void validateP(int pesel) throws Exception{ //zmusic do obslugi wyjatku try-catch
        if (pesel <= 5){
           // throw  new RuntimeException("bledna suma kontrolna");
            //throw  new Exception("bledna suma kontrolna");
            throw  new IllegalArgumentException("bledna suma kontrolna");

        }

        if (pesel <= 10){
            //throw  new RuntimeException("bledny pesel");
            //throw  new Exception("bledny pesel");
            throw  new IllegalArgumentException("bledny pesel");
        }


        }


    public static void main(String[] args)   {
        //throw new RuntimeException("jakis wyjatek"); //rzucanie wujatkiem
        ExeptionExamples ee = new ExeptionExamples();
        //ee.foo(1);
        //ee.foo(0); // wywali StackTrace z wyjatkami

   // ee.foo2(0);

        //Person p1 = new Person("M","P","-1");
        //p1.validatePesel((Integer.parseInt(p1.getPesel())));

       // Person p2 = new Person("M","P","1222222222");
        //p2.validatePesel((Integer.parseInt(p2.getPesel())));

        try {
            ee.validateP(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
