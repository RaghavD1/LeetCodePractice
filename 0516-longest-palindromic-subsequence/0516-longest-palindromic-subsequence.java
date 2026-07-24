class Solution {
    public int longestPalindromeSubseq(String s) 
    {
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp.length;j++)
            {
                if(i==j)dp[i][j]=1;
            }
        }
        for(int len=2;len<=s.length();len++)
        {
            for(int i=0;i<s.length()-len+1;i++)
            {
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j))
                {
                    dp[i][j]=2+dp[i+1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
    
}