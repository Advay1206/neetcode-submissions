class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        String seq = "0123456";
        // Base case, at the end of a string, i == n-1 the ways a string is decoded is only 1
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--){
            if (s.charAt(i) == '0'){
                dp[i] = 0;
            } else{
                dp[i] = dp[i + 1];
                if (i + 1 < n && (s.charAt(i) == '1' || (s.charAt(i) == '2' && seq.contains(String.valueOf(s.charAt(i + 1)))))){
                    dp[i] += dp[i + 2];
                }
            }
        }
        return dp[0];
    }
}
