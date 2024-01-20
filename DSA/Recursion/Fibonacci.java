package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("The " + n + "th number in Fibonacci series is: " + result);
        sc.close();
    }
}
