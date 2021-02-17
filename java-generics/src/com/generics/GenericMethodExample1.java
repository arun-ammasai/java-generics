package com.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMethodExample1 {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,2,3,4,5};
        Character[] charArray = new Character[]{'A','B','C'};
        String[] stringArray = new String[]{"One","Two","Three"};
        //int[] intArray1 = new int[]{1,2,3,4,5};
        printData(stringArray);
    }

    //syntax
    public static <T> void printData(T[] t){
        for(T data : t){
            System.out.println(data);
        }
    }


}
