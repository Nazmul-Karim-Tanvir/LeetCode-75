import java.util.ArrayList;
import java.util.List;

public class Problem1431Updated {

    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>(candies.length);
            int maxCandies = 0;
            
            // Find the maximum number of candies any kid currently has
            for (int i : candies) {
                maxCandies = Math.max(maxCandies, i);
            }
            
            // Determine if each kid can have the greatest number of candies with extraCandies
            for (int i : candies) {
                result.add(i + extraCandies >= maxCandies);
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

