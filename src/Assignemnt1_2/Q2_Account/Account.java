package Assignemnt1_2.Q2_Account;

public class Account {
    private double account_number;
    private double balance;
    private double annual_interest_rate;

    public Account(double account_number, double balance, double annual_interest_rate) {
        this.account_number = account_number;
        this.balance = balance;
        this.annual_interest_rate = annual_interest_rate;
    }

    public double getAccount_number() {
        return account_number;
    }

    public void setAccount_number(double account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnual_interest_rate() {
        return annual_interest_rate;
    }

    public void setAnnual_interest_rate(double annual_interest_rate) {
        this.annual_interest_rate = annual_interest_rate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            setBalance(balance);
            System.out.println("Your total balance is " + balance);
        } else {
            System.out.println("Invalid Amount " + amount);
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Your total balance is " + balance);
        }else{
            System.out.println("Invalid Amount " + amount);
        }
    }
}
