package Assignment1_2.Q3_Beauty;

public class Customer {
    private String name;
    private int memberType; // 0 for non-member, 1 for Silver, 2 for Gold, 3 for Premium

    public Customer(String name, int memberType) {
        this.name = name;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public int getMemberType() {
        return memberType;
    }
}
