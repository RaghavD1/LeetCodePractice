class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++)
        {
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int b=i+1;b<n-2;b++)
            {
                if(b>i+1&&nums[b]==nums[b-1])continue;
                int l=b+1;
                int r=n-1;
                while(l<r)
                {
                    long sum=(long)nums[i]+nums[b]+nums[l]+nums[r];
                    if(sum==target)
                {
                    ans.add(Arrays.asList(nums[i],nums[b],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1])l++;
                    while(l<r&&nums[r]==nums[r-1])r--;
                    l++;
                    r--;
                }
                else if(sum<target)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
            }
        }
        return ans;
    }
}