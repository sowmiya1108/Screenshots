package com.lambda;

import java.util.function.BiFunction;

public class ArithmeticOperations {
    public static void main(String[] args){
        //Addition
        BiFunction<Integer,Integer,Integer>funcAddobj=(i1,i2)->i1+i2;
        //subtration
        BiFunction<Integer,Integer,Integer>funcSubobj=(i1,i2)->i1-i2;
        //multiplication
        BiFunction<Integer,Integer,Integer>funcMultobj=(i1,i2)->i1*i2;
        //Division
        BiFunction<Integer,Integer,Integer>funcDivobj=(i1,i2)->i1/i2;

        System.out.println("Addition of two numbers:"+funcAddobj.apply(10,5));

        System.out.println("Subtraction of two numbers:"+funcSubobj.apply(12,3));

        System.out.println("Multiplication of two numbers:"+funcMultobj.apply(30,5));

        System.out.println("Division of two numbers:"+funcDivobj.apply(50,5));


    }
}
