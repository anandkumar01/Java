package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {

    public static int[] shellSort(int[] arr, int size){
        // Start with large gap and reduce it in each iteration
        for(int gap=size/2; gap>0; gap/=2){

            // Do insertion sort for the elements at gap intervals
            for(int i=gap; i<size; i++){
                int temp = arr[i];
                int j;

                // Shift elements that are greater than temp to the right
                // untill correct locatio for arr[i] is found
                for(j = i; j >= gap && arr[j - gap] > temp; j -= gap){
                    arr[j] = arr[j-gap];
                }
                // Place temp at its correct position
                arr[j] = temp;
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("The unsorted array is: " + Arrays.toString(arr));
            int result[] = shellSort(arr, size);
            System.out.println("The sorted array is: " + Arrays.toString(result));

        }
    }
}
