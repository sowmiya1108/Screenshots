package com.lambda;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.HashMap;

public class Iteration {
    public static void main(String[] args){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("a",4);
        map.put("b",2);
        map.put("c",3);

        Iteration keyvalue=new Iteration();
        keyvalue.convertKeyValueToString(map);
    }
    public void convertKeyValueToString(HashMap<String,Integer>map){
        StringBuilder str=new StringBuilder();
        Consumer<Map.Entry>cosumer=(p)->str.append(p.getKey()).append(p.getValue());
        Set set=map.entrySet();
        set.stream().forEach(cosumer);
        System.out.println(str);
    }
}
