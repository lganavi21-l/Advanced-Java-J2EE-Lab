 package programs;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwap {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        Collections.swap(list, 0, 2);

        System.out.println("After swapping first and third elements: " + list);
    }
}