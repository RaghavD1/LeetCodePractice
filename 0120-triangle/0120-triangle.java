class Solution {
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int m=triangle.size();
        int n=triangle.get(m-1).size();
        int [][] dp=new int[m][n];
        for(int []r:dp)Arrays.fill(r,Integer.MIN_VALUE);
        return dfs(triangle,0,0,m,dp);
    }
    public int dfs(List<List<Integer>> triangle,int i,int j,int m,int [][] dp)
    {
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        if(i==m-1)return  dp[i][j]=triangle.get(i).get(j);
        return dp[i][j]=triangle.get(i).get(j)+Math.min(dfs(triangle,i+1,j,m,dp),dfs(triangle,i+1,j+1,m,dp));
    }
}