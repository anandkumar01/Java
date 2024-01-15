package DSA.SearchingAlgorithms;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        boolean isAsc = arr[low] <= arr[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {            // if array is sorted in ascending order
                if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {                // if array is sorted in descending order
                if (arr[mid] < target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to search: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element is present at index: " + result);
        }
        sc.close();
    }
}