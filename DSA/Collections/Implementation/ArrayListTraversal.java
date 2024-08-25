package DSA.Collections.Implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add an item in ArrayList
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("JavaScript");
        list.add("Ruby");

        // Method 1: Using simple for loop
        System.out.println("Using simple for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("\nUsing an enhanced for loop:");
        for (String language : list) {
            System.out.println(language);
        }

        // Method 3: Using a while loop
        System.out.println("\nUsing a while loop:");
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        // Method 4: Using an iterator
        System.out.println("\nUsing an Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            System.out.println(language);
        }

        // Method 5: Using a list iterator (forward direction)
        System.out.println("\nUsing a ListIterator forward direction:");
        ListIterator<String> listIterator1 = list.listIterator();
        while (listIterator1.hasNext()) {
            String language = listIterator1.next();
            System.out.println(language);
        }

        // Method 6: Using a list iterator (backward direction)
        System.out.println("\nUsing a ListIterator backward direction:");
        ListIterator<String> listIterator2 = list.listIterator(list.size());
        while (listIterator2.hasPrevious()) {
            String language = listIterator2.previous();
            System.out.println(language);
        }

        // Method 7: Using forEach() method with a lambda expression
        System.out.println("\nUsing forEach() method with a lambda expression:");
        list.forEach(language -> System.out.println(language));

        // Method 8: Using forEachRemaining() method of the iterator
        System.out.println("\nUsing forEachRemaining() method of the iterator:");
        Iterator<String> iterator2 = list.iterator();
        iterator2.forEachRemaining(System.out::println);
    }
}
