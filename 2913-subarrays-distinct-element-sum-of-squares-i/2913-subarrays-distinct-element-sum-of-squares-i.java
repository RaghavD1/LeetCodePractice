class Solution {
    public int sumCounts(List<Integer> nums) 
    {
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                HashMap<Integer,Integer>m=new HashMap<>();
                int distinct_number=0;
                for(int k=i;k<=j;k++)
                {
                    if(!m.containsKey(nums.get(k)))
                    {
                        distinct_number++;
                        m.put(nums.get(k),1);
                    }
                }
                ans+=(distinct_number*distinct_number);
            }
        }
        return ans;
    }
}