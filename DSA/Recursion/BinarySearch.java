package DSA.Recursion;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // base case when target element is not found
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid; // return the index of the middle element
        } else if (arr[mid] < target) {
            // search the target element in right half
            return binarySearch(arr, target, mid + 1, end);
        } else {
            // search the target element in left half
            return binarySearch(arr, target, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to search: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target, 0, size - 1);
        if (result == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element is present at index: " + result);
        }
        sc.close();
    }
}
