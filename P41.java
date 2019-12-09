import java.io.*;
import java.util.*;
class Boxdemo
{
 
public double  dimensions(int w,int h,double d)
{
  int p=w;
  int q=h;
  double r=d;
  double v;
  v=p*q*r;
  return v;
}
}
class P41
{
 public static void main(String args[])
{
   int w=10;
   int h=20;
   double d=12.9;
  Boxdemo b=new Boxdemo();
   double k;
  k=b.dimensions(w,h,d);
  System.out.println("your volume is:"+k);
}
}
