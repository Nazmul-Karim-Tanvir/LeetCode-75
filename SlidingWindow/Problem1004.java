package SlidingWindow;

public class Problem1004 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroCount = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Problem1004 pr = new Problem1004();
        int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println(pr.longestOnes(arr, 2)); // Output: 6

        // Additional test cases
        int arr2[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        System.out.println(pr.longestOnes(arr2, 3)); // Output: 10

        int arr3[] = { 1, 1, 1, 1 };
        System.out.println(pr.longestOnes(arr3, 0)); // Output: 4

        int arr4[] = { 0, 0, 0, 0 };
        System.out.println(pr.longestOnes(arr4, 2)); // Output: 2
    }
}
