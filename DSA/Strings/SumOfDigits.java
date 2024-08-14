// Statement: Write a program to print sum of digits in the string.

package DSA.Strings;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum += digit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int result = sumOfDigits(str);
        System.out.println("Sum of digits in the string is: " + result);
        sc.close();
    }
}
