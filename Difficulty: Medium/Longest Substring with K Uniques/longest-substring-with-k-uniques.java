class Solution {
    public int longestKSubstr(String s, int k) {
        
        int n = s.length();
        int low = 0;
        int high;
        int res = Integer.MIN_VALUE;
        
        HashMap<Character, Integer> freq = new HashMap<>();
        
        // iterate throughout the loop
        for(high = 0; high < n; high++) {
            
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            
            // shrink window if more than k unique
            while(freq.size() > k) {
                
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar)-1);
                
                if(freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                
                low++;
            }
            
            // if exactly k unique , update answer
            if(freq.size() == k) {
                int length = high - low +1;
                res = Math.max(res, length);
            }
        }
        
        return res == Integer.MIN_VALUE ? -1 : res;
    }
}