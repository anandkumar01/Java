// Write a program to print Nth fibonacci number.

package DSA.BasicProgram;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int k=n;
        int a=1, b=1;
        int i=2;
        while(i<k){
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println("The "+n+"th Fibonacci Number is : " +b);
        sc.close();
    }
}
