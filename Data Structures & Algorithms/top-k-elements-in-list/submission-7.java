class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] array = new List[nums.length + 1];

        for (int num: freq.keySet()) {
            int index = freq.get(num);

            if (array[index] == null) {
                array[index] = new ArrayList<>();
            }

            array[index].add(num);
        }

        int[] result = new int[k];
        int count = 0;

        for (int i = nums.length; i > 0; i--) {
            if (array[i] == null) continue;
            if (count == k) return result;

            for (int num: array[i]) {
                result[count++] = num;
                if (count == k) return result;
            }

        }

        return result;
    }
}
