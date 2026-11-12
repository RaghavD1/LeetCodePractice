class Solution {
    public int longestMonotonicSubarray(int[] nums)
    {
        int n=nums.length;
        int c=1;
        int ans=1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                c++;
                ans=Math.max(ans,c);
            }
            else
            {
                c=1;
            }
        }
        c=1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                c++;
                ans=Math.max(c,ans);
            }
            else
            {
                c=1;
            }
        }
        return ans;
    }

}