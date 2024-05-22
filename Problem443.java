public class Problem443 {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i<chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of the current character 
            while (i<chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            //Write the character to the array
            chars[index++] = currentChar; 
            
            // Write the count to the array if more that 1
            if(count > 1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[index++] = c;
                }
            }

        }
        return index;
    }

    public static void main(String[] args) {
        Problem443 pr = new Problem443();
        System.err.println(pr.compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' }));
    }
}
