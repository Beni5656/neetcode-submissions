class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean gap0 = false;
        boolean gap1 = false;
        boolean gap2 = false;

        for (int i = 0; i < triplets.length; i++) {

            if (triplets[i][0] > target[0] || triplets[i][1] > target[1] || triplets[i][2] > target[2]) {
                continue;
            }

            if (triplets[i][0] == target[0]) gap0 = true;
            if (triplets[i][1] == target[1]) gap1 = true;
            if (triplets[i][2] == target[2]) gap2 = true;

            if (gap0 && gap1 && gap2) return true;
        } 

        return false;
    }
}
