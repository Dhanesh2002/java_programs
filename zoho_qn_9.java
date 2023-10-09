import java.util.*;
class zoho_qn_9
{
public static void main(String args[]){
 int n=5,space,star;
 display(n,n-1,1,1);
 display(n-1,1,n-1,-1);
 
}
public static void display(int n, int space, int star,int val){
int i,j;
for(i=1;i<=n;i++)
{
 for(j=1;j<=star;j++)
 {
    System.out.print("*");
 }
 for(j=1;j<=(space*2);j++)
 {
     System.out.print(" ");
    
 }
 for(j=1;j<=star;j++)
 {
     System.out.print("*");
    
 }
 star=star+val;
 space=space-val;
 System.out.println();
}


}
}