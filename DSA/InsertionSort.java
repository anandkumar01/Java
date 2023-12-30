package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] arr, int size){
        for(int i=1; i<size; i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("The unsorted arry is: " + Arrays.toString(arr));
            int result[] = insertionSort(arr, size);
            System.out.println("The sorted array is: " + Arrays.toString(result));
        }
    }
}
