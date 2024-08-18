package DSA.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestUniqueCharacters {

    public static String longestUniqueCharacter(String str) {
        if (str == null || str == "") {
            return "";
        }
        int start = 0, maxLen = 0, maxStart = 0;
        Set<Character> unique = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
            char curr_char = str.charAt(end);

            // Remove duplicate character
            while (unique.contains(curr_char)) {
                unique.remove(str.charAt(start));
                start++;
            }
            unique.add(curr_char);

            // Update maxLength and maxStart if longer unique substring found
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }
        return str.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = longestUniqueCharacter(str);
        if (result.equals("")) {
            System.out.println("No unique characters found");
        } else {
            System.out.println("Longest unique characters: " + result);
        }
        sc.close();
    }
}
