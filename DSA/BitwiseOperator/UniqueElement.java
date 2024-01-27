/*
 XOR Operator:  a^0 = a
                a^a = 0
 */

package DSA.BitwiseOperator;

import java.util.Scanner;

public class UniqueElement {
    public static int uniqueElement(int[] arr, int n) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = uniqueElement(arr, n);
        System.out.println("Unique element in the array is: " + result);
        sc.close();
    }
}
