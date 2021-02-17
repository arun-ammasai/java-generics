package com.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {
    public static void main(String[] args) {
        //Before Java7
        List<String> li = new ArrayList<String>();
        //In Java7
        List<String> li1 = new ArrayList<>();
        Shape<String> shape = new Shape<>("Hello");
    }
}
class Shape<T>{
    private T t;

    public Shape(T t) {
        this.t = t;
    }

    public void add(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
// Shape - Generic Class
// <> - Diamond Operator which denotes the type inference
