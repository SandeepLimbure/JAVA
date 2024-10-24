package StaticMembers;

public class BankAccount {
    private  String AccountNumber;
    private  double balance;
    private static String bankName;
    private static double interestRate;
    public BankAccount(String accountNumber, double balance) {
        this.AccountNumber = accountNumber;
        this.balance = balance;
    }
    public static String getBankName(){
        return bankName;
    }
    public static void setBankName(String name) {
        bankName = name;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
    public void printDetails() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    public static void main(String[] args) {
        BankAccount.setBankName("National Bank");
        BankAccount.setInterestRate(3.5);
        BankAccount account1 = new BankAccount("123456789", 1000.00);
        BankAccount account2 = new BankAccount("987654321", 2000.00);
        account1.printDetails();
        System.out.println();
        account2.printDetails();
    }

}
