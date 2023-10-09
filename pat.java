import java.util.*;
public class pat
{
    public static void main(String args[])
    {
    String s="PROGRAM";
    //System.out.println(s);
    int l,m,p;
    l=s.length();
    System.out.println(l);
    m=l/2;
    p=m;
    for(int i=1;i<=l;i++)
    {
        p=m;
        for(int j=1;j<=l;j++)
        {
         
         if((i+j)>l)
         {
          
          System.out.print(s.charAt(p));
          p++;
          if(p==l)
           p=1;
                
           
        }
         else
          System.out.print(" ");
          
          
    }
    System.out.println();
    }
    }

}