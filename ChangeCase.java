import java.util.*;
class ChangeCase
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        char ch;
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        if((int)ch>=97 &&(int)ch<=122)
        {
            int res=((int)ch)-32;
            System.out.println((char)res);
        }
        else if((int)ch>=65 &&(int)ch<=90)
        {
            int res=((int)ch)+32;
            System.out.println((char)res);
        }
        else
        {
            System.out.println("Enter valid input");
        }
    }
}