class Solution {
    public int missingInteger(int[] nums) {
       int n=nums.length;
       int a=longestsequence(nums,n);
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(nums[i]);
        }
        while(s.contains(a))
        {
            a++;
        }
        return a;
    }
    public int longestsequence(int [] nums,int n){
        int i=0;int ans=0;
        while(i<n)
        {
            int j=i;
            int sum=0;
            while(j<n&&j+1<n&&nums[j]+1==nums[j+1])
            {
                sum+=nums[j];j++;
            }
            sum+=nums[j];
            ans=Math.max(ans,sum);
            return ans;
        }
        return 0;
    }
}