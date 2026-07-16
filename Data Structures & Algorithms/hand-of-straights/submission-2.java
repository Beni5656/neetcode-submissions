class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> cards = new TreeMap<>();

        for (int card: hand) {
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        for (int card: cards.keySet()) {
            int currCardCount = cards.get(card);

            if (currCardCount > 0) {
                for (int i = 0; i < groupSize; i++) {
                    int nextCard = card + i;

                    if (!cards.keySet().contains(nextCard) || cards.get(nextCard) < currCardCount ) {
                        return false;
                    }

                    cards.put(nextCard, cards.get(nextCard) - currCardCount);
                }
            }
        }

        return true;
    }
}
