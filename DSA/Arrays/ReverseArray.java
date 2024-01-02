// Statement: Reverse the array using two pointer method

package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr, int n){
        int start = 0, end = n-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
        System.out.print("Reversed Array is : " + Arrays.toString(arr));
        sc.close();
    }
}
