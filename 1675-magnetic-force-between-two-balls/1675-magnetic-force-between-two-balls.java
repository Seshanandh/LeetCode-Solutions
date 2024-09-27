import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 1;
        int end = position[position.length - 1] - position[0];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Correct mid calculation
            int req = dist(position, mid);
            
            if (req >= m) {
                start = mid + 1;
            } else {
                end = mid - 1;  // Correct the end adjustment
            }
        }
        return end;  // Return end after binary search completes
    }
    
    public int dist(int[] nums, int mid) {
        int count = 1;
        int last = nums[0];
        
        for (int i = 1; i < nums.length; i++) {  // Start loop at index 1
            if (nums[i] - last >= mid) {
                count++;
                last = nums[i];
            }
        }
        return count;
    }
}
