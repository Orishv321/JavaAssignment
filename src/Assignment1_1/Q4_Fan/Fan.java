package Assignment1_1.Q4_Fan;


public class Fan {

    //constant Fan Speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String fanSpeed = new String();
        if (speed == SLOW) {
            fanSpeed = "Slow";
        } else if (speed == MEDIUM) {
            fanSpeed = "Medium";
        } else if (speed == FAST) {
            fanSpeed = "Fast";
        }
        return on ? "Fan is on.\nThe Speed is: " + fanSpeed + "\nTHe Color is: " + color : "Fan is off";

    }


}
