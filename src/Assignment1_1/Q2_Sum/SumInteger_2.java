package Assignment1_1.Q2_Sum;

import java.util.Scanner;

public class SumInteger_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number between 0-1000:");
        int n = sc.nextInt();
        if (n<0 || n>1000){
            System.out.println("Invalid Input");
        }
        int sum = 0;
        int orgNumber= n;

        while (n>0) {
            int digit = n%10;
            sum += digit;
            n = n/10;
        }

        System.out.println("The Sum of "+ orgNumber + " : "+ sum);
    }
}
