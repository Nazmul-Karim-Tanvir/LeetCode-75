import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class problem345 {
    public String reverseVowels(String s) {

        List<Character> arr = new ArrayList<>();
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o')
                    || (s.charAt(i) == 'u') || (s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I') || (s.charAt(i) == 'O')
                    || (s.charAt(i) == 'U')) {
                arr.add(s.charAt(i));
                result.setCharAt(i, '$');
            }
        }
        int n = arr.size();
        // Collections.reverse(arr);
        for (int i = 0; i < (n / 2); i++) {
            char temp = arr.get(i);
            arr.set(i, arr.get(n - 1 - i));
            arr.set((n - 1 - i), temp);

        }
        //System.out.println(arr);

        int count = 0;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '$') {

                for (int k = count; k < arr.size(); k++) {
                    result.setCharAt(i, arr.get(k));
                    count++;
                    break;
                }

            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        problem345 solve = new problem345();
        String s = "a a";
        System.out.println(solve.reverseVowels(s));
    }

}