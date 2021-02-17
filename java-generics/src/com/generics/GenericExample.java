package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        System.out.println(genericMethod("Apple", "Orange"));
        System.out.println(genericMethod(100,200));
        System.out.println(genericMethod('A','B'));
        genericMethod(new Student(),new Student());
        String s = genericMethod("Apple", "Orange").get(0);
        System.out.println("Value :"+s);
    }
    static <T> List<T> genericMethod(T s1, T s2) {
        List<T> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return list;
    }

    static List<String> listMethod(String s1, String s2) {
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return list;
    }
}
class Student{

}
