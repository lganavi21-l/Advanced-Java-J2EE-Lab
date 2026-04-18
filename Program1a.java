 package programs;

import java.util.*;

public class Program1a {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("1. Adding elements:");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\n2. Adding element at specific index:");
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\n3. Adding multiple elements:");
        arrayList.addAll(Arrays.asList("Grapes", "Pineapple"));
        linkedList.addAll(Arrays.asList("Grapes", "Pineapple"));

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\n4. Accessing elements:");
        System.out.println(arrayList.get(2));
        System.out.println(linkedList.get(2));

        System.out.println("\n5. Updating elements:");
        arrayList.set(1, "Kiwi");
        linkedList.set(1, "Kiwi");

        System.out.println("\n6. Removing elements:");
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        System.out.println("\n7. Searching elements:");
        System.out.println(arrayList.contains("Apple"));
        System.out.println(linkedList.contains("Apple"));

        System.out.println("\n8. List size:");
        System.out.println(arrayList.size());
        System.out.println(linkedList.size());

        System.out.println("\n9. Iterating over list:");
        for(String s : arrayList)
            System.out.println(s);

        for(String s : linkedList)
            System.out.println(s);

        System.out.println("\n10. Using Iterator:");
        Iterator<String> it1 = arrayList.iterator();
        while(it1.hasNext())
            System.out.println(it1.next());

        Iterator<String> it2 = linkedList.iterator();
        while(it2.hasNext())
            System.out.println(it2.next());

        System.out.println("\n11. Sorting:");
        Collections.sort(arrayList);
        Collections.sort(linkedList);

        System.out.println("\n12. Sublist:");
        System.out.println(arrayList.subList(0,2));
        System.out.println(linkedList.subList(0,2));

        System.out.println("\n13. Clearing the list:");
        arrayList.clear();
        linkedList.clear();

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}