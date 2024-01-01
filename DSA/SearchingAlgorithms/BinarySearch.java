package DSA.SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void  main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter elements of the array: ");
            for(int i=0; i<size; i++){
                array[i] = sc.nextInt();
            }
            if(sc.hasNextInt()){
                System.out.println("Enter element you want to search: ");
                int searchElement = sc.nextInt();

                int low = 0, high = size-1;
                while(low<=high){
                    int mid = (low+high)/2;
                    if(searchElement == array[mid]){
                        System.out.println("Element found at index "+mid+".");
                        return;
                    } else if(searchElement < array[mid]){
                        high = mid - 1;
                    } else{
                        low = mid + 1;
                    }
                }
                System.out.println("Element is not present in the array");
            } else {
                System.out.println("Invalid input! Please enter an integer");
            }
        }
    }
}
