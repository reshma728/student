import java.io.*;
import java.util.*;
class P11
{
 public static void main(String args[])
{ 
  String g=args[0];
  int age=Integer.parseInt(args[1]);
 if(g.equals("female")&&(age>=1&&age<=58))
 System.out.println("8.2%");
 else if(g.equals("female")&&(age>=59&&age<=120))
 System.out.println("7.6%");
 else if(g.equals("male")&&(age>=1&&age<=60))
 System.out.println("9.2%");
else if(g.equals("male")&&(age>=61&&age<=120))
 System.out.println("8.3%");
else
System.out.println("not valid");
}
}
