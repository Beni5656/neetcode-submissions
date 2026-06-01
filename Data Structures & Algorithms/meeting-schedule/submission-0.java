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
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return true;
        }

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        int prevEnd = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            int nextStart = intervals.get(i).start;
            int nextEnd = intervals.get(i).end;

            if (nextStart < prevEnd) {
                return false;
            } else {
                prevEnd = nextEnd;
            }
        }

        return true;
    }
}
