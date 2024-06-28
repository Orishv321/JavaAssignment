package Assignemnt1_2.Q2_Account;

public class SavingAccount extends Account{

    public SavingAccount(double account_number, double balance, double annual_interest_rate) {
        super(account_number, balance, annual_interest_rate);
    }

    @Override
    public void withdrawal(double amount) {
        if (amount> 0 &&  getBalance() >= amount){
            super.withdrawal(amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
