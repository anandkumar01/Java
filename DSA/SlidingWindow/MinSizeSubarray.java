// Statement: Given an integer array, find the the minimal length of a subarray 
//            whose sum is greater than or equal to target.

package DSA.SlidingWindow;

import java.util.Scanner;

public class MinSizeSubarray {
    public static int maximumSum(int[] arr, int n, int k) {
        int w_sum = 0;
        int w_start = 0;
        int min_len = n + 1;
        for (int w_end = 0; w_end < n; w_end++) {
            w_sum += arr[w_end];    // add current element in window

            // check if the sum exceeds or equals the target
            while (w_sum >= k) {
                w_sum -= arr[w_start];      // if exceeds then subtract the leftlost from window
                min_len = Math.min(min_len, w_end - w_start + 1);   // update the minimum length of window
                w_start++;
            }
        }
        if (min_len <= n) {
            return min_len;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();

        int result = maximumSum(arr, size, target);
        System.out.println("The minimum length of subarray is: " + result);
        sc.close();
    }
}
