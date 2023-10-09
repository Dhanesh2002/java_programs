import java.util.*;
public class paladd
{
    static void print(String a)
    {
        System.out.println(a);
    }
    
public static void main(String args[])
{
  String a;
  int i,n,flag,l,r;
  Scanner sc= new Scanner(System.in);
  System.out.println("enter a string:");
  a=sc.next();
  char[] b= a.toCharArray();
  n=a.length();
  int tmp=n-1;
  for(i=0;i<n;i++)
  {
      l=i;
      r=n-1;
      flag=1;
      while(l<=r)
      {
          if(b[l++]!=b[r--])
          {
           flag=0;
           break;
          } 
          
      
      }
      if(flag==1)
      {
          tmp=i;
          break;
      }
     
       
      
      
    
  }
  for(i=tmp-1;i>=0;i--)
  {
      a=a+a.charAt(i);
  
 }
  print(a);
  
  
}
}