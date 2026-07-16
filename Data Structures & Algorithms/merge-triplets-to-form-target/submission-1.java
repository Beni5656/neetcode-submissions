class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean gap0 = false;
        boolean gap1 = false;
        boolean gap2 = false;

        for (int[] triple: triplets) {
            if (triple[0] > target[0] || triple[1] > target[1] || triple[2] > target[2]) continue;
            
            if (triple[0] == target[0]) {
                gap0 = true;
            } 
            if (triple[1] == target[1]) {
                gap1 = true;
            }
            if (triple[2] == target[2]) {
                gap2 = true;
            }

            if (gap0 && gap1 && gap2) {
                return true;
            }
        }

        return false;
    }
}
