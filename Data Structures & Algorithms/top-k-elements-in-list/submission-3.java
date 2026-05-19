class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] array = new int[k];

        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxNum = 0;

            for (int key: map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxNum = key;
                }
            }

            array[i] = maxNum;
            map.remove(maxNum);
        }

        return array;
    }
}
