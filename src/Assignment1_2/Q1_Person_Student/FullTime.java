package Assignment1_2.Q1_Person_Student;

public class FullTime  extends  Staff{
    public FullTime(String name, String address, String phone, String email, String office, String salary, String date_hired, String title) {
        super(name, address, phone, email, office, salary, date_hired, title);
    }



    @Override
    public String toString() {
        return "FullTime "+ getName();
    }
}
