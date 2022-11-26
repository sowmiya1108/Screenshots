package oops;
import java.util.Scanner;

public class Simpleandcompound {
    public static void main(String[] args){
        double principle,interest,year,simple,compund;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        principle=sc.nextDouble();
        System.out.println("enter the no.of years");
        year=sc.nextDouble();
        System.out.println("enter the rate of interest");
        interest=sc.nextDouble();
        simple=(principle*year*interest)/100;
        compund=principle*Math.pow(1.0 +interest / 100.0,year)-principle;
        System.out.println("simple interest=" +simple);
        System.out.println("simple interest=" +compund);
    }

}
