class Solution {
    public String reverseParentheses(String s) 
    {
        int n=s.length();
        Stack<StringBuilder>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty())
            {
                st.push(new StringBuilder(String.valueOf(s.charAt(i))));
            }
            else
            {
                if(s.charAt(i)==')')
                {
                    StringBuilder sb=new StringBuilder();
                    while(!st.peek().toString().equals("("))
                    {
                        sb.append(st.pop());
                    }
                    st.pop();
                    st.push(sb.reverse());
                }
                else
                {
                    st.push(new StringBuilder(String.valueOf(s.charAt(i))));
                }
            }
        }
        StringBuilder sb1=new StringBuilder();
        if(st.size()!=1)
        {
            while(!st.isEmpty())
            {
                sb1.append(st.pop());
            }
            sb1.reverse();
            return sb1.toString();
        }
        return st.peek().reverse().toString();
    }
}