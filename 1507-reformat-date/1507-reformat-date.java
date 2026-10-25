class Solution {
    public int fn(String date,int i)
    {
        return(((((date.charAt(i)-'0')*1000)+(date.charAt(i+1)-'0')*100)+(date.charAt(i+2)-'0')*10)+date.charAt(i+3)-'0');

    }
    public int fn1(String date)
    {
        int i=0;int date1=0;
        while(Character.isDigit(date.charAt(i)))
        {
            date1=date1*10+(date.charAt(i)-'0');
            i++;
        }
        return date1;
    }
    public String reformatDate(String date) 
    {
        int date_1=fn1(date);int year;
        if(date_1<10)year=fn(date,8);
        else year=fn(date,9);
        String s;
        if(date_1<10)s=date.substring(4,7);
        else s=date.substring(5,8);
        HashMap<String,Integer>m=new HashMap<>();
        m.put("Jan",1);
        m.put("Feb",2);
        m.put("Mar",3);
        m.put("Apr",4);
        m.put("May",5);
        m.put("Jun",6);
        m.put("Jul",7);
        m.put("Aug",8);
        m.put("Sep",9);
        m.put("Oct",10);
        m.put("Nov",11);
        m.put("Dec",12);
        StringBuilder sb=new StringBuilder();
        sb.append(year);
        sb.append('-');
        if(m.get(s.toString())<10)sb.append('0');
        sb.append(m.get(s.toString()));
        sb.append('-');
        if(date_1<10)sb.append('0');
        sb.append(date_1);
        return sb.toString();
    }
}