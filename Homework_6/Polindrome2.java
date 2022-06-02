package Homework_6;

import java.util.Scanner;


public class Polindrome2 {
    public static boolean isNonNegative(int num) {

        if (num >= 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        if (isNonNegative(Integer.parseInt(str)) == true) {
        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");


}
else {System.out.println("The integer is negative");
}}}
