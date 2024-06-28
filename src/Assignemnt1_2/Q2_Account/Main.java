package Assignemnt1_2.Q2_Account;

public class Main {
public static void main(String[] args) {

    System.out.println("Checking Account");
    CheckingAccount ca = new CheckingAccount(110112 , 4000 , 0.5 , 3000);
    ca.deposit(200);
    ca.withdrawal(7000);

    System.out.println("Saving Account");
    SavingAccount sa = new SavingAccount(110112 , 3000 , 0.5);
    sa.withdrawal(100);
}
}
