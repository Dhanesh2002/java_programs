import java.util.*;
public class borrow
{
public static void main(String args[])
{
    String s1,s2;
    int l1,l2,e1,e2,b=0,i,p1,p2,j,t1,t2;
    System.out.println("enter a integer string 1: ");
    Scanner sc=new Scanner(System.in);
    s1=sc.next();
    System.out.println("enter a integer string 2: ");
    s2=sc.next();
    l1=s1.length();
    l2=s2.length();
    if(l1==l2)
    {
    e1=Integer.parseInt(s1);
    e2=Integer.parseInt(s2);
     if(e2<e1)
     {
         t1=e1;
         t2=e2;
         while(t2>0)
         {
             p1=t1%10;
             p2=t2%10;
             t1=t1/10;
             t2=t2/10;
             if(p2>p1)
             {
                 b++;
                 t1=t1-1;
                 
             }
         }
      
     }
     }
      System.out.println(b);
    }
    
   

}
