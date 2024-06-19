package HashMapSet;

import java.util.*;

public class Problem2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Using two HashSets to avoid redundancy in storing values from two arrays
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        // Creating two array list that contains different values
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                diff1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                diff2.add(num);
            }
        }

        // marging two separate different result to return
        List<List<Integer>> result = new ArrayList<>();
        result.add(diff1);
        result.add(diff2);
        return result;
    }

    public static void main(String[] args) {
        Problem2215 problem = new Problem2215();
        int[] num1 = { 1, 2, 3 };
        int[] num2 = { 2, 4, 6 };
        List<List<Integer>> result = problem.findDifference(num1, num2);
        System.out.println(result);
    }
}
