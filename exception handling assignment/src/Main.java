public class Main {
    public static void main(String[] args) {

        Account account=new Account(100);
        System.out.println("Depositing rd.10000");
        account.deposit(10000);


        try{
            System.out.println("Withdrawing rs.2000");
            account.withdraw(2000);
            System.out.println("Withdrawing rs.9000");
            account.withdraw(9000);
        }catch(InsufficientbalanceException e){
            System.out.println("Can't Withdraw money.Remaining account balance is:"+e.getBalance());
        }

    }
}