class Solution {
    public int smallestNumber(int n, int t) 
    {
        while(n<=n*2)
        {
            int a=n;
            int prod=1;
            while(a>0)
            {
                prod*=(a%10);
                a/=10;
            }
            if(prod%t==0)return n;
            n++;
        }
        return 0;
    }
}