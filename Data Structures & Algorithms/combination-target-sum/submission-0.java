class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, result, nums, target, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int start, List<List<Integer>> result, int[] nums, int target, int sum, List<Integer> currentList) {
        if (sum == target) {
            result.add(new ArrayList<>(currentList));
            return;
        } else if (sum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            currentList.add(nums[i]);
            backtrack(i, result, nums, target, sum + nums[i], currentList);
            currentList.remove(currentList.size() - 1);
        }
    }
}
