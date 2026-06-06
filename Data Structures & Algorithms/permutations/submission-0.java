class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(result, visited, nums, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, boolean[] visited, int[] nums, List<Integer> currList) {
        if (currList.size() == nums.length) {
            result.add(new ArrayList<>(currList));
            return;
        } 

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            currList.add(nums[i]);

            visited[i] = true;

            backtrack(result, visited, nums, currList);
            currList.remove(currList.size() - 1);

            visited[i] = false;
        }
    }
}
