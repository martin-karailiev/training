package Homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Long.sum;
import static java.util.Collections.list;

public class ArrSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200));
        int sum = 0;
        int i = 0;
        for (i = 0; i < list.size(); i++)
            sum += list.get(i);
        System.out.println("Sum of given array is "
                + sum);

    }
}
