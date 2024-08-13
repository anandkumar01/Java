package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr, int size) {
        boolean swapped;
        for (int i = 0; i < size; i++) {
            // swapped is to check if any swapping is performed in one pass.
            swapped = false;
            for (int j = 1; j < size - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            // No swapping means array is already sorted
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The unsorted array is: " + Arrays.toString(arr));
        int result[] = bubbleSort(arr, size);
        System.out.print("The sorted array is: " + Arrays.toString(result));
        sc.close();
    }
}