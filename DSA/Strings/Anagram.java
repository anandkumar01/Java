package DSA.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : str1.toLowerCase().toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toLowerCase().toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        boolean result = isAnagram(str1, str2);
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
        sc.close();
    }
}
