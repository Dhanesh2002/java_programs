import java.util.*;
class string_pal
{
    public static void main(String ards[])
    {
String result="";
Scanner sc=new Scanner(System.in);
System.out.println("enter a string ");
String a=sc.next();
for(int i=a.length()-1;i>=0;i--)
{
 result=result+a.charAt(i);
}
System.out.println("rev string : "+result);
}
}