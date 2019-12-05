import java.io.*;
import java.util.*;
class P14
{
 public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
 System.out.println("enter the code");
 int ch=sc.nextInt();
switch(ch)
{
 case 0:System.out.println("january");
     break;
 case 1:System.out.println("feb");
     break;
case 2:System.out.println("march");
     break;
case 3:System.out.println("april");
     break;
case 4 :System.out.println("may");
     break;
case 5:System.out.println("jun");
     break;
case 6 :System.out.println("jul");
     break;
case 7 :System.out.println("aug");
     break;
case 8 :System.out.println("sep");
     break;
case 9 :System.out.println("oct");
     break;
case 10 :System.out.println("nov");
     break;
case 11 :System.out.println("dec");
     break;

default  :System.out.println("in valid");
     }
}
}
  