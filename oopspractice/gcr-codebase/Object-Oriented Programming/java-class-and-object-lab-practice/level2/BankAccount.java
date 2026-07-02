class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Vandana", 123456789, 10000);

        acc.deposit(5000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}