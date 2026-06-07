class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(result, nums, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> currList, int start) {
        result.add(new ArrayList<>(currList));

        for (int i = start; i < nums.length; i++) {
            if (i != start && nums[i - 1] == nums[i]) {
                continue;
            }

            currList.add(nums[i]);
            backtrack(result, nums, currList, i + 1);
            currList.remove(currList.size() - 1);
        }
    }
}
