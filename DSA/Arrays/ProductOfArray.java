// Statement: Write a program to return the product of all integers of the array except itself.

package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {

    public static int[] productExceptSelf(int[] arr, int n) {
        int[] res = new int[n];

        int product = 1;
        for (int i = 0; i < n; i++) {
            res[i] = product;
            product *= arr[i];
        }

        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= product;
            product *= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(arr, n);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
