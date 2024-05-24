package TwoPointers;

public class Problem11 {
    public int maxArea(int[] height) {
        // Initialize pointers and the max area variable
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        // Use a while loop to move the pointers towards each other
        while (left < right) {
            // Calculate the width between the current left and right pointers
            int width = right - left;

            // Calculate the height by taking the minimum of the two lines
            int minHeight = Math.min(height[left], height[right]);

            // Calculate the area and update the maxArea if the current area is larger
            int currentArea = width * minHeight;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area found
        return maxArea;
    }

    public static void main(String[] args) {
        Problem11 pr = new Problem11();
        System.out.println(pr.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }
}