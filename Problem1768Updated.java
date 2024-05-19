public class Problem1768Updated {

    static class Solution {
        public String mergeAlternately(String word1, String word2) {

            int Min = Math.min(word1.length(), word2.length());

            StringBuilder resultSring = new StringBuilder();
            int i = 0, j = 0;

            while (i < Min && j < Min) {
                resultSring.append(word1.charAt(i++));
                resultSring.append(word2.charAt(j++));
            }

            boolean big = false;

            if (word1.length() > word2.length()) {
                big = true;

            }
            if (big) {
                resultSring.append(word1.substring(Min));
            } else {
                resultSring.append(word2.substring(Min));
            }

            return resultSring.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("pqr", "ABCDE"));
    }
}
