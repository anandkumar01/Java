// Write a program to check whether a given number is Armstrong number or not.

package DSA.BasicProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int n = num, sum = 0, digCount = 0;
        while (n != 0) {
            n /= 10;
            digCount++;
        }

        n = num;
        while (n != 0) {
            int temp = n % 10;
            sum += Math.pow(temp, digCount);
            n /= 10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println(num + " is not an armstrong number");
        }
        sc.close();
    }
}