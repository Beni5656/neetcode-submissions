class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        result.add(intervals[0]);
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (prevEnd < intervals[i][0]) {
                result.add(intervals[i]);
                prevEnd = intervals[i][1];
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], intervals[i][1]);
                prevEnd = result.get(result.size() - 1)[1];
            }
        }

        return result.toArray(new int[result.size() - 1][]);
    }
}
