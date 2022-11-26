package com.lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Unary {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Raju");
        list.add("Sara");
        list.add("Ria");
        list.add("Oliver");

        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
}
