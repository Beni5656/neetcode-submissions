class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            int[] x = new int[26];
            StringBuilder sb = new StringBuilder();

            for (char c: str.toCharArray()) {
                x[c - 'a']++;
            }

            for (int num: x) {
                sb.append(num);
                sb.append('#');
            }

            String s = sb.toString();

            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                List<String> l = new ArrayList<>();
                l.add(str);
                map.put(s, l);
            }
        }

        return new ArrayList<>(map.values());
    }
}
