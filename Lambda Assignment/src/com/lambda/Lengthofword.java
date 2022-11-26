package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Lengthofword {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>(Arrays.asList("hello","good","morning"));
        list.removeIf(word->word.length()%2==0);
        System.out.println(list);
    }
}
