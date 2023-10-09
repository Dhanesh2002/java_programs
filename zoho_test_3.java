import java.util.*;
class zoho_test_3{
public static void main(String args[])
{
 String s,result="";
 int slength,s_space=0,add_space,extra_space,row,screen_space,each_space,i;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a string ");
 s=sc.nextLine();
 System.out.println("Screen length");
 screen_space=sc.nextInt();
slength=s.length();
for(row=0;row<slength;row++)
{
 if(s.charAt(row)==' ')
  s_space++;
}
System.out.println(s_space);
 add_space=s_space+(screen_space-slength);
 System.out.println("add_space :"+add_space);
 each_space=add_space/s_space;
 System.out.println("ecah space:"+each_space);
 extra_space=add_space%s_space;
 System.out.println("extra_space:"+ extra_space);
 for(row=0;row<slength;row++)
{
 if(s.charAt(row)==' ')
   {
    for(i=1;i<=each_space;i++)
      result=result+'*';
    if(extra_space>0)
    {
     result=result+'*';
     extra_space--;
    }
   }
 else
 result=result+s.charAt(row);
}
System.out.println("result: "+result);
} 
}