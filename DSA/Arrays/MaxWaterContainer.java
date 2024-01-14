// Statement: Given an integer array of length n. Return the maximum amount of water a container can store. 

package DSA.Arrays;

import java.util.Scanner;

public class MaxWaterContainer {
    public static int maxWater(int[] heights, int n) {
        int left = 0, right = n - 1;
        int maxArea = 0;
        int height, width, curArea;

        while (left < right) {
            width = right - left;
            height = Math.min(heights[left], heights[right]);
            curArea = width * height;
            maxArea = Math.max(maxArea, curArea);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bars: ");
        int n = sc.nextInt();
        int heights[] = new int[n];
        System.out.println("Enter height of each bar :");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int result = maxWater(heights, n);
        System.out.println("Maximum Water can be stored in unit: " + result);
        sc.close();
    }
}
