public class problem1768 {

    static class Solution {
        public String mergeAlternately(String word1, String word2) {
            String result = "";
            int min = Math.min(word1.length(), word2.length());
            int big = 0;
            for (int i = 0; i < min; i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }
            if (word1.length() > word2.length()) {
                big = word1.length();
                for (int i = min; i < big; i++) {
                    result += word1.charAt(i);
                }
            }
            if (word2.length() > word1.length()) {
                big = word2.length();
                for (int i = min; i < big; i++) {
                    result += word2.charAt(i);
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("pqr", "ABCDE"));
    }
}