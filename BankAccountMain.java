class BankAccount {
    private String accountNo, holder;
    private double balance;
    BankAccount(String accountNo, String holder, double balance) {
        this.accountNo = accountNo; this.holder = holder;
        this.balance = Math.max(0, balance);
    }
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit");
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Withdrawal failed");
    }
    double getBalance() { return balance; }
    void display() {
        System.out.println(accountNo + " | " + holder + " | Rs." + getBalance());
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("ACC101", "Devesh", 5000);
        a.deposit(2000); a.withdraw(1000); a.display();
    }
}
