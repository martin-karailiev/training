package Homework_8_1;



public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape

        System.out.println(s1);

        System.out.println(s1.getArea());

        System.out.println(s1.getPerimeter());

        System.out.println(s1.getColor());

        System.out.println(s1.isFilled());

        System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1; // Downcast back to Circle

        System.out.println(c1);

        System.out.println(c1.getArea());

        System.out.println(c1.getPerimeter());

        System.out.println(c1.getColor());

        System.out.println(c1.isFilled());

        System.out.println(c1.getRadius());

        Shape s2 = new Shape(); // Abstract class cannot be instanciated

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast

        System.out.println(s3);

        System.out.println(s3.getArea());

        System.out.println(s3.getPerimeter());

        System.out.println(s3.getColor());

        System.out.println(s3.getLength());
    }
}