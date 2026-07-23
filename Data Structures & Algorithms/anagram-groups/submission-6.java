class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            int[] temp = new int[26];

            for (int i = 0; i < s.length(); i++) {
                temp[s.charAt(i) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int num: temp) {
                sb.append(num);
                sb.append('#');
            }
            
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, new ArrayList<>()));
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
