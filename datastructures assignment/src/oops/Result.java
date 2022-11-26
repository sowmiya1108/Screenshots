package oops;

public class Result {
    public static void main(String[] args){
        marksofStusents(67,80,90);

        marksofStusents(67,80,55);

        marksofStusents(68,55,55);

        marksofStusents(55,50,42);

    }

    public static void marksofStusents(int sub1,int sub2,int sub3){
        if(sub1>60&&sub2>60&&sub3>60){
            System.out.println("Passed");
        }else if(((sub1 > 60)&&(sub2 > 60))||((sub2 > 60)&&(sub3 > 60))||((sub3 > 60)&&(sub1>60))){
            System.out.println("Promoted");
        }else if(sub1>60||sub2>60||sub3>60){
            System.out.println("Failed");
        }else{
            System.out.println("Failed in all subjects");
        }
    }
}
