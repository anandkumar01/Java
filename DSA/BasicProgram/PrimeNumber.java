// Statement: Write a program to check whether a given number is prime or not.

package DSA.BasicProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for(int c=2; c*c <= n; c++) {
            if (n % c == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        if (result) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
        sc.close();
    }
}