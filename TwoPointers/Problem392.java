package TwoPointers;

public class Problem392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        Problem392 pr =  new Problem392();
        System.out.print(pr.isSubsequence("abc", "ahbgdc"));
        System.out.println(pr.isSubsequence("axc", "ahbgdc"));
    }
    
}