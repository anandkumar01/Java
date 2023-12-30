import java.util.*;

public class Hello {

    public static int function(int nums[], int k) {
        int n = nums.length;
        if (k > n) {
            return -1;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;

        int left = 0;
        int right = k;
        while (right < n) {
            windowSum = windowSum - nums[left] + nums[right];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
            left++;
            right++;
        }
        return maxSum;
    }

    public static void main(String args[]) {

        int nums[] = {1, 2, -4, 4, 5};
        int k = 3;
        int result = function(nums, k);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
