package Assessment;

import java.util.Scanner;

public class DivisiblePairs {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k,count=0;
        System.out.println("Enter the no. of array elements : ");
        n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter the array elements : ");
        for (int i=0;i<n;i++)
        {
            ar[i]= sc.nextInt();
        }

        System.out.println("Enter the divisor : ");
        k=sc.nextInt();

        System.out.println("The pairs that meet the criteria are : ");

        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if((ar[i]+ar[j])%k==0)
                {
                    count++;
                    System.out.println("["+(i+1)+","+(j+1)+"]");
                }
            }
        }
        System.out.println(count + " pairs meet the criteria");
    }
}
