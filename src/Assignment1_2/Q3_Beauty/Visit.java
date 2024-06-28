package Assignment1_2.Q3_Beauty;

public class Visit {
    private Customer customer;
    private double productsCost;
    private double servicesCost;

    public Visit(Customer customer, double productsCost, double servicesCost) {
        this.customer = customer;
        this.productsCost = productsCost;
        this.servicesCost = servicesCost;
    }

    public double getTotalBill() {
        Discount discount = new Discount();
        int serviceDiscountPercent = discount.getServiceDiscount(customer.getMemberType());
        double productDiscountPercent = discount.getProductDiscount() / 100.0; // convert to fraction

        // Calculate costs after discounts
        double productsCostAfterDiscount = productsCost * (1 - productDiscountPercent);
        double servicesCostAfterDiscount = servicesCost * (1 - serviceDiscountPercent / 100.0);

        // Total bill
        return productsCostAfterDiscount + servicesCostAfterDiscount;
    }
}
