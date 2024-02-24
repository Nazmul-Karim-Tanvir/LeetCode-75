import java.util.Scanner;

public class Problem151 {
    public String reverseWords(String s) {
        String result = "";
        String result1 = s.trim();
        String arr[] = result1.split("\\s+");

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                result += arr[i] + " ";
            } else {
                result += arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem151 pr = new Problem151();
        System.out.println(pr.reverseWords(" Hello World "));
    }
}
