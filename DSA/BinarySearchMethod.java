package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMethod {
    public static int binarySearch(int[] arr, int low, int high, int searchElement) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchElement) {
                return mid;
            } else if (arr[mid] > searchElement) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in array:");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter elements of array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (sc.hasNextInt()) {
                System.out.println("Enter element you want to search: ");
                int searchElement = sc.nextInt();
                int result = binarySearch(arr, 0, size - 1, searchElement);
                if (result == -1) {
                    System.out.println("Element is not present in the array.");
                } else {
                    System.out.println("Element is present at index: " + result);
                }
            } else {
                System.out.println("Invalid input! Please enter an integer value.");
            }
        }
    }
}
