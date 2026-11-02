class Solution {
    public int jump(int[] nums) 
    {
        int [] dp=new int [nums.length+1];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
    public int solve(int [] nums,int idx,int [] dp)
    {
        if(idx==nums.length-1)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=nums[idx]&&  idx + i < nums.length;i++)
        {
                int jumps=solve(nums,idx+i,dp);
                if(jumps!=Integer.MAX_VALUE)
                {
                    min=Math.min(min,1+jumps);
                }
        }
        dp[idx]=min;
        return dp[idx];
    }
}