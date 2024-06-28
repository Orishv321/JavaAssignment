package Assignemnt1_2.Q4_GeometricObject;

public class Square  extends GeometricObject implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    public double getSide() {
        return side;
    }
}