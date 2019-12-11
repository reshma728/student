import java.io.*;
import java.util.*;
class Author
{
 private String name;
 private String g;
 private String gen;
 public Author(String n,String gm, String gen)
{
 this.name=n;
 this.g=gm;
 this.gen=gen;
}
}
class Book
{
  private String name;
  private double price;
  private Author a;
   private int qty;
 public Book(String Name,Author a)
{
 this.name=name;
 //this.price=price;
 this.a=a;
 //this.qty=qty;
}
public String getname()
{
 return name;
}
public Author getAuthor()
{
 return a;
}
public double getPrice()
{
 return price;
}
public void setprice(double price)
{
 this.price=price;
}
public int getQtyInStock()
{
  return qty;
}
public void setQtyInStock()
{
 this.qty=qty;
}
}
class P51
{
 public static void main(String args[])
{
 Author c=new Author();
  c.Author("reshu","gyxhdsh@gmail.com","f");
  Book b=new Book();
  b.Book("poorvaja",c);
  b.setprice(20);
  b.setqty(200);
System.out.println("name is:"+b.getname());
System.out.println("author is:"+b.getAuthor());
}
}

 
