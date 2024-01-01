// Write a program to check whether a given number is Palindrome or not.

package DSA.BasicProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int k = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
        }
        if(k == rev){
            System.out.println("Given number is Palindrome.");
        } else {
            System.out.println("Given number is not Palindrome.");
        }
        sc.close();
    }
}
