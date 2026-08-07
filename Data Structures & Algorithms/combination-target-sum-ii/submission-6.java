class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, candidates, target, 0, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] candidates, int target, int sum, List<Integer> currList, int start) {
        if (sum == target) {
            result.add(new ArrayList<>(currList));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            currList.add(candidates[i]);
            backtrack(result, candidates, target, sum + candidates[i], currList, i + 1);
            currList.remove(currList.size() - 1);
        }
    }
}
