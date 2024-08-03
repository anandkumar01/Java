package DSA.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("Java", 10);
        map.put("Python", 20);
        map.put("C++", 30);
        map.put("JavaScript", 40);

        // Adding a null key and null value
        map.put(null, 50);
        map.put("Ruby", null);

        // Displaying the HashMap
        System.out.println("HashMap: " + map);

        // Checking the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // Checking if a key exists
        boolean flagKey = map.containsKey("Python");
        System.out.println("HashMap contains Python: " + flagKey);

        // Checking if a value exists
        boolean flagValue = map.containsValue(30);
        System.out.println("HashMap contains value 30: " + flagValue);

        // Retrieving a value by key
        int value = map.get("C++");
        System.out.println("Value for key 'C++': " + value);

        // Removing an element by key
        map.remove("JavaScript");
        System.out.println("After removing 'JavaScript': " + map);

        // Iterating over keys
        System.out.print("Keys: ");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // Iterating over values
        System.out.print("Values: ");
        for (Integer val : map.values()) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Iterating over key-value pairs
        System.out.print("Key-Value pairs: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();

        // Clearing the HashMap
        map.clear();
        System.out.println("After clearing the HashMap: " + map);
    }
}
