import java.util.*;
import java.io.*;
class P24
{
 public static void main(String args[])
{
 int i,j,cnt=1,a,b,c;
 Scanner sc=new Scanner(System.in);
while(cnt>=1)
{
 System.out.println("enter the options 1.add\n 2.sub");
 int n=sc.nextInt();
switch(n)
{
 case 1:
       System.out.println("enter the two value"); 
        a=sc.nextInt();
         b=sc.nextInt();
         c=a+b;
        System.out.println(c);
      break;
        
 case 2: 
       System.out.println("enter the two value"); 
         a=sc.nextInt();
          b=sc.nextInt();
          c=a-b;
         System.out.println(c);
break;
 default:
         System.out.println("invalid");
}
 System.out.println("enter the Yif u want to continue");
         char ch=sc.next().charAt(0);
         if(ch=='Y'||ch=='y')
         cnt++;
         else
         cnt--;
}
}
}