class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        int currSeq = 0;
        int maxSeq = 0;

        for (int num: nums) {
            uniqueNums.add(num);
        }

        for (int num: nums) {
            if (uniqueNums.contains(num - 1)) {
                continue;
            }

            while (uniqueNums.contains(num)) {
                currSeq++;
                num++;
            }

            maxSeq = Math.max(currSeq, maxSeq);
            currSeq = 0;
        }

        return maxSeq;
    }
}
