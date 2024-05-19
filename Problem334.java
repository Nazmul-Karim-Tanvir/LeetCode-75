class Problem334 {
    public boolean increasingTriplet(int[] nums) {

        if (nums == null || nums.length < 3) {
            return false;
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstMin) {
                
                firstMin = num;
            } else if (num <= secondMin) {
                secondMin = num;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem334 pr = new Problem334();
        System.out.println(pr.increasingTriplet(new int[] { 5, 4, 3, 2, 1 }));
    }
}