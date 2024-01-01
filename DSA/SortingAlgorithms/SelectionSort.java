package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
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
        }
    }
}