package Homework_5;

import java.util.Scanner;

public class Print2DFromInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of Rows");
        int row=sc.nextInt();
        System.out.println(" Enter number of col");
        int col=sc.nextInt();
        int arr[][]=new int [row][col];
        System.out.println(" Enter Elements of Array");
        for ( row = 0; row < arr.length; row++) {
            for ( col = 0; col < arr[row].length; col++) {

                arr[row][col]=sc.nextInt();
            }
        }
        for ( row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");

            }
            System.out.println();
        }

    }
}
