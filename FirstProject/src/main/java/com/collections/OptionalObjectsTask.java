package com.collections;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created by marcinpankowski on 10.09.16.
 */
public class OptionalObjectsTask {

    void foo(Optional<String> a){
        //if( a == null_ throw IllegalArgumentExeption
        a.orElseThrow(IllegalArgumentException::new);//java ver 8
    }

    void foo2(Optional<String> a){
    //isPresent(<0);

    }

    void foo3(Optional<String> a){
       // a.isPresent(<0);

    }

    public static void main(String[] args) {

    }
}
