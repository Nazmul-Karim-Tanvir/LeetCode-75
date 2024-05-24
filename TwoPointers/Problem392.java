package TwoPointers;

public class Problem392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true; // An empty string is a subsequence of any string
        }

        int sIndex = 0, tIndex = 0;

        // Traverse the sring t with tIndex
        while (tIndex < t.length()) {
            // if characters match in s are matched return true
            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++;
                // if all characters in s are matched , return true
                if (sIndex == s.length()) {
                    return true;
                }
            }
            // Always move to the next character in t
            tIndex++;
        }
        // Not all characters in s are matched
        return false; 
    }

    public static void main(String[] args) {
        Problem392 pr = new Problem392();
        System.out.print(pr.isSubsequence("abc", "ahbgdc"));
        System.out.print(pr.isSubsequence("axc", "ahbgdc"));
    }

}