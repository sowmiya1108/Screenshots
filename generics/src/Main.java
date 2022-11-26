import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //date
        Pairs<String,String>myobj=new Pairs<String,String>("1","sowmi");
        Pairs<String,java.util.Date>myobj1= new Pairs<String, java.util.Date>("Today is ",new java.util.Date());
        myobj.setKey("1");
        myobj.setValue("sowmi");
        myobj1.setKey("Today is");
        myobj1.setValue(new java.util.Date());
        System.out.println("key: "+myobj.getKey());
        System.out.println("value: "+myobj.getValue());
        System.out.println("key: "+myobj1.getKey());
        System.out.println("value: "+myobj1.getValue());
        
        
        //swap
        
        test();


        //employee
        {
            displayDetails();
        }
    }
    public static final<T> void swap(List<T>l,int i,int j){
        Collections.<T>swap(l,i,j);
        
    }
    private static void test(){
        String[] a={"Sowmiya","Sowmi"};
        swap(a,0,1);

        System.out.println("a:"+ Arrays.toString(a));
        List<String>l=new ArrayList<String>(Arrays.asList(a));
        swap(l,0,1);
        System.out.println("l:"+l);
        
    }

    private static void swap(String[] a, int i, int j) {
        System.out.println("a to l");
    }


}