class Solution {
    StringBuilder sb;
    public String digitSum(String s, int k) 
    {
        sb=new StringBuilder(s);
        while(sb.length()>k)
        {
            sb=new StringBuilder(solve(sb,k));
        }
        return sb.toString();
    }
    public String solve(StringBuilder sb,int k)
    {
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<sb.length())
        {
            int a=k;
            int num=0;
            while(a>0&&i<sb.length())
            {
                a--;
                num=num+(sb.charAt(i)-'0');
                i++;
            }
            s.append(num);
        }
        return s.toString();
    }
}