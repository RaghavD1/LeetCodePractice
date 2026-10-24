class Solution {
    int [] days={31,28,31,30,31,30,31,31,30,31,30,31};
    public int dayOfYear(String date) 
    {
        int year=fn1(date);
        int month=fn2(date);
        int date1=fn3(date);
        int total=fn4(month)+date1;
    if((year%400==0||(year%4==0&&year%100!=0))&&month>2)total+=1;
        return total;
    }
    public int fn1(String a)
    {
        return ((((a.charAt(0)-'0')*1000)+(a.charAt(1)-'0')*100)+(a.charAt(2)-'0')*10)+a.charAt(3)-'0';
    }
    public int fn2(String a)
        {
            return ((a.charAt(5)-'0')*10)+a.charAt(6)-'0';
        }
    public int fn3(String a)
        {
            return ((a.charAt(8)-'0')*10)+a.charAt(9)-'0';
        }
    public int fn4(int a)
    {
        int t=0;
        for(int i=0;i<a-1;i++)
        {
            t+=days[i];
        }
        return t;
    }
}