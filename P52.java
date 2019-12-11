class Person
{
public void person()
{
int id;
String name;
}
}
class Student extends Person
{
public void person()
{
int id=30780;
String name="teju";
}
}
class CollegeStudent extends Student
{
public void person(int y,String g)
{
int year=y;
String group=g;
int id=30780;
 String name="teju";
System.out.print(year+"\n");
System.out.print(group+"\n");
System.out.print(id+"\n");
System.out.print(name+"\n");
}
}
class Teacher extends Person
{
public void teacher(float s,String b)
{
float sal=s;
String sub=b;
int id=3251;
String name="Reshu";
System.out.print(id+"\n");
System.out.print(name+"\n");
System.out.print(sal+"\n");
System.out.print(sub+"\n");
}
}
class P52
{
public static void main(String[] args)
{
CollegeStudent c= new CollegeStudent();
c.person(2,"Electrical Engineering");
Teacher t= new Teacher();
t.teacher(50000,"computer science");
}
}