package Assignment1_1.Q6_Time;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long currentTime = System.currentTimeMillis();
        Date currentDate = new Date(currentTime);

        this.hour = currentDate.getHours();
        this.minute = currentDate.getMinutes();
        this.second = currentDate.getSeconds();

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("Current Time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
