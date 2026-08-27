class Solution {
    public int calculateMinimumHP(int[][] dungeon) 
    {
        int m=dungeon.length;
        int n=dungeon[0].length;
        int [][] dp=new int [m][n];
        for(int []r:dp)Arrays.fill(r,Integer.MAX_VALUE);
        return dfs(dungeon,m,n,0,0,dp);
    }
    public int dfs(int [][] dungeon,int m,int n,int i,int j, int [][]dp)
    {
        if(i==m-1&&j==n-1)return Math.max(1, 1 - dungeon[i][j]);
        if(i>=m||j>=n)return Integer.MAX_VALUE;
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];
        return dp[i][j]=Math.max(1,(Math.min(dfs(dungeon,m,n,i+1,j,dp),dfs(dungeon,m,n,i,j+1,dp))-dungeon[i][j]));
    }
}