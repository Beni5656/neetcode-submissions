class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxSeq = 0;
        int currSeq = 0;

        for (int num: nums) {
            set.add(num);
        }
        
        for (int num: set) {
            if (set.contains(num - 1)) continue;

            boolean higherNum = true;

            while (higherNum) {
                if (!set.contains(num + 1)) higherNum = false;
                num++;
                currSeq++;
            }

            maxSeq = Math.max(maxSeq, currSeq);
            currSeq = 0;
        }

        return maxSeq;
    }
}
