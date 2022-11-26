public class ReverseBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("this method returns the reversed object on which it was called");
        System.out.println("Given a string is:" + sb1);
        sb1.reverse();
        System.out.println("given string after reversing=" + sb1);
    }

}
