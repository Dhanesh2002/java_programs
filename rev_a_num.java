import java.util.*;
class rev_a_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
int n=sc.nextInt();
int sum=0;
while(n>0)
{
 int tmp=n%10;
 sum=(sum*10)+tmp;
 n=n/10;
}
System.out.println(sum);
}
}