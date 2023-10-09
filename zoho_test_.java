import java.util.*;
class zoho_test_
{
public static void main(String args[])
{
  int arr[]={1,1,2,2,2,4,5,5,5,10,22};
  int row,val=arr[0],count=1;
  for(row=1;row<arr.length;row++)
  {
     if(val!=arr[row])
     {
     if(count>1)
      System.out.println(val+"->"+count);
      val=arr[row];
      count=1;
    }
    else
     count++;
     
  }
}
}