package PrefixSum;

public class Problem724 {
    public int pivotIndex(int[] nums) {
       int totalSum = 0;
       int leftSum = 0;

       //Calculate the sum of the array elements
       for (int i = 0; i < nums.length; i++) {
           totalSum += nums[i];
       }

       //Finding the pivot index
       for (int i = 0; i < nums.length; i++) {
        if (leftSum == totalSum -leftSum- nums[i]) {
            return i;
        }
        leftSum += nums[i];
       }
        return -1;
    }


    public static void main(String[] args) {
        Problem724 pr = new Problem724();
        int nums[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pr.pivotIndex(nums));
    }
}
