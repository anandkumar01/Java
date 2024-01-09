// Statement: Given an array of integer, return the subarray with maximum sum.

package DSA.SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumSubarray {
    public static int[] maxSumSubarray(int[] arr, int n) {
        int start = 0, end = 0;
        int w_start = 0;
        int curSum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int w_end = 0; w_end < n; w_end++) {
            curSum += arr[w_end];       // Add current element in window

            // Check if the current sum is greater than the maximum sum
            if (curSum > max_sum) {
                max_sum = curSum;       // update the maximum sum
                start = w_start;        // update the indices
                end = w_end;
            }

            // If current sum is negative
            if (curSum < 0) {
                curSum = 0;         // reset the current sum
                w_start = w_end + 1;    // move w_start to next element where curSum becomes 0.
            }
        }
        int[] subarray = new int[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            subarray[index++] = arr[i];
        }
        
        return subarray;
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

        int[] result = maxSumSubarray(arr, size);
        System.out.println("The subarray with maximum sum is: " + Arrays.toString(result));
        sc.close();
    }
}
