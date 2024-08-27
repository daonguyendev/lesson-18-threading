package com.codegym.wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
        int a = 3;
        Integer b = a; //auto boxing
        System.out.println(b);

        Float c = Float.parseFloat(String.valueOf(b)); //casting
        System.out.println(c);

        Integer d = 5;
        int e = d.intValue();//unboxing
        System.out.println(e);
    }
}
