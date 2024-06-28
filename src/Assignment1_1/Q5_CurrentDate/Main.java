package Assignment1_1.Q5_CurrentDate;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // Create a GregorianCalendar object with the current date
        GregorianCalendar calendar = new GregorianCalendar();

        // Obtain current year, month, and day
        int year = calendar.get(GregorianCalendar.YEAR);
        // Note: MONTH field in GregorianCalendar is zero-based (0 = January)
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Adding 1 to adjust to 1-based month
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        // Display current year, month, and day
        System.out.println("Current Date:" + year + "-" + month + "-" + day);
    }
}
