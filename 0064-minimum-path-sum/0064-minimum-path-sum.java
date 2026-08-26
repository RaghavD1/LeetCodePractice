class Solution {
    public int minPathSum(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       int [][] dp=new int [m][n];
       return dfs(grid,m,n,0,0,dp);
    }
    public int dfs(int [][]grid,int m,int n,int i,int j,int [][] dp)
    {
        if(i==m-1&&j==n-1)return dp[i][j]=grid[i][j];
        if(i>=m||j>=n)return Integer.MAX_VALUE;
        if(dp[i][j]!=0)return dp[i][j];
        return dp[i][j]=grid[i][j]+Math.min(dfs(grid,m,n,i+1,j,dp),dfs(grid,m,n,i,j+1,dp));
    }
}