public class Buffer {
    public static void main(String[] args){
        StringBuffer sb1=new StringBuffer("it is used to  the specified index position");
        System.out.println("Before inserting: "+sb1);
        StringBuffer sb2=sb1.insert(15,"insert text");

        System.out.println("After inserting text: "+sb2);
    }
}
