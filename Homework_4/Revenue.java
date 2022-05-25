package Homework_4;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        double price;
        double quantity;
        double finalPrice;
        double discount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of the product:");
        price = sc.nextInt();

        System.out.println("Enter quantity of the product:");
        quantity = sc.nextInt();

        if (quantity >=100 && quantity<=120) {
            discount = (price * quantity) * 15 / 100;
            finalPrice = (price * quantity) - discount;
            System.out.println("Discount:" +discount+"$"+"(-15%)");
            System.out.println("The revenue from sale:" + finalPrice+"$");
        } else if (quantity >120) {
            discount = (price * quantity) * 20 / 100;
            finalPrice = (price * quantity) - discount;
            System.out.println("Discount:" + discount + "$"+"(-20%)");
            System.out.println("The revenue from sale:" + finalPrice + "$");
        } else if (quantity <100) {
            discount = 0;
            finalPrice = (price * quantity);
            System.out.println("Discount:" + discount + "$"+"(no discount)");
            System.out.println("The revenue from sale:" + finalPrice + "$");
        }
        {

        }

    }
}
