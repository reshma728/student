import java.io.*;
import java.util.*;
class P6
{
  public static void main(String args[])
{  
   int i;
   if(args.length>0)
 {
   for( i=0;i<args.length;i++)
   System.out.print(args[i] + ",");      
   }
 else
System.out.println("No values");
//System.out.println(args.length);
  }
 } 