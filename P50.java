import java.io.*;
import java.util.*;
 abstract class Animal
{
      void eat()
{
}
     void sleep(){}
}
class Bird extends Animal
{
 void eat()
{
 System.out.println("i am in eat method");
}
void sleep()
{
 System.out.println("i am in sleep method ");
}
void fly()
{
System.out.println("i am in fly method");
}
}
class P50
{
 public static void main(String args[])
 {
    Bird b=new Bird();
     b.sleep();
     b.eat();
     b.fly();
}
}
   