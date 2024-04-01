class Problem334 {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        boolean result = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if((i<j && j<k)&&(nums[i] < nums[j] && nums[j] < nums[k])){
                        result = true;
                        break;
                    }
                }
            }
        }  
        return result;
    }

    // Initial Approach
    // public boolean increasingTriplet(int[] nums) {
    //     int n = nums.length;
    //   //  int result[] = new int[n];
    //     boolean result = false;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             for (int k = 0; k < n; k++) {
    //                 if((i<j && j<k)&&(nums[i] < nums[j] && nums[j] < nums[k])){
    //                     result = true;
    //                     break;
    //                 }
    //             }
    //         }
    //     }  
    //     return result;
    // }

    public static void main(String[] args) {
        Problem334 pr =  new Problem334();
        System.out.println(pr.increasingTriplet(new int[] {1,5,9,5}));
    }
}