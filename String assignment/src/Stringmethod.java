public class Stringmethod {
    public static void main(String[] args){
         String str="Java String pool refers to collection of strings which arestored in heap memory";
        System.out.println("String is: "+str);
        String str1=str.toLowerCase();
        System.out.println("String in lowercase: "+str1);
        String str2=str.replace("a","$");
        System.out.println("After replacing a as $ is: "+str2);

        System.out.println(str.contains("collection"));

        System.out.println(str.equals("Java String pool refers to collection of strings which arestored in heap memory"));
    }
}
