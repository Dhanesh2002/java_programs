import java.util.*;
class zoho_qn_6{
public static void main(String args[])
{
String a,res="";
Scanner sc=new Scanner(System.in);
a=sc.next();
int n=a.length();
char s[]=a.toCharArray();
int start=0,end=n-1;
while(start<end)
{
s[start]=(char)(s[start]+s[end]);
s[end]=(char)(s[start]-s[end]);
s[start]=(char)(s[start]-s[end]);
start++;
--end;

}
for(int i=0;i<n;i++)
 System.out.print(s[i]);

}
}