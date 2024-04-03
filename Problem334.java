class Problem334 {
    public boolean increasingTriplet(int[] nums) {
        boolean result = false;
        if (nums == null || nums.length < 3) {
            result = false;
        }

        int min = nums[0];
        int position = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                position = i; // Update the position when a smaller element is found
            }
            if (i > position && nums[i] > min) {
                count++;
            }
        }
        if (count >= 3) {
            result = true;
        }
        return result;
    }

    // Initial Approach
    // public boolean increasingTriplet(int[] nums) {
    // int n = nums.length;
    // // int result[] = new int[n];
    // boolean result = false;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // for (int k = 0; k < n; k++) {
    // if((i<j && j<k)&&(nums[i] < nums[j] && nums[j] < nums[k])){
    // result = true;
    // break;
    // }
    // }
    // }
    // }
    // return result;
    // }

    public static void main(String[] args) {
        Problem334 pr = new Problem334();
        System.out.println(pr.increasingTriplet(new int[] { 5,4,3,2,1 }));
    }
}