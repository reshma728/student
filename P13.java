import java.io.*;
import java.util.*;
class P13
{
 public static void main(String args[])
{ 
  int ch;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the code r=0,b=1,g=2,o=3,w=4");
  ch=sc.nextInt();
switch(ch)
{
 case 0:System.out.println("Red");
     break;
 case 1:System.out.println("Blue");
     break;
case 2:System.out.println("GReen");
     break;
case 3:System.out.println("Orange");
     break;
case 4 :System.out.println("White");
     break;
default  :System.out.println("in valid");
     }

}
}