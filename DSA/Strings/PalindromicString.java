// Statement: Write a program to check whether a give string is palindromic string.

package DSA.Strings;

import java.util.Scanner;

public class PalindromicString {

    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        boolean result = isPalindrome(str);
        if (result) {
            System.out.println("Given string is a palindromic string");
        } else {
            System.out.println("Given string is not a palindromic string");
        }
        sc.close();
    }
}
