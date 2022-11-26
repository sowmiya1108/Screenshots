public class Builder {

    public static void main(String[] args){
        StringBuilder sb1=new StringBuilder("it is used to at the specified index position");
        StringBuilder sb2=sb1.insert(15,"insert text");

        System.out.println("After inserting text: "+sb2);
    }
}