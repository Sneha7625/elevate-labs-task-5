import java.util.ArrayList;
import java.util.List;

public class Account 
{
    private String accountHolder;
    private double balance;
    private List<String> transactions;

    public Account(String accountHolder) 
    {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account created for " + accountHolder);
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            transactions.add("Deposited: Rs" + amount);
            System.out.println("Deposited Rs" + amount);
        } 
        else 
        {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            transactions.add("Withdrew: RS" + amount);
            System.out.println(" Withdrew Rs" + amount);
        } 
        else 
        {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void showBalance() 
    {
        System.out.println(" Current Balance: Rs" + balance);
    }

    public void showTransactions() 
    {
        System.out.println("\n Transaction History for " + accountHolder + ":");
        for (String txn : transactions) 
        {
            System.out.println("- " + txn);
        }
    }
}
