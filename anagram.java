import java.util.*;
public class anagram{
public static void main(String args[])
{
String a,b;
System.out.println("enter string 1");
Scanner sc=new Scanner(System.in);
a=sc.next();
System.out.println("enter string 2");
b=sc.next();
int sum=0,n;
n=a.length();
if(n!=b.length())
{
System.out.println("Not an anagram");
return;
}
for(int i=0;i<n;i++)
{
sum=sum+(int)a.charAt(i);
sum=sum-(int)b.charAt(i);
}
if(sum==0)
System.out.println("two string are anagram");
else
 System.out.println("two string are not anagram");
}
}