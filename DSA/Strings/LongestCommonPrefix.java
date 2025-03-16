package DSA.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] str) {
        if (str.length == 0 || str == null) {
            return "";
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {

            // Check if the current string starts with the prefix
            // If not, shorten the prefix by one character from the end
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty means no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    // Using character by charecter matching
    public static String longestCommonPrefix2(String[] str) {
        if (str.length == 0 || str == null) {
            return "";
        }
        String res = "";
        int minLen = str[0].length();
        for (String s : str) {
            minLen = Math.min(minLen, s.length());
        }
        for (int i = 0; i < minLen; i++) {
            char ch = str[0].charAt(i);
            for (String s : str) {
                if (ch != s.charAt(i)) {
                    return res;
                }
            }
            res+=(ch);
        }
        return res;
    }

    // Using sorting
    public static String longestCommonPrefix3(String[] str) {
        if (str.length == 0 || str == null) {
            return "";
        }
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int i = 0;
        int minLen = Math.min(first.length(), last.length());

        // Common prefix between the first and last
        while (i < minLen && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        // Check if there's no common prefix
        if (i == 0) {
            return "";
        }
        // Return the common prefix
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string array: ");
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.println("Enter strings: ");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }
        String result = longestCommonPrefix2(str);
        if (result.equals("")) {
            System.out.println("No common prefix");
        } else {
            System.out.println("Longest common prefix is: " + result);
        }
        sc.close();
    }
}
