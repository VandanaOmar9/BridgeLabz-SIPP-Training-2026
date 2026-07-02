class BankAccount {
    static String bankName = "SBI";
    static int total = 0;
    String name;
    final int accountNumber;

    BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        total++;
    }

    static void getTotalAccounts() {
        System.out.println("Accounts = " + total);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Vandana", 101);
        if (b instanceof BankAccount)
            System.out.println(bankName + " " + b.name + " " + b.accountNumber);
        getTotalAccounts();
    }
}