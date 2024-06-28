package Assignment1_2.Q1_Person_Student;

public class Staff extends Employee{
    private String title;


    public Staff(String name, String address, String phone, String email, String office, String salary, String date_hired, String title) {
        super(name, address, phone, email, office, salary, date_hired);
        this.title = title;
    }

    @Override
    public String toString(){
        return "Staff Class : "+ getName();
    }

}
