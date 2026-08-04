class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // Length of the array
        int n = nums.length;

        // Window boundaries
        int low = 0;
        int high = 0;

        // Store current window sum
        int sum = 0;

        // Store the minimum length of a valid subarray
        int result = Integer.MAX_VALUE;

        // Expand the window
        while (high < n) {

            // Add the current element to the window
            sum += nums[high];

            // Shrink the window while the sum is valid
            while (sum >= target) {

                // Current window length
                int length = high - low + 1;

                // Update the minimum length
                result = Math.min(result, length);

                // Remove the leftmost element from the window
                sum -= nums[low];

                // Move the left pointer
                low++;
            }

            // Move the right pointer
            high++;
        }

        // If no valid subarray is found, return 0
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}