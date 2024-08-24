package DSA.BitwiseOperator;

import java.util.Scanner;

public class MultiplyDivide {

    public static int multiplication(int n) {

        return n << 1;
    }

    public static int division(int n) {

        return n >> 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiplication of number is: " + multiplication(n));
        System.out.println("Division of number is: " + division(n));
        sc.close();
    }
}
