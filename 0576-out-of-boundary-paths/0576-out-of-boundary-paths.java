class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) 
    {
        int [][][] dp=new int [m][n][maxMove+1];
        for (int[][] x : dp) {
            for (int[] y : x) {
                Arrays.fill(y, -1);
            }
        }
        return dfs(m,n,maxMove,startRow,startColumn,dp);
    }
    public int dfs(int m, int n, int maxMove, int startRow, int startColumn,int [][][] dp)
    {
        if(startRow>=m||startRow<0||startColumn>=n||startColumn<0)return 1;
        if(maxMove==0)return 0;
        if(dp[startRow][startColumn][maxMove]!=-1)return dp[startRow][startColumn][maxMove];
        long ans=(long)dfs(m,n,maxMove-1,startRow+1,startColumn,dp)+dfs(m,n,maxMove-1,startRow-1,startColumn,dp)+dfs(m,n,maxMove-1,startRow,startColumn+1,dp)+dfs(m,n,maxMove-1,startRow,startColumn-1,dp);
        return dp[startRow][startColumn][maxMove]=(int)(ans % 1000000007);
    }
}