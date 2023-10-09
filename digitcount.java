import java.util.*;
public class digitcount
{
    public static void main(String args[])
    {
        int a,b,t,c=0;
        Scanner d=new Scanner(System.in);
        System.out.println("enter the number");
        a=d.nextInt();
        System.out.println("enter the number to be checked ");
        b=d.nextInt();
        while(a>0)
        {
         t=a%10;
         if(t==b)
          c++;
         a=a/10;          
        }
        System.out.println("the number repeated is "+c);
    }

}
