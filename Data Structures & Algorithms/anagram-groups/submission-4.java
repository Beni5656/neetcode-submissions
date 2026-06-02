class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            int[] count = new int[26];
            StringBuilder sb = new StringBuilder();

            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }

            for (int num: count) {
                sb.append(num);
                sb.append("#");
            }

            String key = sb.toString();

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> sol = new ArrayList<>();
                sol.add(str);
                map.put(key, sol);
            }
        }

        return new ArrayList<>(map.values());
    }
}
