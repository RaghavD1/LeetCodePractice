class Solution {
    public int maximumScore(int[] nums, int[] multipliers) 
    {
        int n=nums.length;
        int m=multipliers.length;
        int [][] dp=new int[m+1][n+1];
        for(int [] a:dp)
        {
            Arrays.fill(a,Integer.MIN_VALUE);
        }
        return fun(nums,multipliers,0,0,dp,n);
    }
    public int fun(int[] nums, int[] multipliers,int op,int l,int [][] dp,int n)
    {
        if(op==multipliers.length)return 0;
        if(dp[op][l]!=Integer.MIN_VALUE)return dp[op][l];
        return dp[op][l]=Math.max(multipliers[op]*nums[l]+fun(nums,multipliers,op+1,l+1,dp,n),multipliers[op]*nums[n-1-(op-l)]+fun(nums,multipliers,op+1,l,dp,n));
    }
}