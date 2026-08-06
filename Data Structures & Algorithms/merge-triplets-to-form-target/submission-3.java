class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean gap1 = false;
        boolean gap2 = false;
        boolean gap3 = false;

        for (int[] triples: triplets) {
            if (triples[0] > target[0]) continue;
            if (triples[1] > target[1]) continue;
            if (triples[2] > target[2]) continue;

            if (triples[0] == target[0]) gap1 = true;
            if (triples[1] == target[1]) gap2 = true;
            if (triples[2] == target[2]) gap3 = true;
        }

        return gap1 && gap2 && gap3;
    }
}
