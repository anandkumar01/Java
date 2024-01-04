// Statement: Write a program to rotate the array to the right by k steps.
// example:     arr = [1, 2, 3, 4, 5, 6, 7],  k=3

package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotationArray {
    public static void rotateArray(int[] arr, int n, int k){
        // if k is greater than size of array.
        k = k % n;
        // this will reverse the last k elements in array.
        reverseArray(arr, n-k, n-1);                // [1, 2, 3, 4, "7, 6, 5"]
        // this will reverse the starting n-k elements in array.
        reverseArray(arr, 0, n-k-1);          // ["4, 3, 2, 1", 7, 6, 5]
        // this will reverse all the elements in array.
        reverseArray(arr, 0, n-1);            // [5, 6, 7, 1, 2, 3, 4]
    }

    public static void reverseArray(int[] arr, int start, int end){
        int index1=start, index2=end;
        while (index1<index2) {
            swap(arr, index1, index2);
            index1++;
            index2--;
        }
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of rotations: ");
        int k = sc.nextInt();

        rotateArray(arr, n, k);
        System.out.println("Rotated array is: " + Arrays.toString(arr));
        sc.close();
    }
}