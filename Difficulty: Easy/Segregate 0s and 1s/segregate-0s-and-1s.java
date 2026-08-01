class Solution {
    
    static void swap(int[] arr, int low, int high) {
        while(low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    
    void segregate0and1(int[] arr) {
        // code here
        
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else {
                swap(arr, low, high);
                high--;
            }
        }
        
    }
}
