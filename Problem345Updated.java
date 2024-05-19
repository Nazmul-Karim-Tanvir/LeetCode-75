public class Problem345Updated {
    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        Problem345Updated pr = new Problem345Updated();
        System.out.println(pr.reverseVowels("hello"));
        System.out.println(pr.reverseVowels("leetcode"));
    }
}
