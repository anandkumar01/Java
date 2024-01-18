// Statement: Given the sorted rotated array of unique elements, 
//            return the minimum element of this array.

package DSA.SearchingAlgorithms.BinarySearchProblems;

import java.util.Scanner;

public class MinNumRotatedArray {

    public static int findMin(int[] arr, int size) {
        int start = 0, end = size - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                // return mid;
                return arr[mid + 1];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                // return mid - 1;
                return arr[mid];
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[0]; // if array is already sorted
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