import java.util.*;
public class bin2dec
{
public static void main(String args[])
{
    System.out.println("enter a binary val");
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int res=bin2deci(num,1);
    System.out.println("ans="+res);
    
}
static int bin2deci(int n,int mul){
    if(n==0)
    return 0;
    int rem=n%10;
    rem=rem*mul;
    return bin2deci(n/10,mul*2)+rem;
}
}