package Homework_5;

import java.util.Collections;
import java.util.LinkedList;

public class ReversLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("London");
        list.add("Rom");
        list.add("Sofia");
        System.out.println("List before reverse:" +list);
        Collections.reverse(list);
        System.out.println("List after reverse:" +list);
    }
}
