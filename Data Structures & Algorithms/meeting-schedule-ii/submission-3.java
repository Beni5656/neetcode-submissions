/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        Queue<Integer> minHeap = new PriorityQueue<>();

        if (intervals.isEmpty()) {
            return 0;
        }

        minHeap.offer(intervals.get(0).end);

        for (int i = 1; i < intervals.size(); i++) {
            if (minHeap.peek() > intervals.get(i).start) {
                minHeap.offer(intervals.get(i).end);
            } else {
                minHeap.poll();
                minHeap.offer(intervals.get(i).end);
            }
        }

        return minHeap.size();
    }
}
