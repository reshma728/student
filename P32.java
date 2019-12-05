import java.io.*;
import java.util.*;
class P32
{
  public static void main(String args[])
{
 int cnt=0,i;
 int[] a=new int[]{1,2,9,4,5,7,8};
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the value to search");
 int n=sc.nextInt();
 for( i=0  ;i<a.length;i++)
{
 if(a[i]==n)
{
  System.out.println(i+1);
  cnt++;
}
}
if(cnt!=1)
System.out.println(-1);
}
}
