import java.io.*;
import java.util.*;
class P18
{
 public static void main(String args[])
{ 
  int j,cnt=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int i=sc.nextInt();
 
  for(j=1;j<=i;j++)
{
 if(i%j==0)
 cnt++;
}
if(cnt==2)
System.out.println(i+"is prime number");
else if(cnt>2)
System.out.println(i+"is notprime number");
else if(i==1||i==0)
System.out.println(i+"is neither prime nor composite number");
else 
System.out.println("please enter an integer number");
cnt=0;

}
}