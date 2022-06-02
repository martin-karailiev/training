package Homework_6;

import java.util.Scanner;

public class Count {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();

        System.out.print("Number of words in the string: " + countWords(str)+"\n");
    }

    public static int countWords(String str)
    {
        int count = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;

        return count;
    }
}
