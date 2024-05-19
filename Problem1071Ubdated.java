public class Problem1071Ubdated {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /*
     * For 6 , 4
     * a = 6, b = 4
     * b==0 false
     * So a = b = 4 , b = a % b = 6 % 4 = 2
     * a = 4, b = 2
     * b==0 false
     * So a = b = 2 , b = a % b = 4 % 2 = 0
     * a = 2 , b = 0
     * b==0 true return a = 2
     */

     /*
     * For 4 , 6
     * a = 4, b = 6
     * b==0 false
     * So a = b = 6 , b = a % b = 4 % 6 = 4
     * a = 6, b = 4
     * b==0 false
     * So a = b = 4 , b = a % b = 6 % 4 = 2
     * a = 4, b = 2
     * b==0 false
     * So a = b = 2 , b = a % b = 4 % 2 = 0
     * a = 2 , b = 0
     * b==0 true return a = 2 ;
     */

    public static void main(String[] args) {
        Problem1071Ubdated solution = new Problem1071Ubdated();
        String s = solution.gcdOfStrings("ABAB", "ABABAB");
        System.out.println(s);
    }
}
