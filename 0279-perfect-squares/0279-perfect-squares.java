class Solution {
    int [] dp;
    public int numSquares(int n) 
    {
        dp=new int [n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    public int solve(int n,int [] dp)
    {
        if(n<=0)return 0;
        if(n==1)return 1;
        if(n==2)return 2;
        if(dp[n]!=-1)return dp[n];
        int ans=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
            int cost=1+solve(n-i*i,dp);
            ans=Math.min(ans,cost);
            dp[n]=ans;
        }
        return ans;
    }
}