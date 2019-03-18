class BubbleSort
{
    public static int[] BSort(int[] a)
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int tmp;
                    tmp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=tmp;
                }
            }
        }
        return a;
    }
    public static void main(String args[])
    {
        int[] a={769082435, 210437958, 673982045, 375809214, 380564127};
        int[] b=BSort(a);
        for(int x : a)
        {
            System.out.println(x);
        }
    }
}