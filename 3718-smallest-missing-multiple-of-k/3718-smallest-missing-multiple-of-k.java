class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        int n=k;
        while(has(nums,k)==true)
        {
            k+=n;
        }
        return k;
    }
    public boolean has(int []nums,int k)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==k)return true;
        }
        return false;
    }
}