package com.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RestrictionInGenerics {
    public static void main(String[] args) {
        // No Primitive
        List<Integer> intList1 = new ArrayList<>();
        //List<int> intList2 = new ArrayList<>();

        // No Instance
        // No static field
        // No Casting

        List<Number> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        // num1 = (List<Integer>)num2;

        // No instance of
        //if(num2 instanceof List<Integer>){}

        // No Array
        //List<Integer>[] arrayList = new ArrayList<Integer>[2];

        // class <T extends Exception or Throwable>
    }
}
class GenClass<T>{
     private T t;
}
