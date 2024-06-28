package Assignment1_2.Q1_Person_Student;

public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;


    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Person Class : "+ name;
    }
}
