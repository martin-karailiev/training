package Homework_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        for (int k = 0, j = list.size() - 1; k < j; k++)
        {
            list.add(k, list.remove(j));
        }

        System.out.println(list);
    }

}

