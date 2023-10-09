import java.util.*;
class sum_of_num
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
 sum=sum+tmp;
 n=n/10;
}
System.out.println(sum);
}
}