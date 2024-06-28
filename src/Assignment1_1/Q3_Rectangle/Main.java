package Assignment1_1.Q3_Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 50 , "yellow");
        Rectangle r2= new Rectangle(4, 40 , "yellow");

        System.out.println("Rectangle One with Width : 5 Height: 50");
        System.out.println("The Color is " + r1.getColor());
        System.out.println("The Width is " + r1.getWidth());
        System.out.println("the Height is " + r1.getHeight());
        System.out.println("The Area of the Rectangle is: " + r1.getArea());
        System.out.println("The Perimeter of the Rectangle is: " + r1.getPerimeter());
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("Rectangle Two with Width : 40 Height: 50");
        System.out.println("The Color is " + r2.getColor());
        System.out.println("The Width is " + r2.getWidth());
        System.out.println("the Height is " + r2.getHeight());
        System.out.println("The Area of the Rectangle is: " + r2.getArea());
        System.out.println("The Perimeter of the Rectangle is: " + r2.getPerimeter());

    }
}
