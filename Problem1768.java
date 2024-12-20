public class Problem1768 {

    static class Solution {
        public String mergeAlternately(String word1, String word2) {
            String result = "";
            int min = Math.min(word1.length(), word2.length());

            for (int i = 0; i < min; i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }
            if (word1.length() > word2.length()) {
                result += word1.substring(word1.length());
            } else {
                result += word1.substring(word2.length());
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("pqr", "ABCDE"));
    }
}
