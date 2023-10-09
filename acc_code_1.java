import java.util.*;
public class acc_code_1{
public static void main(String args[])
{
    int n;//no.of nums which has no 3's
 Scanner sc=new Scanner(System.in);
 System.out.println("eneter a number");
 n=sc.nextInt();
 int c=0;
 for(int i=0;i<n;i++)
 {
     int t=i,flag=0;
     while(t>0)
     {
         if(((t%10))==3)
         {
             flag=1;
             break;
             
         }
         t=t/10;
        
         
     }
      if(flag==0)
          c++;
 }
 System.out.println(c);
}
}