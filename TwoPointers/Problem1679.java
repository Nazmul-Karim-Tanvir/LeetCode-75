package TwoPointers;

import java.util.Arrays;

public class Problem1679 {
    public int maxOperations(int[] nums, int k) {
        // Optimal Solution
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;

        // Initial approach but time limit exceeded
        // int count = 0;
        // int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums.length; j++) {
        // if (i != j && nums[i] != 0 && nums[j] != 0) {
        // sum = nums[i] + nums[j];
        // if (sum == k) {
        // nums[i] = 0;
        // nums[j] = 0;
        // count++;
        // break;
        // }
        // }
        // }
        // }
        // return count;
    }

    public static void main(String[] args) {
        Problem1679 pr = new Problem1679();
        System.err.println(pr.maxOperations(new int[] { 1, 2 }, 3));
        System.err.println(pr.maxOperations(new int[] { 4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4 }, 2));
    }
}
