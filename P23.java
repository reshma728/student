import java.util.*;
import java.io.*;
class P23
{
 public static void main(String args[])
{
 int i,j,cnt=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the n value");
 int n=sc.nextInt();

  for(i=1;i<n;i++)
 {
 if(i%2==0&&i%3==0&&i%5==0)
 {  
   cnt++;
  System.out.println("i="+i);
}
if(cnt==5)
break;
}

}
}