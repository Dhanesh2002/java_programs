import java.util.*;
public class array
{
    public static void main(String args[])
    {
        int n;//=Integer.parseInt(args[0]);
        int i;
        int a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter "+n+" elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
}