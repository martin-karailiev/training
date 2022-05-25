package Homework_4;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        String vacationType;
        Scanner scanner = new Scanner(System.in);
        int budget = 0;

        System.out.println("Enter vacation type:");
        vacationType = scanner.nextLine();


        if (vacationType.equalsIgnoreCase("Beach") || vacationType.equalsIgnoreCase("Mountain")) {

        } else {
            System.out.println("There is no information about this type of vacation.");
            System.exit(0);
        }

        System.out.println("Enter budget per day:");
        budget = Integer.parseInt(scanner.nextLine());

        switch (vacationType) {
            case ("Beach"):
                if (budget < 50)
                {System.out.println("You should choose Bulgaria as vacation destination!");
                break;}
            case ("Mountain"):
                if (budget < 30)
                {System.out.println("You should choose Bulgaria as vacation destination!");
                    break;}
            default:
                System.out.println("You should go on vacation outside of Bulgaria");

    }}}














