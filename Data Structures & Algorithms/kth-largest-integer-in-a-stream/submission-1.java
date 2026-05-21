class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<>();
        this.k = k;

        for (int num: nums) {
            add(num);
        }
    }

    public int add(int val) {
        this.pq.offer(val);
        if (this.pq.size() > this.k) {
            this.pq.poll();
        }
        return this.pq.isEmpty() ? null : this.pq.peek();
    }
}