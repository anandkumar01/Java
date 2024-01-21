// Write a program to calculate factorial of a number using recursion.
package DSA.BasicProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {
/*  
    // This method calculates factorial for small numbers
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }
*/

    public static BigInteger factorial(BigInteger n) {
        BigInteger fact = BigInteger.ONE;
        // Check if n is greater than zero
        while (n.compareTo(BigInteger.ZERO) > 0) {
            fact = fact.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        BigInteger num = sc.nextBigInteger();
        BigInteger result = factorial(num);
        System.out.println("Factorial of given number is: " + result);
        sc.close();
    }
}
