class Solution {
    public List<List<Integer>> distinctPairs(int[] arr, int target) {
        // code here
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length-1;
        
        while(left < right) {
            int sum = arr[left] + arr[right];
            
            if(sum == target) {
                ans.add(Arrays.asList(arr[left], arr[right]));
                
                int leftValue = arr[left];
                int rightValue = arr[right];
                
                // skip duplicate value
                while(left < right && arr[left] == leftValue) {
                    left++;
                }
                
                while(left <  right && arr[right] == rightValue) {
                    right--;
                }
            }
            else if(sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        
        return ans;
        
    }
}