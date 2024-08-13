package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int last_index = size - i - 1;
            int max_index = getMaxIndex(arr, 0, last_index);
            swap(arr, max_index, last_index);
        }
        return arr;
    }

    // Method to find the index of maximum element
    public static int getMaxIndex(int[] arr, int start, int end) {
        int max_index = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max_index]) {
                max_index = i;
            }
        }
        return max_index;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The unsorted array is: " + Arrays.toString(arr));
        int result[] = selectionSort(arr, size);
        System.out.print("The sorted array is: " + Arrays.toString(result));
        sc.close();
    }
}