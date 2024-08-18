package DSA.Strings;

public class Main {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            String palindrome1 = checkPalindrome(s, i, i);
            String palindrome2 = checkPalindrome(s, i, i + 1);

            System.out.println("Center at " + i + ":");
            System.out.println("Odd-Length Palindrome: " + palindrome1);
            System.out.println("Even-Length Palindrome: " + palindrome2);

            if (palindrome1.length() > res.length()) {
                res = palindrome1;
            }
            if (palindrome2.length() > res.length()) {
                res = palindrome2;
            }

            System.out.println("Current Longest Palindrome: " + res);
            System.out.println("-----------------------------------");
        }
        return res;
    }

    private static String checkPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String s = "kpbbbbahabk";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }
}
