class Solution {
    public String[] createGrid(int m, int n) 
    {
        String [][] a=new String[m][n];
        for(String [] ar:a)
        {
            Arrays.fill(ar,"#");
        }
        for(int i=0;i<m;i++)
        {
            a[i][0]=".";
        }
        for(int j=1;j<n;j++)
        {
            a[m-1][j]=".";
        }
        String [] ans=new String [m];int k=0;
        for(int i=0;i<m;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                sb.append(a[i][j]);
            }
            ans[k]=sb.toString();k++;
        }
        return ans;
    }
}