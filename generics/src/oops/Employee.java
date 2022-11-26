package oops;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Employee {
   static void displayDetails(){
        Set<Integer> set1=new HashSet<Integer>();

        set1.add(101);
        set1.add(102);
        set1.add(103);

        Set<String>set2=new HashSet<String>();
        set2.add("sowmiya");
        set2.add("susi");
        set2.add("abi");

        Set<Double>set3=new HashSet<Double>();
        set3.add(1000.00);
        set3.add(2000.00);
        set3.add(3000.00);

        Set<String>set4=new HashSet<String>();
        set4.add("Science");
        set4.add("Computer");
        set4.add("ComputerDept");


        for(Integer a:set1){
            System.out.println("Id:  %d\n", a);
        }
        Iterator<String>b=set2.iterator();
        while(b.hasNext())
        {
            System.out.println("Name:%s\n", b.next());
        }
       for(Double c:set3){
           System.out.println("Salary:%f\n",c);
       }
       Iterator<String>d=set4.iterator();
       while(d.hasNext()){
           System.out.println("Department:%s\n",d.next());
       }
    }
}
