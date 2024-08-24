// Statement: Write a program to count the number of 1s in a given number

package DSA.BitwiseOperator;

import java.util.Scanner;

public class CountOneBits {
    public static int countOneBitsInNumber(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // Check if LSB is 1
            n >>= 1; // Shift right
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int result = countOneBitsInNumber(n);
        System.out.println("Number of one bits in " + n + " is " + result);
        sc.close();
    }
}
