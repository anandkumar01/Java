package DSA.Collections;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static StringBuilder removeDuplicateCharacters(StringBuilder str) {
        StringBuilder res = new StringBuilder();
        HashSet<Character> unique = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!unique.contains(ch)) {
                unique.add(ch);
                res.append(ch);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        StringBuilder result = removeDuplicateCharacters(str);
        System.out.println("String with unique characters: " + result);
        sc.close();
    }
}
