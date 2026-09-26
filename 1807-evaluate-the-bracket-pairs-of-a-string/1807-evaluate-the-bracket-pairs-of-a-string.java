class Solution {
    public String evaluate(String s, List<List<String>> knowledge) 
    {
        StringBuilder sb=new StringBuilder();
        HashMap<String,String>m=new HashMap<>();
        for(int i=0;i<knowledge.size();i++)
        {
            m.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
            {
                i++;
                StringBuilder sb1=new StringBuilder();
                while(s.charAt(i)!=')')
                {
                    sb1.append(s.charAt(i));
                    i++;
                }
                String s1=sb1.toString();
                if(m.containsKey(s1))
                {
                    sb.append(m.get(s1));
                }
                else 
                {
                    sb.append('?');
                }
                i++;
            }
            else
            {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}