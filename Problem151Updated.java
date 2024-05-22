public class Problem151Updated {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        int i = n - 1;
        while (i >= 0) {
            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }

            // Find the end of the word
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Add space after a word no space before 1st word 
            if(result.length() > 0){
                result.append(' ');
            }

            // Append the word
            result.append(s,i+1,j+1);
        }

        return result.toString();

    }

    public static void main(String[] args) {
        Problem151Updated pr = new Problem151Updated();
        String s = pr.reverseWords("a Hello World");
        System.out.println(s);
    }
}