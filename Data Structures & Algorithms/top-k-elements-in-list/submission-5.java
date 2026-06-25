class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freqArray = new List[nums.length + 1];

        for (int num: map.keySet()) {
            int freq = map.get(num);
            if (freqArray[freq] == null) freqArray[freq] = new ArrayList<>();

            freqArray[freq].add(num);
        }

        int[] result = new int[k];

        for (int i = nums.length; i >= 0; i--) {
            if (freqArray[i] != null) {
                int count = freqArray[i].size();

                while (count != 0) {
                    if (k == 0) return result;
                    result[k - 1] = freqArray[i].get(count - 1);
                    count--;
                    k--;
                }
            }

            if (k == 0) return result; 
        }

        return result;
    }
}
