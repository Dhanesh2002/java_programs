import java.util.*;
public class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a,t,b=0;
    System.out.println("ente a number ");
    a=sc.nextInt();
    while(a>0)
    {
    t=a%10;
    b=b*10+t;
    a=a/10;
    }
    System.out.println(b);
    }
}
   