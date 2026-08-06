class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(check1(board,i,j)==false||check2(board,i,j)==false||check3(board,i,j)==false)return false;
                }
            }
        }
        return true;
    }
    public boolean check1(char [][] board,int i,int j)
    {
        int [] a=new int[10];
        a[board[i][j]-'0']++;
        for(int k=0;k<9;k++)
        {
            if(board[i][k]!='.'&& k!=j)
            {
                if(a[board[i][k]-'0']==0)a[board[i][k]-'0']++;
                else return false;
            }
        }
        return true;
    }
    public boolean check2(char [][] board,int i,int j)
    {
        int []a=new int[10];
        a[board[i][j]-'0']++;
        for(int k=0;k<9;k++)
        {
            if(board[k][j]!='.'&&k!=i)
            {
                if(a[board[k][j]-'0']==0)a[board[k][j]-'0']++;
                else return false;
            }
        }
        return true;
    }
    public boolean check3(char [][] board,int i,int j)
    {
        int [] a=new int[10];
        a[board[i][j]-'0']++;
        int r1=(i/3)*3;
        int c1=(j/3)*3;
        for(int k=r1;k<r1+3;k++)
        {
            for(int l=c1;l<c1+3;l++)
            {
                if(board[k][l]=='.') continue;
                if(i==k&&l==j)continue;
                if(a[board[k][l]-'0']==0)a[board[k][l]-'0']++;
                else return false;
            }
        }
        return true;
    }
}