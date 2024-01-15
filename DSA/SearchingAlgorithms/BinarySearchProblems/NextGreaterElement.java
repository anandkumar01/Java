// Statement: Given a sorted array. Find the index of element
//            that is next greater or equal to the target element.
//  arr = [8, 13, 14, 19, 32, 45, 48, 60, 73]   target = 38
//  output : 5

package DSA.SearchingAlgorithms.BinarySearchProblems;

import java.util.Scanner;

public class NextGreaterElement {
    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
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
        return start; // if while loop condition violates means answer is next start.
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
        System.out.println("Next greater or equal element in the array is: " + result);
        sc.close();
    }
}
