import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionH {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int i=0,j=0;
        long sumMin=0,sumMax=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tmp;
                    tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for(i=0;i<4;i++)
        {
            sumMin=sumMin+arr[i];
        }
        for(i=1;i<=4;i++)
        {
            sumMax=sumMax+arr[i];
        }
        System.out.print(sumMin + " " +sumMax);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
