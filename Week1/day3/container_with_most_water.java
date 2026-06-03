package Week1.day3;

public class container_with_most_water{
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while (left < right) {
            // Calculate current area
            int width = right - left;
            int currentArea = Math.min(height[left], height[right]) * width;
            
            // Update max area
            max = Math.max(max, currentArea);
            
            // Move the pointer with smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}
