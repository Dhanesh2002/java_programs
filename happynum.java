import java.util.*;
public class happynum
{
 public static void main(String atgs[])
 {
     int a,b,c,s,tmp;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the number:");
     a=sc.nextInt();
     s=summ(a);
     System.out.println(s);
     
     
 }
 static public int summ(int a)
 {
     int b,s=0;
     while(a>0)
     {
     b=a%10;
     s=s+b;
     a=a/10;
     }
     if(s>9)
      return summ(s);
     return s;
 }
}