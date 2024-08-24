// Statement: Given an integer n, return true if it is a power of three.

package DSA.BitwiseOperator;

import java.util.Scanner;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPowerOfThree(n);
        System.out.println(n + " is power of three: " + result);
        sc.close();
    }
}
