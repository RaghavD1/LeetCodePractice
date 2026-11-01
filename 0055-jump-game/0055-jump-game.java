class Solution {
    public boolean canJump(int[] nums)
    {
        int [] dp=new int [nums.length+1];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
    public boolean solve(int [] nums,int idx,int [] dp)
    {
        if(idx==nums.length-1)return true;
        if(dp[idx]==1)return true;
        if(dp[idx]==0)return false;
        boolean a=false;
        for(int i=1;i<=nums[idx]&&(idx+i)<nums.length;i++)
        {
            a=a||solve(nums,idx+i,dp);
            if(a==true)dp[idx+i]=1;
            else dp[idx+i]=0;
        }
        return a;
    }
   
}