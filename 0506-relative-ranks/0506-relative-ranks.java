class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        String [] ans=new String[score.length];
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for(int i=0;i<score.length;i++)
        {
            pq.offer(new int[]{score[i],i});
        }
        int c=1;
        while(!pq.isEmpty())
        {
            if(c==1)ans[pq.poll()[1]]="Gold Medal";
            else if(c==2)ans[pq.poll()[1]]="Silver Medal";
            else if(c==3)ans[pq.poll()[1]]="Bronze Medal";
            else ans[pq.poll()[1]]=String.valueOf(c);
            c++;
        }
        return ans;
    }
}