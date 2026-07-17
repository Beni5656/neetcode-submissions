class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean gap0 = false;
        boolean gap1 = false;
        boolean gap2 = false;

        for (int[] triples: triplets) {
            if (triples[0] > target[0] || triples[1] > target[1] || triples[2] > target[2]) {
                continue;
            }

            if (triples[0] == target[0]) gap0 = true;
            if (triples[1] == target[1]) gap1 = true;
            if(triples[2] == target[2]) gap2 = true;
        }

        return (gap0 && gap1 && gap2);
    }
}
