package DSA.Arrays;

import java.util.Arrays;

public class ColorsSorting {
    public static void sortColors(int[] arr, int size) {
        int i = 0, j = size - 1;
        int k = 0;
        while (k <= j) {
            if (arr[k] == 2) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;
            } else if (arr[k] == 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
                k++;
            } else {
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 1, 2, 0, 0, 1, 2, 0 };
        int size = arr.length;
        sortColors(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
