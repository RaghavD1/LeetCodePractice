class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int n=stones.length;
        for(int i=n-1;i>=1;i--)
        {
            if(stones[i]!=stones[i-1])
            {
                stones[i-1]=Math.abs(stones[i]-stones[i-1]);
                stones[i]=0;
                Arrays.sort(stones,0,i);
            }
            else
            {
                stones[i]=0;
                stones[i-1]=0;i--;
            }
        }
        if(stones[0]!=0)return stones[0];
        return 0;
    }
}