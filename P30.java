import java.io.*;
import java.util.*;
class P30
{
 public static void main(String args[])
{
  int sum=0;
  int[] arr=new int[10];
  for(int i=0;i<arr.length;i++)
  {
     sum=sum+i;
     System.out.println("sum="+sum);
     
  }
    System.out.println("average is="+sum/arr.length);
}
}