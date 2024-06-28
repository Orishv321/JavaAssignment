package Assignemnt1_2.Q1_Person_Student;

public class Employee extends Person {
    private String office;
    private String salary;
    private String date_hired;


    public Employee(String name, String address, String phone, String email, String office, String salary, String date_hired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDate_hired() {
        return date_hired;
    }

    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;
    }

    @Override
    public String toString(){
        return "Employee " + getName();
    }
}
