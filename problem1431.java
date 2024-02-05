import java.util.ArrayList;
import java.util.List;

public class Problem1431 {

    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>();

            for (int i = 0; i < candies.length; i++) {
                int currentCandies = candies[i] + extraCandies;
                boolean canHaveGreatestCandies = true;
                
                for (int j = 0; j < candies.length; j++) {
                    if (currentCandies < candies[j]) {
                        canHaveGreatestCandies = false;
                        break;
                    }
                }
                result.add(canHaveGreatestCandies);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = { 2, 3, 5, 1, 3 };
        System.out.println(solution.kidsWithCandies(candies, 3));
    }
}