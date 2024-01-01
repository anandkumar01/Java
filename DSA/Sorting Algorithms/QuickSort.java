import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivote = arr[high];
        int i = (low - 1);
        for(int j=low; j<=high-1; j++){
            if(arr[j] <= pivote) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i] and arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The unsorted array is: " + Arrays.toString(arr));
            quickSort(arr, 0, size-1);
            System.out.println("The sorted array is: " + Arrays.toString(arr));
        }
    }
}