 package programs;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Colors in the ArrayList: " + colors);

        if(colors.contains("Red")) {
            System.out.println("Red is available in the ArrayList");
        } else {
            System.out.println("Red is not available in the ArrayList");
        }
    }
}