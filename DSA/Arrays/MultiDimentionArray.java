// Statement : How to take input of multi dimensional array and different ways to print them

package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int r = sc.nextInt();
        System.out.println("Enter the column size:");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // 1st way to print the matrix
        System.out.println(Arrays.deepToString(matrix));

        // 2nd way to print the matrix
        for(int i=0; i<r; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        // 3rd way to print the matrix using enhanced for loop
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }

        // 4th way to print the matrix using nested loop
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}