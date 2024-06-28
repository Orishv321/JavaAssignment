package Assignment1_2.Q1_Person_Student;

public class PartTime extends  Staff{
    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, String address, String phone, String email, String office, String salary, String date_hired, String title, double hourlyRate, int hoursWorked) {
        super(name, address, phone, email, office, salary, date_hired, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateEarnings(int hours) {
        return hourlyRate * hoursWorked;
    }


    @Override
    public String toString() {
        return "PartTime" + getName();
    }
}
