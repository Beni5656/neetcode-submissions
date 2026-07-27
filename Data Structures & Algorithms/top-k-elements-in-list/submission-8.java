class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] frequency = new List[nums.length + 1];

        for (int num: map.keySet()) {
            int index = map.get(num);

            if (frequency[index] == null) frequency[index] = new ArrayList<>();

            frequency[index].add(num);
        }

        for (int i = frequency.length - 1; i > 0; i--) {
            if (frequency[i] == null) continue;

            for (int num: frequency[i]) {
                if (k == 0) return result;
                result[k - 1] = num;
                k--;
            }
        }

        return result;
    }
}
