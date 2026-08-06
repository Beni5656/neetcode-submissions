class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, target, new ArrayList<>(), 0, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int target, List<Integer> currList, int start, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(currList));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            currList.add(nums[i]);
            backtrack(result, nums, target, currList, i, sum + nums[i]);
            currList.remove(currList.size() - 1);
        }
    }
}
