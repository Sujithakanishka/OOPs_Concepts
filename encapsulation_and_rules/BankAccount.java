package One_perday.day1.encapsulation_and_rules;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;


    public BankAccount()
    {
        
    }

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(this.balance + amount);
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance! Withdrawal of $" + amount + " denied.");
        } else {
            setBalance(this.balance - amount);
            System.out.println("Withdrew: $" + amount);
        }
    }
    
    @Override
    public String toString() {
        return "BankAccount [accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + ", balance="
                + balance + "]";
    }
    
    
}


