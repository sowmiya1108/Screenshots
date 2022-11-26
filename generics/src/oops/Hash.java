package oops;
import java.util.*;
public class Hash {
    public static void main(String[] args){

        HashMap<Integer,Double> map=new HashMap<Integer, Double>();
        map.put(80,92.78);
        map.put(78,89.70);
        map.put(68,94.56);
        map.put(73,98.02);

        System.out.println("Data in hashmap");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
