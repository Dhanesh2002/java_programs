import java.util.*;
class zoho_qn_7{
public static void main(String args[])
{
int row,col,v=7,tmp,flag;
for(col=1;col<=v;col++){
    tmp=1;
    flag=0;
for(row=1;row<=col;row++)
{ 
 System.out.print(tmp);
 tmp++;
}
tmp=col-1;
for(row=1;row<col;row++)
{ 
 System.out.print(tmp);
 tmp--;
}
System.out.println();
}
}
}