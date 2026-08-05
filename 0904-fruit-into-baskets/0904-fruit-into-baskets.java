class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int left = 0;
        int right = 0;
        int maxLength = Integer.MIN_VALUE;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (right = 0; right < n; right++) {

            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            // shrink the window while freq.size() > 2
            while (freq.size() > 2) {
                int leftFruit = fruits[left];
                freq.put(leftFruit, freq.get(leftFruit) - 1);

                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }
                left++;
            }
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}