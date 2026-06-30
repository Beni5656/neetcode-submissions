class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, 1 + map.getOrDefault(num, 0));
        }

        List<Integer>[] array = new List[nums.length + 1];

        for (int num: map.keySet()) {
            int count = map.get(num);

            if (array[count] == null) {
                array[count] = new ArrayList<>();
            }

            array[count].add(num);
        }

        int[] result = new int[k];
        int count = 0;

        for (int i = nums.length; i >= 0; i--) {
            if (array[i] == null) continue;

            for (int num: array[i]) {
                if (count == k) return result;

                result[count] = num;
                count++;
            }
            
        }

        return result;
    }
}
