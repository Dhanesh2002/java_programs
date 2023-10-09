import java.util.*;
class hash_map_sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
System.out.println("enter string b:");
String b=sc.nextLine();
String arr[]=b.split(" ");
for(String c: arr)
 System.out.println(c);
 System.out.println("enter string a:");
 String a=sc.next();
System.out.println(a);
int arr_size=arr.length;
System.out.println("array size:"+arr_size);
if(arr_size!=a.length())
 {
     System.out.println("not palindrome 1");
     return;
 }
 HashMap<Character,String> map=new HashMap();
for(i=0;i<arr_size;i++)
{
    if(!map.containsKey(a.charAt(i)))
    {
      if(map.containsValue(arr[i]))
      {
          System.out.println("not palindrome 2");
          return;
     }
     map.put(a.charAt(i),arr[i]);
    }
    else
    {
    String res=map.get(a.charAt(i));
    if(!res.equals(arr[i]))
    {
    System.out.println("not palindrome 3");
    return;
    }
}
     
    

}
System.out.println("palindrome");
}
}