import java.util.Arrays;

public class Problem238 {

    /*
     * Initial Solution Time Complexity = O(n^2)
     * public int[] productExceptSelf(int[] nums) {
     * int n = nums.length;
     * int newnums[] = new int[n];
     * for (int j = 0; j < nums.length; j++) {
     * newnums[j] = nums[j];
     * }
     * 
     * for (int i = 0; i < nums.length; i++) {
     * int result = 1;
     * for (int j = 0; j < nums.length; j++) {
     * if (i != j) {
     * result *= nums[j];
     * }
     * }
     * newnums[i] = result;
     * }
     * return newnums;
     * }
     */

    // Final & Optimal Solution Time Complexity O(n)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate products off all elements to the left of i
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];

        }
        // Calculate products off all elements to the right of i and multiply them with the products to the left of i
        int rightProduct = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];

        }
        return result;
    }

    public static void main(String[] args) {
        Problem238 pr = new Problem238();
        System.out.println(Arrays.toString(pr.productExceptSelf(new int[] { 1, 2, 3, 4 })));
    }
}
