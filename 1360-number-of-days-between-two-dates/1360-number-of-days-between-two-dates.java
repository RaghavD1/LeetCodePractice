class Solution {
    int []  days={31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) 
    {
        int year1=fn1(date1);
        int year2=fn1(date2);
        int month1=fn2(date1);
        int month2=fn2(date2);
        int date_1=fn3(date1);
        int date_2=fn3(date2);
        int number_of_days1=fn4(year1)+fn5(month1)+date_1;
        int number_of_days2=fn4(year2)+fn5(month2)+date_2;
        if(isLeapYear(year1)&&month1>2)number_of_days1+=1;
        if(isLeapYear(year2)&&month2>2)number_of_days2+=1;
        return Math.abs(number_of_days1-number_of_days2);
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
    public int fn4(int year)
    {
        int total=0;
        for(int i=1971;i<year;i++)
        {
            if(isLeapYear(i))total+=366;
            else total+=365;
        }
        return total;
    }
    public int fn5(int month)
    {
        int total=0;
        for(int i=0;i<month-1;i++)
        {
            total+=days[i];
        }
        return total;
    }
    public boolean isLeapYear(int i)
    {
        if(i%400==0||((i%4==0)&&(i%100!=0)))return true;
        return false;
    }
}