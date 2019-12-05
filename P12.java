import java.io.*;
import java.util.*;
class P12
{
 public static void main(String args[])
{  
  char ch;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the character");
 ch=sc.next().charAt(0);

  if(ch>=65&&ch<=90)
{
   
  System.out.println(Character.toLowerCase(ch));
}
else
 System.out.println(Character.toUpperCase(ch));
}
}