class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int maxLength = 0;

        HashMap<Character,Integer> freq = new HashMap<>();

        for(int high = 0; high < n; high++) {
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // while(fre.get(ch) > 1) means character repeated
            // shrink the window
            while(freq.get(c) > 1) {
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar) - 1);
                
                if(freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                low++; 
            }

            int length = high - low + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}