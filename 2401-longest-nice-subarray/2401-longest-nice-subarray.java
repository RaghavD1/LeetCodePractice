class Solution {
    public int longestNiceSubarray(int[] nums)
    {
        int ans=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int r=i;
            int mask=nums[r];
            int m=1;
            while(r+1<n&&(nums[r+1]&mask)==0)
            {
                m++;
                ans=Math.max(ans,m);
                mask=mask|nums[r+1];r++;
            }
        }
        return ans;
    }
}