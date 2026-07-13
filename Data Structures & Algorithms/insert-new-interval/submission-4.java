class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int count = 0;
        int n = intervals.length;

        while (count < n && intervals[count][1] < newInterval[0]) {
            result.add(intervals[count]);
            count++;
        }

        while (count < n && intervals[count][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[count][0]);
            newInterval[1] = Math.max(intervals[count][1], newInterval[1]);
            count++;
        }

        result.add(newInterval);

        while (count < n) {
            result.add(intervals[count]);
            count++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
