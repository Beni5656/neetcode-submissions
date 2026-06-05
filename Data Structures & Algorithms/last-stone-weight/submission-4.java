class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone: stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();

            queue.offer(stone1 - stone2);
        }

        return queue.isEmpty() ? 0 : queue.peek();
    }
}
