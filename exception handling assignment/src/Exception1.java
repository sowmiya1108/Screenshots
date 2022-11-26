public class Exception1 {

    static void m1(){
        try {
            int a=4;
            int b=0;
            int c=a/b;

        }
        catch(ArithmeticException e){
            throw new UnsupportedOperationException("unsupported number zero...please give valid number",e);
        }
    }

    public static void main(String[] args){
        try{
            m1();

        }catch(java.lang.Exception e){
            System.err.println(e.getMessage());
            System.err.println(e);
        }
    }

}
