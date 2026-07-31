class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        // Seprate both negatives and positives
        for (int num : nums) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }

        // Case 1: No negatives number
        if (neg.size() == 0) {
            for (i = 0; i < n; i++) {
                pos.set(i, pos.get(i) * pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        // Case 2: No positives number
        if(pos.size() == 0) {
            for (i = 0; i < n; i++) {
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        // Case 3: Both negatives and positives number
        i = 0;
        int j = 0;
        int id = 0;
        int n1 = neg.size();
        int n2 = pos.size();
        int[] res = new int[n1 + n2];

        // Square negatives and reverse them
        for(i = 0; i < n1; i++) {
            neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);

        // Square postives 
        for (i = 0; i < n2; i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }

        // merge two sorted array
        i = 0;
        j = 0;
        while(i < n1 && j < n2)
        {
            if(neg.get(i) <= pos.get(j)) {
                res[id] = neg.get(i);
                id++;
                i++;
            }
            else {
                res[id] = pos.get(j);
                id++;
                j++;
            }
        }

        while(i < n1) {
            res[id] = neg.get(i);
            id++;
            i++;
        }
        while(j < n2) {
            res[id] = pos.get(j);
            id++;
            j++;
        }

        return res;
    }
}