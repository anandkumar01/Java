// Statement: Write a program to print sum of numbers in the string.

package DSA.Strings;

import java.util.Scanner;

public class SumOfNumber {

    public static int sumOfNumbers(String str) {
        int sum = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = ""; // Set empty string after number is found
                }
            }
        }

        // Add any remaining number in the last
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int result = sumOfNumbers(str);
        System.out.println("Sum of numbers in the string is: " + result);
        sc.close();
    }
}
