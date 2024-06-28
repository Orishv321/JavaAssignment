package Assignment1_2.Q4_GeometricObject;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);

        System.out.println("Larger circle:");
        GeometricObject largerCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Radius: " + ((Circle) largerCircle).getRadius());

        ComparableCylinder cylinder1 = new ComparableCylinder(5, 10);
        ComparableCylinder cylinder2 = new ComparableCylinder(8, 11);

        System.out.println("Larger cylinder:");
        GeometricObject largerCylinder = GeometricObject.max(cylinder1, cylinder2);
        System.out.println("Volume: " + ((ComparableCylinder) largerCylinder).getVolume());

        Square square = new Square(4);
        System.out.println("Square side: " + square.getSide());
        square.howToColor();
    }
}
