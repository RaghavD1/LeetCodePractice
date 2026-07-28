class Solution {
    public String smallestPalindrome(String s) 
    {
        int [] a=new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();char ch='a';int c=0;
        for(int i=25;i>=0;i--)
        {
            if(a[i]!=0)
            {
                    if(a[i]%2==1)
                    {
                        c++;
                        ch=(char)(i+97);
                    }
                    int b=a[i]/2;
                    while(b>0)
                    {
                        sb.insert(0,(char)(i+97));
                        b--;
                    }
            }
        }
        StringBuilder ans=new StringBuilder(sb);
        if(c==1)ans.append(ch);
        ans.append(sb.reverse());
        return ans.toString();
    }
}