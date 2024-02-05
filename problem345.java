import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Problem345 {
    public String reverseVowels(String s) {

        // To store vowels
        List<Character> vowels = new ArrayList<>();

        // To store new string
        StringBuilder result = new StringBuilder(s);

        // Identifying vowels in a string
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o')
                    || (s.charAt(i) == 'u') || (s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I')
                    || (s.charAt(i) == 'O')
                    || (s.charAt(i) == 'U')) {
                vowels.add(s.charAt(i));
                result.setCharAt(i, '$');
            }
        }

        // To reverse vowels position
        // Collections.reverse(arr); or
        int n = vowels.size();
        for (int i = 0; i < (n / 2); i++) {
            char temp = vowels.get(i);
            vowels.set(i, vowels.get(n - 1 - i));
            vowels.set((n - 1 - i), temp);
        }

        // Updating reverse vowels to new Stirng
        int count = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '$') {
                    result.setCharAt(i, vowels.get(count));
                    count++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Problem345 solve = new Problem345();
        String s = "a a";
        System.out.println(solve.reverseVowels(s));
    }

}