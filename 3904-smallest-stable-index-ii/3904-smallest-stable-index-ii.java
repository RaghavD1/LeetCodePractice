class Solution {
    public int firstStableIndex(int[] nums, int k) 
    {
        int m=nums.length;
        int [] arr1=new int[m];
        int [] arr2=new int[m];
        int max=nums[0];int min=nums[m-1];
        arr1[0]=nums[0];
        for(int i=1;i<m;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            arr1[i]=max;
        }
        arr2[m-1]=nums[m-1];
        for(int j=m-2;j>=0;j--)
        {
            if(nums[j]<min)
            {
                min=nums[j];
            }
            arr2[j]=min;
        }
        for(int i=0;i<m;i++)
        {
            if(arr1[i]-arr2[i]<=k)return i;
        }
        return -1;
    }
}