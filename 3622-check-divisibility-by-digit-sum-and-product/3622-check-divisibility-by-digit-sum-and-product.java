class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum=0;int prod=1;
        while(a>0)
        {
            sum+=(a%10);
            prod*=(a%10);
            a/=10;
        }
        return n%(sum+prod)==0;
    }
}