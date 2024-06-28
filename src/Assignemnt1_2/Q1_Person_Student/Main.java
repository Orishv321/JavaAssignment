package Assignemnt1_2.Q1_Person_Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Raman Saha", "123 Main St", "555-1234", "raman.Saha@example.com", Student.Status.SENIOR);
        Faculty faculty = new Faculty("Ram Sagar", "456 Oak Ave", "555-5678", "ram.sagar@example.com",
                "F345", "75000",  "2020/815", "9am-5pm", "Professor");
        FullTime fullTimeStaff = new FullTime("Man hari", "789 Elm Blvd", "555-9876", "man.hari@example.com",
                "S101", "60000",  "2019/310", "Manager");
        PartTime partTimeStaff = new PartTime("Sita Sarma", "321 Pine Rd", "555-4321", "sita.sarma@example.com",
                "N205", "25.0", "2021/6/20", "Assistant",15,7 );

        // Display information using toString methods
        System.out.println(student);
        System.out.println("Status: " + student.getStatus());
        System.out.println();

        System.out.println(faculty);
        System.out.println("Office Hours: " + faculty.getOffice_hours());
        System.out.println("Rank: " + faculty.getRank());
        System.out.println();

        System.out.println(fullTimeStaff);
        System.out.println();

        System.out.println(partTimeStaff);
        partTimeStaff.calculateEarnings(20); // Record hours worked
        System.out.println("Earnings: $" + partTimeStaff.calculateEarnings(20));
    }
}
