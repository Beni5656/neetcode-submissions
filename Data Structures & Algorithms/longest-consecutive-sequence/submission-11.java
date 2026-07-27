class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 1;
        Set<Integer> set = new HashSet<>();

        if (nums.length == 0) return 0;

        for (int num: nums) {
            set.add(num);
        }

        for (int num: set) {
            if (set.contains(num - 1)) continue;

            int count = 1;
            while (set.contains(num + 1)) {
                count++;
                num++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
