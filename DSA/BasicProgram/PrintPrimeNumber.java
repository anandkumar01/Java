// Statement: Write a program to print all prime numbers between two range.

package DSA.BasicProgram;

import java.util.Scanner;

public class PrintPrimeNumber {
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int c = 2; c * c <= n; c++) {
            if (n % c == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumber(int start, int end) {
        System.out.println("Prime numbers are: ");
        for (int num = start; num < end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower number: ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper number: ");
        int upper = sc.nextInt();
        printPrimeNumber(lower, upper);
        sc.close();
    }
}