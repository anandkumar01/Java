// Statement: Given an integer array of length n where all the integers of array are in the range [1, n] and
//            each integer appears once or twice, return an array of all the integers that appears twice.

package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDuplicateNumber {

    public static List<Integer> findDuplicates(int[] nums, int size) {
        // using cyclic sort algorithm
        int i = 0;
        while (i < size) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            if (nums[index] != index + 1) {
                res.add(nums[index]);
            }
        }
        return res;
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
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
        List<Integer> result = findDuplicates(arr, size);
        System.out.print("Duplicate numbers in array are: " + result);
        sc.close();
    }
}
