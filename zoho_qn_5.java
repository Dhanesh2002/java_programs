import java.util.*;
class zoho_qn_5{
public static void main(String args[])
{
String a,res="";
Scanner sc=new Scanner(System.in);
a=sc.next();
int len=a.length();
for(int i=0;i<len;i++)
{
 if(!(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'))
 {
  res=res+a.charAt(i);  
 }
 
}
System.out.println(res);
}
}