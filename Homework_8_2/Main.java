package Homework_8_2;

import java.util.Scanner;

public class Main extends Employee{


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee ID:");
        id = Integer.parseInt(scan.next());
        System.out.println("Enter employee first name:");
        firstName = scan.next();
        System.out.println("Enter employee last name:");
        lastName = scan.next();
        System.out.println("Enter employee monthly salary:");
        salary = Double.parseDouble(scan.next());
        System.out.println("Enter employee salary raise %:");
        raise = Integer.parseInt(scan.next());

        System.out.println("Employee id is:"+ id);
        System.out.println("Employee name is:"+ getName());
        System.out.println("Employee monthly salary is:"+ salary);
        System.out.println("Employee annual salary is:"+ getAnnualSalary());
        System.out.println("Employee salary raise is:"+ raiseSalary());

    }

}
