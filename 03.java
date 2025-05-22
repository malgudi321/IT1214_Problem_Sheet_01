class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
	 }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: $" + balance);
    }
}
class Bank {
    private BankAccount[] accounts = new BankAccount[5];
    private int count = 0;

    public void addAccount(BankAccount account) {
        if (count < accounts.length) {
            accounts[count++] = account;
        } else {
            System.out.println("Bank account limit reached.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));
        bank.withdrawFromAccount(1001, 6000.0); 
        bank.withdrawFromAccount(1002, 1000.0);
 bank.displayAllAccounts();
    }
}
