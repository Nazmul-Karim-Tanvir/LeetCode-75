package SlidingWindow;

public class Problem643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        Problem643 pr = new Problem643();
        int nums[] = { 5 };
        System.out.printf("%.4f\n", pr.findMaxAverage(nums, 1));
    }
}
