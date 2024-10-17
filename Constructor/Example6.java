package Constructor;

public class Example6 {
    public static class Account {
        private String accountNumber;
        private double balance;
        public Account(String accountNumber, double balance) {
            if (accountNumber == null || accountNumber.isEmpty()) {
                System.err.println("Error: Account number cannot be null or empty.");
                return;
            }
            if (balance < 0) {
                System.err.println("Error: Balance cannot be negative.");
                return;
            }
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }
        public static void main(String[] args) {
            Account account1 = new Account("12340009", 1000.00);
            System.out.println("Account 1 Number: " + account1.accountNumber);
            System.out.println("Account 1 Balance: " + account1.balance);
            Account account2 = new Account("", 400.00);
            System.out.println("Account 2 Number: " + account2.accountNumber);
            System.out.println("Account 2 Balance: " + account2.balance);
            Account account3 = new Account("1230000873", -200.00);
            System.out.println("Account 3 Number: " + account3.accountNumber);
            System.out.println("Account 3 Balance: " + account3.balance);
    }
}
