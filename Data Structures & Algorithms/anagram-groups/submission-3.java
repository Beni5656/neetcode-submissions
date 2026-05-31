class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String str: strs) {
            int[] temp = new int[26];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                temp[str.charAt(i) - 'a']++;
            }
            
            for (int val: temp) {
                    sb.append('#');
                    sb.append(val);
                }
            
            if (!map.containsKey(sb.toString())) {
                    List<String> res = new ArrayList<>();
                    map.put(sb.toString(), res);
                }

                map.get(sb.toString()).add(str);
        }

        for (List<String> val: map.values()) {
            result.add(val);
        }

        return result;
    }
}
