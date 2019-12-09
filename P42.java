import java.io.*;
import java.util.*;
import java.lang.*;
class Calculator
{
 public static long powerInt(int num1,int num2)
{
 int k=num1;
 int l=num2;
 long p=(long)Math.pow(num1,num2);
 return p;
}
 public static double powerDouble(double num1,int num2)
{
 double k1=num1;
 int k2=num2;
 double p1=Math.pow(num1,num2);
 return p1;
}
}
class P42
{
 public static void main(String args[])
{
 Calculator c=new Calculator();
  long m=c.powerInt(10,20);
  double n=c.powerDouble(10.56,20);
  System.out.println("m="+m);
  System.out.println("n="+n);
}
}
  
 