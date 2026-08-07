class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<int[]> result = new ArrayList<>();
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

        for (int i = 0; i < points.length; i++) {
            queue.offer(points[i]);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }

        return result.toArray(new int[result.size()][2]);
    }
}
