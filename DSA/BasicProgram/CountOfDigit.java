// Problem : Write a program to count occurence of a digit in the given number.

package DSA.BasicProgram;

import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int number = num;
            System.out.println("Enter a digit: ");
            int digit = sc.nextInt();
            
            int count=0;
            while(num!=0){
                int rem = num%10;
                if(rem==digit){
                    count+=1;
                }
                num/=10;
            }
            System.out.println("Occurence of "+digit+" in "+number+" is: " + count);
        }
    }
}