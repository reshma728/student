import java.util.*;
import java.io.*;
class P21
{
 public static void main(String args[])
{
 int i,j,n,t=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 n=sc.nextInt();
 while(n>0)
{
  int r=n%10;
   n=n/10;
   t=t*10+r;
}System.out.println(t);
}
}