class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, int sum, List<Integer> currList, List<List<Integer>> result) {
        if (sum == target && !result.contains(currList)) {
            result.add(new ArrayList<>(currList));
            return;
        } else if (sum > target) {
            return;
        } 

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            currList.add(candidates[i]);
            backtrack(candidates, target, i + 1, sum + candidates[i], currList, result);
            currList.remove(currList.size() - 1);
        }
    }
}
