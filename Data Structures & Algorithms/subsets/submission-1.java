class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, int start, List<Integer> currList) {
        result.add(new ArrayList<>(currList));

        for (int i = start; i < nums.length; i++) {
            currList.add(nums[i]);
            backtrack(nums, result, i + 1, currList);
            currList.remove(currList.size() - 1);
        }
    }
}
