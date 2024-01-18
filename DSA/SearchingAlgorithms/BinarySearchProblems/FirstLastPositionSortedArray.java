// Statement: Given an array of integers which is sorted in non-decreasing order, 
//            find the starting and ending position of a given target value.

package DSA.SearchingAlgorithms.BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastPositionSortedArray {
    public static int[] searchRange(int[] arr, int size, int target) {
        int[] ans = { -1, -1 };
        // searching for start index
        int start = search(arr, size, target, true);
        // searching for end index
        int end = search(arr, size, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] arr, int size, int target, boolean isStartIndex) {
        int start = 0, end = size - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                if (isStartIndex) {
                    // if start index is found then there might be other
                    // potential ans that may lie in the left side
                    end = mid - 1;
                } else {
                    // if end index is found then there might be other
                    // potential ans that may lie in the right side
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
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
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int result[] = searchRange(arr, size, target);
        System.out.println("The starting index and ending index is: " + Arrays.toString(result));
        sc.close();
    }
}