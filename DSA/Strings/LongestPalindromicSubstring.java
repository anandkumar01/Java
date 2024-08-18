package DSA.Strings;

import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String str) {
        if (str == null || str == "") {
            return "";
        }
        String res = "";

        for (int i = 0; i < str.length(); i++) {

            // Check for the longest odd length palindrome centered at index i
            String oddPalindrome = checkPalindrome(str, i, i);

            // Check for the longest even length palindrome centered between index i and i+1
            String evenPalindrome = checkPalindrome(str, i, i + 1);

            // Update the result if the palindrome is longer than the current result
            if (oddPalindrome.length() > res.length()) {
                res = oddPalindrome;
            }
            if (evenPalindrome.length() > res.length()) {
                res = evenPalindrome;
            }
        }
        return res;
    }

    // Helper method to find longest palindrome around the center
    private static String checkPalindrome(String str, int left, int right) {

        // Expand as long as the characters on both sides are equal
        while (0 <= left && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = longestPalindrome(str);
        if (result.equals("")) {
            System.out.println("No palindromic substring found");
        } else {
            System.out.println("Longest palindromic substring: " + result);
        }
        sc.close();
    }
}
