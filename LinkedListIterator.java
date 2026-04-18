 package programs;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        ListIterator<String> iterator = list.listIterator(1);

        System.out.println("Iterating from 2nd position:");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}