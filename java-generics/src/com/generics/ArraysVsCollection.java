package com.generics;

import java.util.ArrayList;
import java.util.List;

public class ArraysVsCollection {
    public static void main(String[] args) {
        //Array
        String[] s = new String[10];
        s[0] = "John";
        s[1] = "Nancy";
        //s[11] = "Sam";
        //s[2] = new Integer(100);
        System.out.println("String Array is :"+s);
        String name = s[0];
        
        //Collection
        List li = new ArrayList();
        li.add("John");
        li.add("Nancy");
        li.add(new Integer(100));
        System.out.println(li);
        String name1 = (String)li.get(1);
        System.out.println("The Name1 :"+name1);
        int value = (int)li.get(2);
        System.out.println("value :"+value);
    }
}
