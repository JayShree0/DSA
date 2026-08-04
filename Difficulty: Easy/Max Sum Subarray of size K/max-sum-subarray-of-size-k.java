class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		
		int n = arr.length;
		
		// Window boundaries
		int low = 0;
		int high = k - 1;
		
		// Store the current window sum and maximum window sum
		int windowSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		// Calculate the sum of the first window
		for (int i = 0; i <= high; i++) {
			windowSum += arr[i];
		}
		
		// Initialize the maximum sum with the first window sum
		maxSum = windowSum;
		
		// Slide the window
		while (high < n) {
		    
		    // Move the window one step forward
			low++;
			high++;
			
			// Stop if high reaches the array length
			// Otherwise, accessing arr[high] will cause an ArrayIndexOutOfBoundsException
			if (high == n) {
				break;
			}
			
			// Update the window sum
			windowSum = windowSum - arr[low - 1] + arr[high];
			
			// Update the maximum sum
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return maxSum;
	}
}