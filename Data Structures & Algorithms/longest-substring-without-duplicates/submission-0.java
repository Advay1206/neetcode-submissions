class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int l = 0;
        int maxLen = 0;
        for (int r = 0; r < s.length(); r++){
            while(window.contains(s.charAt(r))){
                window.remove(s.charAt(l));
                l++;
            }
            maxLen = Math.max(maxLen, (r - l + 1));
            window.add(s.charAt(r));
        } 
        return maxLen;
    }
}
