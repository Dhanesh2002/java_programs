import java.util.*;
class amstrong_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
int n=sc.nextInt();
int sum=0;
int power=0;
int t=n;
while(t>0)
{
power++;
t=t/10;
}
System.out.println("no.of.digit"+power);
t=n;
while(t>0)
{
 int tmp=t%10;
 sum=(int)Math.pow(tmp,power)+sum;
 t=t/10;
}
System.out.println("sum"+sum);
if(n==sum)
System.out.println("amstrong number");
else
System.out.println("Not amstrong number");
}
}