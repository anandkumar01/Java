// Statement: Given an integer array, find the largest sum of a subarray.

package DSA.Arrays;

import java.util.Scanner;

public class MaximumSubarray {
    public static int maximumSubarray(int[] arr, int n){
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            curSum += arr[i];
            if(curSum>maxSum){
                maxSum = curSum;
            }
            if(curSum<0){
                curSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int result = maximumSubarray(arr, n);
        System.out.println("Maximum subarray sum is: " + result);
        sc.close();
    }
}