import java.util.*;
class P19
{
 public static void main(String args[])
{ 
  int j,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int i=sc.nextInt();
 
  while(i>0)
{
   int r=i%10;
    i=i/10;
   sum=sum+r;
}
System.out.println("sum is"+sum);
}
}