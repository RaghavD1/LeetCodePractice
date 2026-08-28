class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int startRow=0;int startCol=0;
        int endRow=0;int endCol=0;
        int nonob=0;
        int [][]v=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    startRow=i;
                    startCol=j;
                }
                if(grid[i][j]==2)
                {
                    endRow=i;
                    endCol=j;
                }
                if(grid[i][j]==0)nonob++;
            }
        }
        return dfs(grid,startRow,startCol,endRow,endCol,nonob,m,n,v);
    }
    public int dfs(int [][] grid,int startRow,int startCol,int endRow,int endCol,int nonob,int m,int n,int [][]v)
    {
        if(startRow==endRow&&startCol==endCol&&nonob==0)return 1;
        if(startRow==endRow&&startCol==endCol&&nonob!=0)return 0;
        if(startRow>=m||startRow<0||startCol<0||startCol>=n)return 0;
        if(v[startRow][startCol]==1)return 0;
        if(grid[startRow][startCol]==-1)return 0;
        v[startRow][startCol]=1;
        if(grid[startRow][startCol]==0)nonob--;
        int ans=
            dfs(grid,startRow+1,startCol,endRow,endCol,nonob,m,n,v)+
            dfs(grid,startRow-1,startCol,endRow,endCol,nonob,m,n,v)+
            dfs(grid,startRow,startCol+1,endRow,endCol,nonob,m,n,v)+
            dfs(grid,startRow,startCol-1,endRow,endCol,nonob,m,n,v);
        v[startRow][startCol]=0;
        return ans;
    }
}