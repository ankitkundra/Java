import java.util.*;
class HashMapDemo1
{
    static void count(String s)
    {
        HashMap<Character,Integer> map =new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++)
        {
        char c=s.charAt(i);
        if(map.containsKey(c)==false)
        {
            map.put(c,1);
        }
        else
        {
            int count=map.get(c);
            map.put(c,count+1);
        }
        
        }
        System.out.println(map);
    }
    public static void main(String args[])
    {
        String s="hello";
        count(s);
    }
}