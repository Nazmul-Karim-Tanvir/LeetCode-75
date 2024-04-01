public class Problem151 {
    public String reverseWords(String s) {
        String result = "";
        String arr[] = s.trim().split("\\s+");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                result += arr[i] + " ";
            } else {
                result += arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem151 pr = new Problem151();
        System.out.println(pr.reverseWords(" Hello World "));
    }
}
