import java.util.*;
public class revlist_zohoset5_10
{
public static void main(String args[])
{
 int n,i,l,r,tmp,mod;
 System.out.println("enter the size of arra ");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int[] a=new int[n];
 
 for(i=0;i<n;i++)
 {
     System.out.println("enter "+(i+1)+":");
     a[i]=sc.nextInt();
 }
 System.out.println("enter k ");
 int k=sc.nextInt();
 mod=n%k;
 for(i=0;i<n;i=i+k)
 {
     if(i+k>=n)
     {
         l=i;
         r=n-1;
     }   
     else
     {
     l=i;
     r=i+k-1;
     }
     for(int j=i;j<=((r+l)/2);j++)
     {
      tmp=a[j];
      a[j]=a[r];
      a[r]=tmp;
      r--;
      }
}
System.out.println("Result :");
for(i =0 ;i<n;i++)
 {
     System.out.println(a[i]);
 }    

 
 }
 
 
 
 
}
