import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static int[] maxHeapSort(int[] arr, int size) {
        // build max heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
        for (int i = size - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }

    public static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < size && arr[largest] < arr[left]) {
            largest = left;
        }
        // If right child is larger
        if (right < size && arr[largest] < arr[right]) {
            largest = right;
        }
        // if larger is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // recursively heapify the affacted part
            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The unsorted array is: " + Arrays.toString(arr));
            maxHeapSort(arr, size);
            System.out.println("The sorted array is: " + Arrays.toString(arr));
        }
    }
}