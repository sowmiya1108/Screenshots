public class IllegalBankTransactionException {
    class IllegalBankTransactionException extends Exception {

        private double balance;

        public IllegalBankTransactionException(double amount) {

            this.balance = amount;

        }

        public double getBalance() {
            return balance;
        }

    }

    class Account {

        private int accNum;
        private double amount=0;

        public Account(int accNum) {
            this.accNum = accNum;
        }

        public void deposit(double deposit) {
            amount = amount + deposit;
        }

        public void withdraw(double withdraw) throws IllegalBankTransactionException {

            if(withdraw<0) {

                throw new IllegalBankTransactionException(amount);
            }else {
                amount = amount - withdraw;

            }

        }

    }

}
