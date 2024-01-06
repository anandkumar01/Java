package DSA.SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {
     public static int linearSearch(int[] arr, int size, int target) {
        if (size == 0) {
            return -1;
        }
        for (int index = 0; index < size; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int target = sc.nextInt();

        int result = linearSearch(arr, size, target);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index: " + result);
        }
        sc.close();
    }
}