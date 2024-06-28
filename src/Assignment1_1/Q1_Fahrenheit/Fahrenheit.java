package Assignment1_1.Q1_Fahrenheit;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit:");
        double temperature = sc.nextDouble();
        double celsius = (temperature - 32) * 5 / 9;
        System.out.println("The Celsius is " + celsius);
    }
}
