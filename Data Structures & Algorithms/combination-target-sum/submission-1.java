class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, result, new ArrayList<>(), 0, 0);
        return result;
    }

    private void backtrack(int[] nums, int target, List<List<Integer>> result, List<Integer> currList, int start, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(currList));
            return;
        } else if (sum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            currList.add(nums[i]);
            backtrack(nums, target, result, currList, i, sum + nums[i]);
            currList.remove(currList.size() - 1);
        }
    }
}
