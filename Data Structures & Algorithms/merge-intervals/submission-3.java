class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] prev = intervals[0];
        result.add(prev);

        for (int i = 1; i < intervals.length; i++) {
            if (prev[1] >= intervals[i][0]) {
               prev[1] = Math.max(intervals[i][1], prev[1]); 
            } else {
                result.add(intervals[i]);
                prev = intervals[i];
            }
        }

        return result.toArray(new int[0][]);
    }
}
