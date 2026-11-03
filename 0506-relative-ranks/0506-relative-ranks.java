class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        String[] ans=new String[score.length];
        HashMap<Integer,Integer>m=new HashMap<>();
        int n=score.length;
        for(int i=0;i<n;i++)
        {
            m.put(score[i],i);
        }  
        Arrays.sort(score);int c=1;
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)ans[m.get(score[i])]="Gold Medal";
            else if(i==n-2)ans[m.get(score[i])]="Silver Medal";
            else if(i==n-3)ans[m.get(score[i])]="Bronze Medal";
            else ans[m.get(score[i])]=String.valueOf(c);
            c++;
        }
        return ans;
    }
}