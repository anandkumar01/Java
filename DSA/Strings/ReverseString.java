package DSA.Strings;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        String result = reverseString(str);
        System.out.println("Reversed string: " + result);
        sc.close();
    }
}