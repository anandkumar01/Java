// Statement: Cyclic sort algorithm of an array containing elements in range [1, n]

package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static int[] cyclicSort(int[] arr, int size) {
        int i = 0;
        while (i < size) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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
        int[] result = cyclicSort(arr, size);
        System.out.print("The sorted array is: " + Arrays.toString(result));
        sc.close();
    }
}