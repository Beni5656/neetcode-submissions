class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> currList, int start) {
        result.add(new ArrayList<>(currList));

        for (int i = start; i < nums.length; i++) {
            currList.add(nums[i]);
            backtrack(result, nums, currList, i + 1);
            currList.remove(currList.size() - 1);
        }
    }
}
