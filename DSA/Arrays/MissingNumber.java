// Statement: Given an array containing n distinct numbers in the range [0, n],
//            return the only number in the range that is missing from the array.

package DSA.Arrays;

import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] arr, int size) {
        // using cyclic sort algorithm
        int i = 0;
        while (i < size) {
            int correct = arr[i];
            if (arr[i] < size && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < size; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return size;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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
        int result = missingNumber(arr, size);
        System.out.print("The missing number is: " + result);
        sc.close();
    }
}
