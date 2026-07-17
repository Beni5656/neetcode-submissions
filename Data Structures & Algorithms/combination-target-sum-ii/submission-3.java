class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> currList, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(currList));
            return;
        } else if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            currList.add(candidates[i]);
            backtrack(candidates, target - candidates[i], result, currList, i + 1);
            currList.remove(currList.size() - 1);
        }
    }
}
