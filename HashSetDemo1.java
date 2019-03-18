import java.util.*;
class HashSetDemo1
{
    static boolean isUnique(String s)
    {
        HashSet<Character> set =new HashSet<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(set.add(c)==false)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        String s="hello";
        boolean ans =isUnique(s);
        if(ans)
            System.out.println("String has unique characters");
        else
             System.out.println("String doesn't have unique characters");
    }
}