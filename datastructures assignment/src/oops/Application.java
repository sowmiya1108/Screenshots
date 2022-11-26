package oops;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
            if(!validateUser()){
                System.out.println("Contact Admin");
            }
    }

    public static boolean validateUser() {
        boolean result = false;
        String username,password;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Username: ");
            username=sc.nextLine();
            System.out.println("Enter the password: ");
            password=sc.nextLine();

            if (username.equals("Sowmiya") && (password.equals("sowmi@7"))) {
                System.out.println("Welcome " + username);
                result = true;
                return result;
            }
            return result;

        }return result;
    }
}
