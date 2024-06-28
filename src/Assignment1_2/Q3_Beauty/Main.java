package Assignment1_2.Q3_Beauty;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Anish", 3); // Premium member
        Customer customer2 = new Customer("Bipin", 2);   // Gold member
        Customer customer3 = new Customer("Eshan", 1);   // Silver member
        Customer customer4 = new Customer("Jay", 0);  // Non-member

        Visit visit1 = new Visit(customer1, 105, 240); // $100 products, $200 services
        Visit visit2 = new Visit(customer2, 125, 320); // $150 products, $300 services
        Visit visit3 = new Visit(customer3, 90, 130);  // $80 products, $150 services
        Visit visit4 = new Visit(customer4, 120, 240); // $120 products, $250 services

        System.out.println("Bill for " + customer1.getName() + ": Rs." + visit1.getTotalBill());
        System.out.println("Bill for " + customer2.getName() + ": Rs." + visit2.getTotalBill());
        System.out.println("Bill for " + customer3.getName() + ": Rs." + visit3.getTotalBill());
        System.out.println("Bill for " + customer4.getName() + ": Rs." + visit4.getTotalBill());
    }
}
