import java.util.*;
public class zoho_qn_4{
public static void main(String args[]){
System.out.println("enter the array of size");
Scanner sc=new Scanner(System.in);
int arr_size=sc.nextInt();
int[] arr= new int[arr_size];
int arr_sum=0,i,diff,first_num,last_num;
for(i=0;i<arr_size;i++)
{
    System.out.println("enter the "+(i+1)+"th element");
    arr[i]=sc.nextInt();
    arr_sum =arr_sum+arr[i];
}
first_num=arr[0];
last_num=arr[0];
for(i=1;i<arr_size;i++)
{
    if(arr[i]>last_num)
     last_num=arr[i];
    if(arr[i]<first_num)
     first_num=arr[i];
}
diff=((last_num-first_num)/(arr_size));
//int sum=((arr_size+1)/2)*((first_num*2)+(arr_size)*diff);
int sum=((first_num+last_num)*(arr_size+1))/2;
int missing=sum-arr_sum;
System.out.println("fn-"+first_num+"ln-"+last_num+"  diff="+diff+"arr_sum"+arr_sum);
System.out.println("missing"+missing);
}
}