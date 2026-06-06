class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            int currEnd = currentInterval[1];

            if (nextStart <= currEnd) {
                currentInterval[1] = Math.max(currEnd, nextEnd);
            } else {
                currentInterval = intervals[i];
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[0][]);
    }
}
