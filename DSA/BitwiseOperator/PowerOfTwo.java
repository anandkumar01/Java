// Statement: Given an integer n, return true if it is a power of two.

package DSA.BitwiseOperator;

import java.util.Scanner;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPowerOfTwo(n);
        System.out.println(n + " is power of two: " + result);
        sc.close();
    }
}
