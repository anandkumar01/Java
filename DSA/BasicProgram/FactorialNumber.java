// Write a program to calculate factorial of a number using recursion.
package DSA.BasicProgram;

import java.util.Scanner;

public class FactorialNumber {
    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of given number is: " + result);
        sc.close();
    }
}
