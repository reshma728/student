import java.io.*;
import java.util.*;
class Patient
{
 public double Bmi(String n,double h,double w)
{
 String n1=n;
 double h1=h;
 double w1=w;
 double m=(w1/(h1*h1)*703);
 return m;
 }
}
class P43
{
 public static  void main(String args[])
{
  Patient p=new Patient();
  String n="ramu";
  double h=6.5;
  double w=65.5;
 double k= p.Bmi(n,h,w);
 System.out.println("bmi is:"+k);
}
}