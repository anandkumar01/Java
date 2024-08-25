package DSA.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacterOccurrence {

    public static HashMap<Character, Integer> countOccurrence(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // If the character is already in the map, increment its count
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                // Add the character with count of 1
                map.put(ch, 1);
            }
        }
        return map;
    }

    // More concise approach
    public static HashMap<Character, Integer> countOccurrence2(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            // Get the current count or default to 0, then increment
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = countOccurrence2(str);
        System.out.println("Character and their frequency: ");
        for (Character key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        sc.close();
    }
}
