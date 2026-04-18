 package programs;

import java.util.ArrayList;

public class ArrayListDeleteNth {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original ArrayList: " + colors);

        int n = 2; 

        if(n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After deleting element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}