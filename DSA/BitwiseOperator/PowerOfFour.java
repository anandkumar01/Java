// Statement: Given an integer n, return true if it is a power of four.

package DSA.BitwiseOperator;

import java.util.Scanner;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        return ((n & (n - 1)) == 0) & (n % 3 == 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPowerOfFour(n);
        System.out.println(n + " is power of four: " + result);
        sc.close();
    }
}
