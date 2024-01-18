// Statement: Given the sorted rotated array that may contain duplicate elements, 
//            return the minimum element of this array.

package DSA.SearchingAlgorithms.BinarySearchProblems;

import java.util.Scanner;

public class MinimumNumRotatedArray {
    
    public static int findMin(int[] arr, int size) {
        int start = 0, end = arr.length - 1;
        if (arr[start] < arr[end]) {
            // sorted array is not rotated
            return arr[start];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                // mid element is larger than the last element
                // means search in the right half
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                // means search in the left half
                end = mid;
            } else {
                end--;
            }
        }
        // at last the end will be the index of the minimum element
        return arr[end];
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
        int result = findMin(arr, size);
        System.out.print("Minimum element in rotated sorted array is: " + result);
        sc.close();
    }
}
