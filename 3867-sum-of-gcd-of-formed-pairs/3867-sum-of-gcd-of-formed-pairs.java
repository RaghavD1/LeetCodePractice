class Solution {
    public long gcdSum(int[] nums) 
    {
        int min=Integer.MAX_VALUE;
        List<Integer>a=new ArrayList<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            a.add(gcd(max,nums[i]));
        }
        Collections.sort(a);
        int l=0;int h=a.size()-1;
        long ans=0;
        while(l<h)
        {
            ans+=gcd(a.get(l),a.get(h));l++;h--;
        }
        return ans;
    }
    private int gcd(int a,int b)
    {
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        while(min!=0)
        {
            int rem=max%min;
            max=min;
            min=rem;
        }
        return max;
    }
}