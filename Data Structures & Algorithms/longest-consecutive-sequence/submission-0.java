class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxSeq = 0;

        for (int num: nums) {
            set.add(num);
        }

        for (int num: set) {
            int currNum = num;
            int currSeq = 1;

            if (!set.contains(currNum - 1)) {
                while (set.contains(currNum + 1)) {
                    currSeq += 1;
                    currNum += 1;
                }
            }

            maxSeq = Math.max(maxSeq, currSeq);
        }

        return maxSeq;
    }
}
