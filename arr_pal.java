import java.util.*;
class arr_pal
{
    void pal(int t)
    {
        int n=t;
        int sum=0,tmp;
    while(n>0)
{
  tmp=n%10;
  sum=(sum*10)+tmp;
 n=n/10;
}
if(t==sum)
System.out.println(t+" is apalindrome");
else
System.out.println(t+" not palindrome");
    }
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int arr_size;
System.out.println("enter array size:");
arr_size=sc.nextInt();
int i;
int[] arr=new int[arr_size];
for(i=0;i<arr_size;i++)
{
System.out.println("enter "+(i+1)+"th number");
arr[i]=sc.nextInt();
}
arr_pal m= new arr_pal();
for(i=0;i<arr_size;i++)
{
 m.pal(arr[i]);
}

}
}