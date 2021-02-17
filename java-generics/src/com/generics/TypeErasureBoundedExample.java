package com.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureBoundedExample {
    public static void main(String[] args) {
        Calculate<Long> calc = new Calculate<>(34l);
        System.out.println(calc);

    }
}
class Calculate<T extends Number>{
    T t;

    public Calculate(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "t=" + t +
                '}';
    }
}