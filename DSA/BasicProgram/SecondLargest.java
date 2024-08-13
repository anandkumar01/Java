// Statement: Write a program to find the second largest element in the array.

package DSA.BasicProgram;

import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int[] arr, int size) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (size < 2) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            // If current element is greater than largest then update both
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // If current element is in between largest and secondLargest
            // then update secondLargest
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int second_largest = secondLargest(arr, size);

        if (second_largest == -1) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is: " + second_largest);
        }
        sc.close();
    }
}
