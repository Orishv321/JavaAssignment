package Assignment1_2.Q1_Person_Student;

public class Faculty extends Employee{
    private String office_hours ;
    private String rank;


    public Faculty(String name, String address, String phone, String email, String office, String salary, String date_hired, String office_hours, String rank) {
        super(name, address, phone, email, office, salary, date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public String getOffice_hours() {
        return office_hours;
    }

    public void setOffice_hours(String office_hours) {
        this.office_hours = office_hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty " + getName();
    }
}
