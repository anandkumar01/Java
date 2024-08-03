package DSA.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImplementation {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> list = new ArrayList<>();
        boolean empty = list.isEmpty();
        System.out.println("ArrayList is empty: " + empty);

        // Add an item in ArrayList
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("JavaScript");
        System.out.println("Initial ArrayList");
        System.out.println(list);

        // Gives the size of ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        // Get an item at perticular index
        String item = list.get(3);
        System.out.println("Item at index 3: " + item);

        System.out.println("After removing an item");
        // Remove an item of a perticular index
        list.remove(1);
        System.out.println(list);

        // Check if ArrayList is empty
        empty = list.isEmpty();
        System.out.println("ArrayList is empty: " + empty);

        // Check if ArrayList contains a specific item
        boolean temp = list.contains("JavaScript");
        System.out.println("ArrayList contains JavaScript: " + temp);

        // Sort the ArrayList in alphabetical order
        Collections.sort(list);
        System.out.println("ArrayList after sorting");
        System.out.println(list);
    }
}
