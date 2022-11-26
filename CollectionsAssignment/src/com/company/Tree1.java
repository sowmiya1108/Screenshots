package com.company;
import com.sun.source.tree.Tree;

import java.util.*;
import java.util.TreeMap;

public class Tree1 {
    public static void main(String[] args){
        TreeMap<Long,String> map=new TreeMap<Long,String>();
        TreeMap<Long,String> Name=new TreeMap<Long,String>();
        TreeMap<Long,String> email=new TreeMap<Long,String>();
        TreeMap<Long,Enum> Gender=new TreeMap<Long,Enum>();

        map.put(987654321L,"ria");
        map.put(912345678L,"sara");
        map.put(912345566L,"caitlin");
        map.put(999888776L,"oliver");

        System.out.println("The keys of the given treemap is:"+map.keySet());
        System.out.println("The values of the given treemap is:"+map.values());
        System.out.println("The key/value pair is:"+map.entrySet());

        Name.put(987654321L,"Ria");
        Name.put(912345678L,"Raj");
        Name.put(981234560L,"Caity");
        Name.put(988776655L,"barry");
        Name.put(911223344L,"surya");
        Name.put(955667788L,"sara");
        Name.put(912345670L,"vijay");

        System.out.println("The keys of the given treemap is:"+map.keySet());
        System.out.println("The values of the given treemap is:"+map.values());
        System.out.println("The key/value pair is:"+map.entrySet());


        email.put(912345678L,"raj789@gmail.com");
        email.put(981234560L,"caity77@gmail.com");
        email.put(988776655L,"barry123@gmail.com");
        email.put(911223344L,"surya987@gmail.com");
        email.put(955667788L,"sara99@gmail.com");
        email.put(912345670L,"vijay0099@gmail.com");

        System.out.println("The keys of the given treemap is:"+map.keySet());
        System.out.println("The values of the given treemap is:"+map.values());
        System.out.println("The key/value pair is:"+map.entrySet());

    }
}
