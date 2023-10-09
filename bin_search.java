import java.util.*;
class bin_search{
public static void main(String args[])
{
int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
System.out.println("enter key:");
Scanner sc=new Scanner(System.in);
int key=sc.nextInt();
int arr_len=arr.length;
int front=0,rear=arr_len-1;
while(front<rear)
{
    int mid=(front+rear)/2;
    if(key==arr[front] )
    {
     System.out.println("element found at index "+front);
     return;
    }
    else if(key==arr[front] )
    {
     System.out.println("element found at index "+rear);
     return;
    }
    else
    {
     if(arr[mid]==key)
     {
        System.out.println("element found at index "+mid);
        return;
     }
     else if(key>arr[mid])
       front=mid+1;
     else
       rear=mid-1;
    
    }
}
System.out.println("element not found");
}
}