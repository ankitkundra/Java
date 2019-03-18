import java.util.Scanner;
class patternInterview
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(i=1; i<=n;i++)
        {
            for(j=n-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i;k++)
            {
                System.out.print(k);
            }
            for(j=i-1; j>0;j--)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
        
    }
}