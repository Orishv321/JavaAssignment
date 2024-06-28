package Assignment1_2.Q3_Beauty;

public class Discount {
    private int serviceDiscount;
    private int productDiscount;

    public Discount() {
        this.serviceDiscount = 0;
        this.productDiscount = 10; // Flat 10% discount on products for all members
    }

    public int getServiceDiscount(int memberType) {
        switch (memberType) {
            case 1:
                return 10;
            case 2:
                return 15;
            case 3:
                return 20;
            default:
                return 0;
        }
    }

    public int getProductDiscount() {
        return productDiscount;
    }
}
