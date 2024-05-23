package TwoPointers;

public class Problem283 {
    public void moveZeroes(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Problem283 pr = new Problem283();
        int arr[] = { 0, 1, 0, 3, 12 };
        pr.moveZeroes(arr);
    }
}
