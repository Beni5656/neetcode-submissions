class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int maxSeq = 0;
        int currSeq = 0;

        for (int num: set) {
            if (set.contains(num - 1)) continue;

            while (set.contains(num + 1)) {
                currSeq++;
                num++;
            }

            maxSeq = Math.max(maxSeq, currSeq + 1);
            currSeq = 0;
        }

        return maxSeq;
    }
}
