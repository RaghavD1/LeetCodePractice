class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        int n=stones.length;
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            q.offer(stones[i]);
        }
        while(q.size()>1)
        {
            int a=q.poll();
            int b=q.poll();
            if(a!=b)
            {
                q.offer(Math.abs(a-b));
            }
        }
        if(q.isEmpty())return 0;
        return q.poll();
    }
}