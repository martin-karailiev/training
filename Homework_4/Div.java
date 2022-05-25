package Homework_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Div {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200));
        List<Integer> list5 = new ArrayList<Integer>();
        int n = list.size();
        for (int i=0; i < n; i++)
            if (i%5==0 && i<150) { list5.add(list.get(i));};
        System.out.println(list5);
    }

             }
