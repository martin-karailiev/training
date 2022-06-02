package Homework_6;

import java.util.*;

public class Even {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + isEven(num));

    }

    public static boolean isEven(int num){

        if (num % 2 == 0){
            return true;
        }
        return false;
    }}
