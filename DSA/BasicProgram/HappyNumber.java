package DSA.BasicProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappyNumber(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isHappyNumber(n);
        System.out.println(n + " is happy number: " + result);
        sc.close();
    }
}
