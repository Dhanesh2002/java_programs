import java.util.*;
public class bintodec
{
 
public static void main(String args[])
{
    int n,t,r,c=1,p=1;
    
    System.out.println("enter the num");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    r=n%10;
    n=n/10;
while(n>0)
{
    t=n%10;
    int a=add(p,c);
    t=t*a;
    r=r+t;
    n=n/10;
    c++;
}
System.out.println(r);
} 
static int s;

static int add(int pow, int occ)
{
    if(occ==0){
        s=pow;
        return 0;
    }
    else
    {
        pow*=2;
        add(pow,--occ);
    }
        
     return s;
  
  
}

static int bin2deci(int n,int mul){
    if(n==0)
    return 0;
    int rem=n%10;
    rem=rem*mul;
    return bin2deci(n/10,mul*2)+rem;
}
}
}