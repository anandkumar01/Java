package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        // swap arr[i+1] and arr[high]
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
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
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The unsorted array is: " + Arrays.toString(arr));
        quickSort(arr, 0, size - 1);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
        sc.close();
    }
}