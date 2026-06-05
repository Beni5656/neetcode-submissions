class KthLargest {
    private Queue<Integer> queue;
    private int k;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.k = k;
        
        for (int num: nums) {
            this.add(num);
        }

    }

    public int add(int val) {
        queue.offer(val);
        
        if (queue.size() > k) {
            queue.poll();
        }

        return queue.peek();
    }
}