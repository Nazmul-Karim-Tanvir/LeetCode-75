package SlidingWindow;

public class Problem1456 {
    public int maxVowels(String s, int k) {
        if (s == null || k == 0 || k > s.length()) {
            return 0;
        }

        boolean isVowel[] = new boolean[128];
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;

        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel[s.charAt(i)]) {
                currentCount++;
            }

            if (i >= k && isVowel[s.charAt(i - k)]) {
                currentCount--;
            }

            if (i >= k - 1) {
                maxCount = Math.max(maxCount, currentCount);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Problem1456 pr = new Problem1456();
        System.err.println(pr.maxVowels(null, 0)); // Output: 0
        System.err.println(pr.maxVowels("abciiidef", 3)); // Output: 3
        System.out.println(pr.maxVowels("aeiou", 2)); // Output: 2
        System.out.println(pr.maxVowels("leetcode", 3)); // Output: 2
    }
}
