class Solution {
    public int longestPalindromeSubseq(String s) 
    {
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return fn(s,0,s.length()-1,dp);
    }
    private int fn(String s,int l,int h,int[][] dp)
    {
        if(l>h)return 0;
        if(l==h)return 1;
        if(s.charAt(l)==s.charAt(h))return 2+fn(s,l+1,h-1,dp);
        if(dp[l][h]!=-1)return dp[l][h];
        return dp[l][h]= Math.max(fn(s,l+1,h,dp),fn(s,l,h-1,dp));
    }
}