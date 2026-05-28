class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int n = s.length();
        int maxLen = 0;
        int maxFreq = 0;
        for (int r = 0; r < n; r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            while ((r - l + 1) - maxFreq > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, (r - l + 1));
        }
        return maxLen;
    }
}
