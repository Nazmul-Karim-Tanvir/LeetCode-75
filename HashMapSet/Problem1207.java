package HashMapSet;
import java.util.HashMap;
import java.util.HashSet;

public class Problem1207 {
    public boolean uniqueOccurrences(int[] arr) {
        //Step 1: Count the occurrences of each values
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num: arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        //Step 2: Check if the occurrences are unique
        HashSet<Integer> set = new HashSet<>();
        for(int occurrences: countMap.values()){
            if(set.add(occurrences) == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Problem1207 problem = new Problem1207();
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        System.out.println(problem.uniqueOccurrences(arr));
    }
}
