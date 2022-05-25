import java.util.Scanner;
class Area
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float b = sc.nextInt();
        System.out.print("Enter the hight: ");
        float h = sc.nextInt();
        double area = (b * h) / 2;
        System.out.println("Area of Triangle is: "+area);
    }}