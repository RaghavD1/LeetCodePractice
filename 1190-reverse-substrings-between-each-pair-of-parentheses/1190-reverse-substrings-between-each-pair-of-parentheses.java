class Solution {
    public String reverseParentheses(String s) 
    {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(s.charAt(i)==')')
                {
                    StringBuilder sb=new StringBuilder();
                    while(st.peek()!='(')
                    {
                        sb.append(st.pop());
                    }
                    st.pop();
                    for(int j=0;j<sb.length();j++)
                    {
                        st.push(sb.charAt(j));
                    }
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb1=new StringBuilder();
        while(!st.isEmpty())
        {
            sb1.append(st.pop());
        }
        return sb1.reverse().toString();
    }
}