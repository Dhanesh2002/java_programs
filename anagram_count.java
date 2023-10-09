import java.util.*;
class anagram_count
{
public static void main(String args[])
{
 String a;
 String b;
 Scanner sc=new Scanner(System.in);
 int[] c =new int[26];
 System.out.println("enter string 1;");
 a=sc.next();
 System.out.println("enter string 2;");
 b=sc.next();
 int string_length=a.length();
 int i;
 if(string_length!=b.length())
  {
      System.out.println("not a anagram");
      return;
  }
  for( i=0;i<string_length;i++)
  {
  c[a.charAt(i)-'a']++;
  c[b.charAt(i)-'a']--;
  }
  for(i=0;i<string_length;i++)
  {
      if(c[i]!=0)
      {
      System.out.println("not a anagram");
      return;
      }
  }
    System.out.println("anagram");
}
}