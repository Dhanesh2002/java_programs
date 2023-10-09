import java.util.*;
class valid_parr{
public static void main(String args[]){
String s;
Scanner sc=new Scanner(System.in);
s=sc.next();
int length=s.length();
Stack<Character> a=new Stack<>();
if(s.charAt(0)==']'||s.charAt(0)=='}'||s.charAt(0)==')')
{
 System.out.println("invalid");
 return ;
}
for(int i=0;i<length;i++)
{
if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='(')
    {
        a.push(s.charAt(i));
    }
else if(a.size()!=0)
{
 if(s.charAt(i)==']'&& a.peek()=='[')
  a.pop();
 else if(s.charAt(i)==')'&& a.peek()=='(')
  a.pop();
  else if(s.charAt(i)=='}'&& a.peek()=='{')
  a.pop();
 else
  {
      System.out.println("invalid");
      return;
 }
}
else
{
System.out.println("invalid");
      return;
}
 
}
if(a.size()==0)
 System.out.println("valid");
else
 System.out.println("invalid");
}
}