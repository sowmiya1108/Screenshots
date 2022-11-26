package com.company;
import java.lang.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Date {
    Integer date;
    Integer Month;
    Integer year;
    public Date(Integer d,Integer Month,Integer year){
        this.date=d;
        this.Month=Month;
        this.year=year;
    }

    @Override
    public String toString(){
        return date+"-"+Month+"-"+year;
    }

    class LinkedListexample{
        public static void main(String[] args){
            LinkedList<Date> list=new LinkedList<Date>();
            Date d1=new Date(3,8,2001);
            Date d2=new Date(16,2,2010);
            Date d3=new Date(9,5,2011);
            Date d4=new Date(7,3,2012);
            Date d5=new Date(12,7,2007);
            list.add(d1);
            list.add(d2);
            list.add(d3);
            list.add(d4);
            list.add(d5);
            System.out.println(list);
            Iterator<Date> itr= list.iterator();
            while(itr.hasNext()){
                Date d=(Date)itr.next();
                Integer date=d.date;
                Integer month=d.Month;
                Integer year=d.year;

                if(year%400==0){
                    System.out.println("The date of birth is "+date+"-"+month+"-"+year+"is not a leap year");
                } else if (year%100==0) {
                    System.out.println("The date of birth is "+date+"-"+month+"-"+year+"is not a leap year");
                } else if (year%4==0) {
                    System.out.println("The date of birth is "+date+"-"+month+"-"+year+"is not a leap year");
                }
            }
        }
    }
}
