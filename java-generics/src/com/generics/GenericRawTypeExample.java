package com.generics;


public class GenericRawTypeExample {
    public static void main(String[] args) {
        ShapeClass<Integer> shape = new ShapeClass<>();
        shape.setT(100);
        System.out.println("Data is."+shape.getT());
        // No warnings
        ShapeClass shape1 = shape;
        // Unchecked call
        shape1.setT("Hello");
        // Unchecked conversion
        shape = shape1;

    }
}
class ShapeClass<T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}