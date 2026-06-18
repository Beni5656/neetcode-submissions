class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int[] x = new int[2];
                x[0] = map.get(complement);
                x[1] = i;
                return x;
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
