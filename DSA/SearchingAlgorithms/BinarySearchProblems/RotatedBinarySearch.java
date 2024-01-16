// Statement: Given the array after the possible rotation and an integer target,
//            return the index of target if it is in array else return -1

package DSA.SearchingAlgorithms.BinarySearchProblems;

import java.util.Scanner;

public class RotatedBinarySearch {
    
    public static int rotatedBinarySearch(int[] arr, int target) {
        // Find the pivot point (the index where the array is rotated)
        int pivot = findPivot(arr);

        // If the array is not rotated, perform simple binary search
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        // If the target is at the pivot point
        if (arr[pivot] == target) {
            return pivot;
        }
        // If the target is in the left sorted sub-array
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        // If the target is in the right sorted sub-array
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    public static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // different cases to find pivot element
            // If arr[mid] > arr[mid + 1], then mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // If arr[mid] < arr[mid - 1], then mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // If arr[mid] <= arr[start], search in the left half
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                // otherwise search in the right half
                start = mid + 1;
            }
        }
        return -1;
    }
    
    // binary search function
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
        int result = rotatedBinarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element is present at index: " + result);
        }
        sc.close();
    }
}