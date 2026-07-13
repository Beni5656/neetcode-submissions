class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;

        result.add(intervals[0]);

        for (int i = 1; i < n; i++) {
            int[] lastAdded = result.get(result.size() - 1);

            if (intervals[i][0] > lastAdded[1]) {
                result.add(intervals[i]);
            } else {
                lastAdded[1] = Math.max(lastAdded[1], intervals[i][1]);
            }
        }   

        return result.toArray(new int[result.size()][]);
    }
}
