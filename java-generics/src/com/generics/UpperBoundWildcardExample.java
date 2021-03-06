package com.generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class UpperBoundWildcardExample {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        List<Double> collect1 = IntStream.range(1, 100).asDoubleStream().boxed().collect(Collectors.toList());
        List<Long> collect2 = LongStream.range(1, 100).boxed().collect(Collectors.toList());
        calculateSum(collect2);
    }
    public static void calculateSum(List<? extends Number> list){ // you can use this class and its subclasses
        double sum = 0;
        for (Number li : list){
            sum  = sum + li.doubleValue();
        }
        System.out.println("Total is :"+sum);
    }
}
