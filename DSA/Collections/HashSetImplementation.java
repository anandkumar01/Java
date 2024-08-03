package DSA.Collections;

import java.util.HashSet;

public class HashSetImplementation {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");
        set.add("C++");
        
        // Trying to add duplicate elements
        set.add("Java");
        set.add("Python");

        // Displaying the HashSet
        System.out.println("HashSet: " + set);
        
        // Checking the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());
        
        // Checking if an element exists
        boolean temp = set.contains("JavaScript");
        System.out.println("HashSet contains JavaScript: " + temp);

        // Removing an element
        set.remove("C++");
        System.out.println("After removing C++: " + set);

        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing the HashSet: " + set);
    }
}
