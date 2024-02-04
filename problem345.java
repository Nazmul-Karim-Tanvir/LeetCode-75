import java.util.ArrayList;
import java.util.List;

public class problem345 {
    public String reverseVowels(String s) {

        List<Character> arr = new ArrayList<>();
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'e') || (s.charAt(i) == 'o')) {
                arr.add(s.charAt(i));
                result.setCharAt(i, ' ');
            }
        }
        
        // for (int j = arr.size(); j >= 0; j--) {
        //     if()
        // }
        //System.out.println(arr);
        return result.toString();
    }

    public static void main(String[] args) {
        problem345 solve = new problem345();
        String s = "hello";
        System.out.println(solve.reverseVowels(s));
    }

}