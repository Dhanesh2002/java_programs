import java.util.*;
public class sumarray
{
    static Scanner sc=new Scanner(System.in);
 public static void main(String args[])
 {
  int n1,n2,i;
  int a[],b[],c[];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size of n1 :");
  n1= sc.nextInt();
  System.out.println("enter array size of n2 :");
  n2= sc.nextInt();
  a=new int[n1];
  b=new int[n2];
  c=new int[n1];
  System.out.println("enter elements of array 1:");
  for(i=0;i<n1;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("enter element of array 2:");
  for(i=0;i<n2;i++)
  {
   b[i]=sc.nextInt();
   }
  for(i=0;i<n2;i++)
  {
   c[i]=a[i]+b[i];
   System.out.println("element :"+c[i]);
  }
  
 }
}