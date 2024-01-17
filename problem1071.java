public class problem1071 {

    static class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            int gcdLength = gcd(str1.length(), str2.length());

            return str1.substring(0, gcdLength);
        }

        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings("LEED", "CODE"));
    }
}