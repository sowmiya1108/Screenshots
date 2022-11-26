package oops;

import java.util.Scanner;

public class Armstrongornot {

    public static void main(String[] args){
        int i=100,arm;
        System.out.println("armstrong between 100 to 999");
        while(i<1000){
            arm=armStrong(i);
            if(arm==i)
                System.out.println(i);
            i++;
        }
    }

  public static int armStrong(int num)
    {
        int x,a=0;
        while(num!=0)
        {
            x=num%10;
            a=a+(x*x*x);
            num/=10;
        }return a;
    }

}
