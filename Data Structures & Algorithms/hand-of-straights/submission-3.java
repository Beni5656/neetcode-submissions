class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int card: hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        for (int card: map.keySet()) {
            if (map.get(card) == 0) continue;

            int currSize = map.get(card);

            for (int i = 0; i < groupSize; i++) {
                if (!map.containsKey(card + i) || map.get(card + i) < currSize) return false;

                map.put(card + i, map.get(card + i) - currSize);
            }
        }

        return true;
    }
}
