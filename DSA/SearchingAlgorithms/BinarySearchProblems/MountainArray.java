// Statement: Given a mountain array, return the index of peak element.

package DSA.SearchingAlgorithms.BinarySearchProblems;

import java.util.Scanner;

public class MountainArray {
    public static int peakIndexInMountainArray(int[] arr, int size) {
        int start = 0, end = size - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // If mid element is greater than next element, peak is in the left half
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } 
            else {
                // If mid element is less than or equal to next element
                // then peak will be in the right half
                start = mid + 1;
            }
        }
        // At the end start will be the index of the peak element
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = peakIndexInMountainArray(arr, size);
        System.out.println("The index of the peak element is : " + result);
        sc.close();
    }
}
