class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        int min=101;int max=0;
        for(int i=0;i<n;i++)
        {
            if(min>nums[i])min=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(max<nums[i])max=nums[i];
        }
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(nums[i]);
        }
        int counter=min+1;
        for(int i=min+1;i<max;i++)
        {
            if(!s.contains(counter))ans.add(counter);
            counter++;
        }
        return ans;
    }
}