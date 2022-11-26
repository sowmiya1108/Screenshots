package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Thread{
    public void run(){
        System.out.println("thread is running");
    }
}
class Sample implements Consumer<Integer>{
    public void accept(Integer num){
        System.out.println("Number is: "+num);
    }
}
public class Printnum {
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,3,4,5);
        Thread thread=new Thread();
        Consumer<Integer>c=new Sample();
        list.forEach(c);
    }

}
