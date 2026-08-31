class Solution {
    public int maximumGap(int[] nums) 
    {
        int n=nums.length;
        if(n<2)return 0;
        int max=nums[0];
        int min=nums[0];
        for(int a:nums)
        {
            max=Math.max(max,a);
            min=Math.min(min,a);
        }
        if(min==max)return 0;
        int bucketSize=Math.max(1,((max-min)/n)-1);
        int number_of_buckets=(max-min)/bucketSize+1;
        int []buckmin=new int[number_of_buckets];
        int []buckmax=new int[number_of_buckets];
        Arrays.fill(buckmin,Integer.MAX_VALUE);
        Arrays.fill(buckmax,Integer.MIN_VALUE);
        for(int a:nums)
        {
            int idx=(a-min)/bucketSize;
            buckmin[idx]=Math.min(buckmin[idx],a);
            buckmax[idx]=Math.max(buckmax[idx],a);
        }
        int maxgap=0;
        int prevmax=min;
        for(int i=0;i<number_of_buckets;i++)
        {
            if(buckmin[i]==Integer.MAX_VALUE)continue;
            maxgap=Math.max(maxgap,buckmin[i]-prevmax);
            prevmax=buckmax[i];
        }
        return maxgap;
    }
}