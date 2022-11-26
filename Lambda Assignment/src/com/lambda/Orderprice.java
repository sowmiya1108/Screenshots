package com.lambda;
interface Order{
    void criteria(int price);
}
public class Orderprice {
    public static void main(String[] args) {
        Order s1 = (a) -> {
            if (a > 10000) {
                System.out.println("Order price is more than 10000 ");
                System.out.println("Completed");
            }else{
                System.out.println("Accepted");
            }
        };
        s1.criteria(30000);

    }

}
