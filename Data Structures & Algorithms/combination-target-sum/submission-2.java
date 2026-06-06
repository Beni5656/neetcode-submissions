class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int target, int start, int sum, List<Integer> currList, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(currList));
            return;
        } else if (sum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            currList.add(nums[i]);
            backtrack(nums, target, i, sum + nums[i], currList, result);
            currList.remove(currList.size() - 1);
        }
    }
}
