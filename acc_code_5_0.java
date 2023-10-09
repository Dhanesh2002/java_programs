import java.util.*;
public class acc_code_5_0
{
public static void main(String args[])
{
    //to find a largest number which is divisible by 90 by given nums 5,0;
    int array_size,zero_count=0,five_count=0,sum=0,i,no_of_five=0;
    String result="";
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the array size :");
    array_size=sc.nextInt();
    int[] a= new int[array_size];
    System.out.println("enter the elements:");
    for(i=0;i<array_size;i++)
    {
        a[i]=sc.nextInt();
    if(a[i]==0)
     zero_count++;
    else
    {
     five_count++;
     sum=sum+5;
    }  
}
System.out.println("0-"+zero_count+" 5- "+five_count+" sum-"+sum);
if(zero_count==0)
 {
  System.out.println("there is no num divisible by 90");  
  return ;
}
while(sum>=45)
{
    
    if(sum%9==0)
    {
     no_of_five=sum/5;
     System.out.println("sum="+sum);
     break;
    }
    sum=sum-5;
}
if(no_of_five==0)
{
System.out.println("there is no num divisible by 90");  
  return ;
}
for(i=0;i<no_of_five;i++)
{
 result=result+'5';
}
for(i=0;i<zero_count;i++)
{
 result=result+'0';
}
System.out.println("the number can be divisible by 90 is "+result);
}
}