// Statement: Given an array of integers containing n+1 integers
//            where each integer is in the range [1, n] inclusive. Find out repeated number.

package DSA.Arrays;

import java.util.Scanner;

public class DuplicateNumber {

    public static int duplicateNumber(int[] arr, int size) {
        // using cyclic sort algorithm
        int i = 0;
        while (i < size) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
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
        int result = duplicateNumber(arr, size);
        System.out.print("The duplicate number in array is: " + result);
        sc.close();
    }
}