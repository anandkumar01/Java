import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter elements of the array: ");
            for(int i=0; i<size; i++){
                array[i] = sc.nextInt();
            }
            if(sc.hasNextInt()) {
                System.out.println("Enter element you want to search: ");
                int searchElement = sc.nextInt();
                for(int n : array) {
                    if (n == searchElement) {
                        System.out.println("Element is present in the array");
                        return;
                    }
                }
                System.out.println("Element is not present in the array");
            } else {
                System.out.println("Invalid input! Please enter an integer");
            }
            sc.close();
        }
    }
}