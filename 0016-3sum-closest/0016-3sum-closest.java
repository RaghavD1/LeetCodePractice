class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(diff>Math.abs(sum-target))
                {
                    diff=Math.abs(sum-target);
                    ans=sum;
                }
                if(sum>target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return ans;
    }
}