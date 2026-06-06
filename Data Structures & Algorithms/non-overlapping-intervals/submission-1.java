class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) return 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int eraseCount = 0;

        int[] currInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            int currEnd = currInterval[1];

            if (nextStart < currEnd) {
                eraseCount++;
            } else {
                currInterval = intervals[i];
            }
        }

        return eraseCount;
    }
}
