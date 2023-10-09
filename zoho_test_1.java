import java.util.*;
class zoho_test_1{
public static void main(String args[])
{
 int odd=1,even=2,n;
 System.out.println("enter n:");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(int col=1;col<=n;col++)
 {
 for(int k=n-col;k>0;k--)
      {
          System.out.print("\t");
      }
 for(int row=1;row<=col;row++)
 {
      
      if(col%2!=0)
       {
           System.out.print("\t"+odd);
           odd=odd+2;
       }
      else
       {
        System.out.print("\t"+even);
           even=even+2;
       } 
}
System.out.println();      
 }
}
}

