class Solution {
    public int minInsertions(String s) 
    {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        int [][] dp=new int [n][n];
        for(int []d:dp)
        Arrays.fill(d,-1);
        int ans=fn(sb,0,n-1,dp);
        return ans;
    }
    private int fn(StringBuilder sb,int l,int h,int [][]dp)
    {
        if(l>=h)return 0;
        if(sb.charAt(l)==sb.charAt(h))return 0+fn(sb,l+1,h-1,dp);
        if(dp[l][h]!=-1 )return dp[l][h];
        return dp[l][h] = 1+Math.min(fn(sb,l,h-1,dp),fn(sb,l+1,h,dp));
    }
}