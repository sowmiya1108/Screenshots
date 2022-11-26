package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Firstletter {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<>(Arrays.asList("How","are","you"));
        StringBuilder sb=new StringBuilder();
        list.forEach(word->sb.append(word.charAt(0)));
        String result= sb.toString();
        System.out.println(result);
    }
}
