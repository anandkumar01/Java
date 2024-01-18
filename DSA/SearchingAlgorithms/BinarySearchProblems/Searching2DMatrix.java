// Statement: Given a matrix and a target element. Check whether the 
//            target element is present in the matrix or not.

package DSA.SearchingAlgorithms.BinarySearchProblems;

import java.util.Scanner;

public class Searching2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0, end = row * col - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int r = mid / col;
            int c = mid % col;
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = sc.nextInt();
        System.out.println("Enter the column size: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        if (searchMatrix(matrix, target)) {
            System.out.println("Element is present in the matrix");
        } else {
            System.out.println("Element is not present in the matrix");
        }
        sc.close();
    }
}