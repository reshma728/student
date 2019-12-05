import java.io.*;
import java.util.*;
class P17
{
 public static void main(String args[])
{ 
  int i,j,cnt=0;
 for(i=10;i<=99;i++)
{
 for(j=1;j<=i;j++)
{
 if(i%j==0)
 cnt++;
 }
if(cnt==2)
System.out.println("prime number is"+i);
cnt=0;
}
}
}
