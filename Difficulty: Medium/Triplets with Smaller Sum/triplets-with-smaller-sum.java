class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i = 0; i < n-2; i++) {
            
            
            
            int left = i + 1;
            int right = n - 1;
            
            while(left < right) {
                
                int target = arr[i] + arr[left] + arr[right];
                
                if(target >= sum) {
                    right--;
                }
                else { // sum < target
                    
                    count = count + (right - left);
                    left++;
                }
            }
        }
        return count;
        
    }
}