import java.util.Scanner;
class Perimeter
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextInt();
        System.out.print("Enter side b: ");
        double b = sc.nextInt();
        System.out.print("Enter side c: ");
        double c = sc.nextInt();
        double per = a+b+c;
        System.out.println("Area of Triangle is: "+per);
    }}