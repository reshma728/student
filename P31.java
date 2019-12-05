import java.io.*;
import java.util.*;
class P31
{
  public static void main(String args[])
{
  int min,max;
  int[] a=new int[]{2,8,9,3,0,5};
  min=a[0];
  max=a[0];
  for(int i=1;i<a.length;i++)
 {
  if(min>a[i])
   min=a[i];
  if(max<a[i])
  max=a[i];
 }
 System.out.println("min is"+min); 
System.out.println("max is"+max);
}
}
 