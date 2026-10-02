class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append('(');
        dfs(sb,1,0,ans,n);
        return ans;
    }
    public void dfs(StringBuilder sb,int open,int close, List<String>ans,int n)
    {
        if(open==n&&close==n)
        {
            ans.add(sb.toString());
            return;
        }
        if(close<open)
        {
            dfs(sb.append(')'),open,close+1,ans,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open!=n)
        {
            dfs(sb.append('('),open+1,close,ans,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}