package SlidingWindow;

public class Problem1456 {
    public int maxVowels(String s, int k) {
        boolean isVowel[] = new boolean[128];
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;

        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < isVowel.length; i++) {
            if (isVowel[s.charAt(i)]) {
                currentCount++;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        Problem1456 pr = new Problem1456();
        System.err.println(pr.maxVowels(null, 0));
        // System.err.println(pr.maxVowels("abciiidef", 2)); // output: 3
        // System.out.println(pr.maxVowels("aeiou", 2)); // Output: 2
        // System.out.println(pr.maxVowels("leetcode", 3)); // Output:2

    }
}
