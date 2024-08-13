package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    // Recursive function to perform merge sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;

        // Create left and right subarrays
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr.length - mid];

        // Copy the first half of the array into the left subarray
        for (int i = 0; i < mid; i++) {
            leftArray[i] = arr[i];
        }
        // Copy the second half of the array into the right subarray
        for (int i = mid; i < arr.length; i++) {
            rightArray[i - mid] = arr[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted subarrays back into the original array
        merge(arr, leftArray, rightArray);
        return arr;
    }

    public static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right subarrays
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        // Copy any remaining elements from the left subarray (if any)
        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }
        // Copy any remaining elements from the right subarray (if any)
        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The unsorted array is: " + Arrays.toString(arr));
        int result[] = mergeSort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(result));
        sc.close();
    }
}