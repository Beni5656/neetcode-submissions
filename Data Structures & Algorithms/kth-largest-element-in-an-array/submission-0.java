class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }
}
