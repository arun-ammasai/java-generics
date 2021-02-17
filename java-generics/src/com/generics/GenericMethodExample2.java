package com.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMethodExample2 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = map(1,"One");
        System.out.println(map1);
        Map<String, String> map = map("Hello", "World");
        System.out.println(map);

    }
    public static <K,V> Map<K,V> map(K key,V value){
        Map<K,V> map = new HashMap<>();
        map.put(key,value);
        return map;
    }
}
