package Assignemnt1_2.Q2_Account;

public class CheckingAccount extends Account{
    private double overDraftLimit;

    public CheckingAccount(double account_number, double balance, double annual_interest_rate, double overDraftLimit) {
        super(account_number, balance, annual_interest_rate);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdrawal(double amount) {
        if (amount > 0 && (getBalance()+ overDraftLimit >= amount)) {
            setBalance(getBalance()+ overDraftLimit);
            super.withdrawal(amount);
        }else{
            System.out.println("Insufficient funds");
        }
    }

}
