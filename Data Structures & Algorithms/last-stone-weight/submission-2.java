class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone: stones) {
            maxHeap.offer(stone);
        }

        if (maxHeap.isEmpty()) {
            return 0;
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if (stone2 > stone1) {
                maxHeap.offer(stone2 - stone1);
            } else if (stone1 > stone2) {
                maxHeap.offer(stone1 - stone2);
            } else {
                maxHeap.offer(0);
            }
        }

        return maxHeap.peek();
    }
}
