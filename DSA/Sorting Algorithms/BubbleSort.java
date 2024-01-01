package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            boolean flag = true; // Flag is to check if any swapping has been performed or not in one pass.
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
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
        }
    }
}