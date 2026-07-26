class Solution {
    public int maximumProduct(int[] nums) 
    {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[0]*nums[1]*nums[n-1];
        int b= nums[n-1]*nums[n-2]*nums[n-3];
        return a >b?a:b;
    }
}