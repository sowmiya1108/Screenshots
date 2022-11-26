package oops;

public class Singleton {
    public static void main(String[] args){}
    private static Singleton INSTANCE=null;
    private Singleton() {}
    public static Singleton getInstance(){
        if(INSTANCE==null){
            synchronized (Singleton.class){
                INSTANCE=new Singleton();
            }
        }
        return INSTANCE;
    }
}
