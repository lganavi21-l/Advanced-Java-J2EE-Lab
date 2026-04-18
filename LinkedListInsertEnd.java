 package programs;

import java.util.LinkedList;

public class LinkedListInsertEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Original LinkedList: " + list);

        list.offerLast("Pink");

        System.out.println("After inserting element at the end: " + list);
    }
}