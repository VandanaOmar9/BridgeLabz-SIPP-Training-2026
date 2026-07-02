class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance = 10000;

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount() {
        accountNumber = 1234;
        accountHolder = "Vandana";
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        System.out.println(s.accountNumber);
        System.out.println(s.accountHolder);
        System.out.println(s.getBalance());
    }
}