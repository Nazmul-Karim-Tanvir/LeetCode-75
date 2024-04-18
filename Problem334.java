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
  

    public static void main(String[] args) {
        Problem334 pr = new Problem334();
        System.out.println(pr.increasingTriplet(new int[] { 5,4,3,2,1 }));
    }
}