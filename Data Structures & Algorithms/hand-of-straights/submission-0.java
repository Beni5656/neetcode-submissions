class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> cardCounts = new TreeMap<>();

        for (int card: hand) {
            cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
        }

        for (int card: cardCounts.keySet()) {
            int currCardCount = cardCounts.get(card);

            if (currCardCount > 0) {

                for (int i = 0; i < groupSize; i++) {
                    int nextCard = card + i;

                    if (cardCounts.getOrDefault(nextCard, 0) < currCardCount) {
                        return false;
                    }

                    cardCounts.put(nextCard, cardCounts.get(nextCard) - currCardCount);
                }
            }
        }

        return true;
    }
}
