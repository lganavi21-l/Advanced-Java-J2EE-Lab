 package programs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        Iterator<String> it = list.descendingIterator();

        System.out.println("LinkedList in reverse order:");

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}