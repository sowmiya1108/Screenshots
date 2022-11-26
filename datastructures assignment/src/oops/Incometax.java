package oops;
import java.util.Scanner;

public class Incometax {
    public static void main(String[] args){
        double tax=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter income: ");
        i=sc.nextDouble();
        if(i<=180000){
            tax=0;
        }else if(i>=181000&&i<300000){
            tax=0.1*i;
        }else if(i>=300000&&i<500000){
            tax=0.2*i;
        }else if(i>=500000&&i<1000000){
            tax=0.3*i;
        }
        System.out.println("the income tax amount is: "+tax);
    }
}
