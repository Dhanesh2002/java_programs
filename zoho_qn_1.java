import java.util.*;
public class zoho_qn_1{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 int n;
 System.out.println("enter n :");
 n=sc.nextInt();
 int row,col;
 for(row=1;row<=n;row++)
 {
     for(col=1;col<=n;col++)
     {
         if((row==col)||(row+col)==n+1)
          System.out.print(row);
         else
          System.out.print(" ");
     }
     System.out.println();
 }
  
}
}