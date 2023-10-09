import java.util.*;
public class nterm
{
 public static void main(String args[])
 {
     int i;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter no.of element");
      int n=sc.nextInt();
      int[] num = new int[n];
     for(i=0;i<n;i++)
     {
         System.out.println("enter element "+(i+1) );
         num[i]=sc.nextInt();
     }
     System.out.println("enter the kth greatest search");
     int key=sc.nextInt();
     int min,max;
     min=num[0];
     max=num[0];
     for(i =0;i<n;i++)
     {
         if(num[i]<min)
          min=num[i];
         if(num[i]>max)
          max=num[i];
     }
     System.out.println("min max "+min+" "+max);
     int[] s= new int[max-min+1];
     for(i=0;i<n;i++)
     {
         s[num[i]-min]++;
                
         
     }
     for(i=max-min;i>=0;i--)
     {
         key=key-s[i];
         if(key<=0)
         {
             System.out.println((i+min)+" is the kth largest element");
             break;
         }
     }
       
     }
     
 }
