class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;

        // Store the minimum difference found so far
        int max_diff = Integer.MAX_VALUE;

        // Store the closest sum found so far
        int result = nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                // Current difference from target
                int min_diff = Math.abs(sum - target);

                // Update answer if current sum is closer
                if (min_diff < max_diff) {
                    max_diff = min_diff;
                    result = sum;

                }

                if (sum == target) {
                    return sum;
                }

                else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;

    }
}