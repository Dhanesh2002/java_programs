import java.util.*;
public class zoho_qn_3{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string with odd number of character");
String s=sc.next();
int length=s.length(); 
int l=0,r=length-1;
for(int col=0;col<length;col++)
{
 for(int row=0;row<length;row++)
 {
     if((row==col)||(row+col==length-1))
     {
         System.out.print(s.charAt(row));
     }
     else
      System.out.print(" ");
 }
 System.out.println();
}
}
}