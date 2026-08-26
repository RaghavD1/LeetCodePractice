class Solution {
    public int minFallingPathSum(int[][] matrix)
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][]dp=new int [m][n];
        for(int []r:dp)Arrays.fill(r,Integer.MIN_VALUE);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            ans=Math.min(ans,dfs(matrix,m,n,0,i,dp));
        }
        return ans;
    }
    public int dfs(int[][]matrix,int m,int n,int i,int j,int [][] dp)
    {
        if(i>=m||j>=n||j<0)return Integer.MAX_VALUE;
        if(i==m-1)return dp[i][j]=matrix[i][j];
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        return dp[i][j]=matrix[i][j]+Math.min(Math.min(dfs(matrix,m,n,i+1,j-1,dp),dfs(matrix,m,n,i+1,j,dp)),dfs(matrix,m,n,i+1,j+1,dp));
    }
}