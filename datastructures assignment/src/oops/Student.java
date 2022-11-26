package oops;

public class Student {
    public static void main(String[] args){
        int[] s1={81,93,78};
        int[] s2={77,52,87};
        int[] s3={91,53,48};

        int total1=0;
        int total2=0;
        int total3=0;
        for(int i=0;i<3;i++){

            total1=total1+s1[i];
            total2=total2+s2[i];
            total3=total3+s3[i];

        }
        int avg1=total1/3;
        int avg2=total2/3;
        int avg3=total3/3;

        System.out.println("Total and average score of Student 1: "+total1+" , "+avg1);
        System.out.println("Total and average score of Student 2: "+total2+" , "+avg2);
        System.out.println("Total and average score of Student : "+total3+" , "+avg3);

        int totalA=s1[0]+s2[0]+s3[0];
        int totalB=s1[1]+s2[1]+s3[1];
        int totalC=s1[2]+s2[2]+s2[2];

        int avgA=totalA/3;
        int avgB=totalB/3;
        int avgC=totalC/3;

        System.out.println("");

        System.out.println("Total and average score of Student in subject A: "+totalA+" , "+avgA);
        System.out.println("Total and average score of Student in subject B: "+totalB+" , "+avgB);
        System.out.println("Total and average score of Student in subject C: "+totalC+" , "+avgC);
    }
}
