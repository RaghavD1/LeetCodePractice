class Solution {
    public int sumCounts(List<Integer> nums) 
    {
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            HashMap<Integer,Integer>m=new HashMap<>();
            int distinct_number=0;
            for(int j=i;j<nums.size();j++)
            {
                if(!m.containsKey(nums.get(j)))
                {
                    m.put(nums.get(j),1);
                    distinct_number++;
                }
                ans+=(distinct_number*distinct_number);
            }
        }
        return ans;
    }
}